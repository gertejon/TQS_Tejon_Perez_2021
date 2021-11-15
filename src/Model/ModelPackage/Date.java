package ModelPackage;

public class Date {
    private int dd;
    private int mm;
    private int yy;

    public int getDd() {
        return dd;
    }

    public Date(int d, int m, int y) {
        boolean valid = setDate(d, m, y);
    }

    public Date() {
        dd = 0;
        mm = 0;
        yy = 0;
    }
    public boolean separator(char c) {
        return (c == '/');
    }

    public Date(String date) {

    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

   public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

    public boolean year400(int year) {
        boolean yes = false;
        if(year%400 == 0) {
            yes = true;
        }
        return yes;
    }

    public boolean year4(int year) {
        boolean yes = false;
        if(year%4 == 0) {
            yes = true;
        }
        return yes;
    }

    public boolean esTraspas(int year) {
        boolean traspas = false;
        if(year400(year) || year4(year))
            traspas = true;
        return traspas;
    }

    public String toString() {
        String date = dd + "/" + mm + "/" + yy;

        return date;
    }

    public boolean month31(int month) {
        boolean is31 = false;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            is31 = true;
        }
        return is31;
    }

    public boolean february(int m) {
        boolean isFebruary = false;
        if (m == 2) {
            isFebruary = true;
        }
        return isFebruary;
    }

    public boolean validMonth(int m) {
        boolean res = false;
        if (m>0 && m<13) {
            res = true;
        }
        return res;
    }

    public boolean validDay(int day, int limitDay) {
        boolean res = false;
        if(day > 0 && day <= limitDay) {
            res = true;
        }
        return res;
    }

    public int daysMonth(int month, int year) {
        int daysMonth;
        if(month31(month)) {
            daysMonth = 31;
        }
        else {
            if (!february(month))
                daysMonth =  30;
            else {
                if(esTraspas(year))
                    daysMonth = 29;
                else
                    daysMonth = 28;
            }
        }
        return daysMonth;
    }

    public boolean setDate(int d, int m, int y) { //returns True --> valid date / returns False --> not valid date
        boolean valid = false;
        if(validMonth(m)) {
            int daysLimit = daysMonth(m, y);
            if(validDay(d, daysLimit)) {
                setDd(d);
                setMm(m);
                setYy(y);
                valid = true;
            }
        }
        /* ------------- This must be implemented in VIEW --------------------
        System.out.println("Date is not valid");
        */
        return valid;

    }
}
