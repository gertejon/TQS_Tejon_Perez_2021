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

    public boolean setDate(int d, int m, int y) { //returns True --> valid date / returns False --> not valid date
        return false;
    }
}
