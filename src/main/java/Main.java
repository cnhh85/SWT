import java.util.Date;

public class Main {
    public static void main(String args[]) {

    }

    public int dateInMonth(int month, int year) {
        int result = 0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result =  31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 2:
                if (year % 400 == 0) {
                    result = 29;
                    break;
                } else if (year % 100 == 0) {
                    result = 28;
                    break;
                } else if (year % 4 == 0) {
                    result = 29;
                    break;
                } else {
                    result = 28;
                    break;
                }
            default:
                result = 0;
        }
        return result;
    }

    public boolean checkDate(int day, int month, int year) {
        if (month >= 1 && month <= 12) {
            if (day >= 1) {
                if (day <= dateInMonth(month, year)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
