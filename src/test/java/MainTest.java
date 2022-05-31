import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void dateInMonthUTCID01() {
        assertEquals(31, Main.dateInMonth(1, 2020));
    }

    @Test
    void dateInMonthUTCID02() {
        assertEquals(29, Main.dateInMonth(2, 2020));
    }

    @Test
    void dateInMonthUTCID03() {
        assertEquals(31, Main.dateInMonth(3, 2020));
    }

    @Test
    void dateInMonthUTCID04() {
        assertEquals(30, Main.dateInMonth(4, 2020));
    }

    @Test
    void dateInMonthUTCID05() {
        assertEquals(31, Main.dateInMonth(5, 2020));
    }

    @Test
    void dateInMonthUTCID06() {
        assertEquals(30, Main.dateInMonth(6, 2020));
    }

    @Test
    void dateInMonthUTCID07() {
        assertEquals(31, Main.dateInMonth(7, 2020));
    }

    @Test
    void dateInMonthUTCID08() {
        assertEquals(31, Main.dateInMonth(8, 2020));
    }

    @Test
    void dateInMonthUTCID09() {
        assertEquals(30, Main.dateInMonth(9, 2020));
    }

    @Test
    void dateInMonthUTCID10() {
        assertEquals(31, Main.dateInMonth(10, 2020));
    }

    @Test
    void dateInMonthUTCID11() {
        assertEquals(30, Main.dateInMonth(11, 2020));
    }

    @Test
    void dateInMonthUTCID12() {
        assertEquals(31, Main.dateInMonth(12, 2020));
    }

    @Test
    void dateInMonthUTCID13() {
        assertEquals(0, Main.dateInMonth(0, 2020));
    }

    @Test
    void dateInMonthUTCID14() {
        assertEquals(0, Main.dateInMonth(13, 2020));
    }

    @Test
    void dateInMonthUTCID15() {
        assertEquals(28, Main.dateInMonth(2, 2022));
    }

    @Test
    void dateInMonthUTCID16() {
        assertEquals(31, Main.dateInMonth(1, 10));
    }

    @Test
    void dateInMonthUTCID17() {
        assertEquals(31, Main.dateInMonth(1, 4000));
    }

    @Test
    void checkDateUTCID01() {
        assertEquals(false, Main.checkDate(1, 0, 2000));
    }

    @Test
    void checkDateUTCID02() {
        assertEquals(false, Main.checkDate(1, 13, 2000));   //UTCID02
    }

    @Test
    void checkDateUTCID03() {
        assertEquals(true, Main.checkDate(29, 2, 2000));    //UTCID03
    }

    @Test
    void checkDateUTCID04() {
        assertEquals(false, Main.checkDate(29, 2, 2022));   //UTCID04
    }

    @Test
    void checkDateUTCID05() {
        assertEquals(false, Main.checkDate(0, 1, 2000));      //UTCID05
    }

    @Test
    void checkDateUTCID06() {
        assertEquals(false, Main.checkDate(32, 1, 2000));      //UTCID06
    }

    @Test
    void checkDateUTCID07() {
        assertEquals(false, Main.checkDate(31, 4, 2000));      //UTCID07
    }

    @Test
    void checkDateUTCID08() {
        assertEquals(false, Main.checkDate(31, 6, 2000));      //UTCID08
    }

    @Test
    void checkDateUTCID09() {
        assertEquals(false, Main.checkDate(31, 9, 2000));     //UTCID09
    }

    @Test
    void checkDateUTCID10() {
        assertEquals(false, Main.checkDate(31, 11, 2000));      //UTCID10
    }


    @Test
    void checkDateUTCID11() {
        assertEquals(true, Main.checkDate(30, 11, 3000));      //UTCID11
    }

    @Test
    void checkDateUTCID12() {
        assertEquals(true, Main.checkDate(30, 11, 1000));      //UTCID12
    }

    @Test
    void checkDateUTCID13() {
        assertEquals(true, Main.checkDate(1, 1, 2000));     //UTCID13
    }

    @Test
    void checkDateUTCID14() {
        assertEquals(true, Main.checkDate(31, 1, 2000));      //UTCID14
    }

    @Test
    void checkDateUTCID15() {
        assertEquals(true, Main.checkDate(1, 1, 2000));      //UTCID15
    }

    @Test
    void checkDateUTCID16() {
        assertEquals(true, Main.checkDate(1, 12, 2000));      //UTCID16
    }

    @Test
    void checkDateUTCID117() {
        assertEquals(false, Main.checkDate(30, 2, 2000));      //UTCID17}
    }

}