package CalendarProject;

public class Date {
    private int dd;
    private int mm;
    private int yy;

    public int getDd() {
        return dd;
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

    public boolean esTraspas(int year) {
        if(year % 400 == 0 || year % 4 == 0)
            return true;
        return false;
    }

    public int daysMonth(int month, int year) {
        int diesMes = 0;
        boolean T = esTraspas(year);

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        else {
            if (month != 2)
                return 30;
        }
        if(T == true)
            return 29;
        else
            return 28;
    }

    public boolean setDate(int d, int m, int y) { //returns True --> valid date / returns False --> not valid date
        if(m > 0 && m < 13) {
            int daysLimit = daysMonth(m, y);
            if(d > 0 && d <= daysLimit) {
                setDd(d);
                setMm(m);
                setYy(y);
                return true;
            }
        }

        return false;
    }
}
