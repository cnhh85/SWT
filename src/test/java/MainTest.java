import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void UTCID01() {
        assertEquals(31, Main.dateInMonth(1, 2020));
    }
    @Test
    void UTCID02() {
        assertEquals(29, Main.dateInMonth(2, 2020));
    }
    @Test
    void UTCID03() {
        assertEquals(31, Main.dateInMonth(3, 2020));
    }
    @Test
    void UTCID04() {
        assertEquals(30, Main.dateInMonth(4, 2020));
    }
    @Test
    void UTCID05() {
        assertEquals(31, Main.dateInMonth(5, 2020));
    }
    @Test
    void UTCID06() {
        assertEquals(30, Main.dateInMonth(6, 2020));
    }
    @Test
    void UTCID07() {
        assertEquals(31, Main.dateInMonth(7, 2020));
    }
    @Test
    void UTCID08() {
        assertEquals(31, Main.dateInMonth(8, 2020));
    }
    @Test
    void UTCID09() {
        assertEquals(30, Main.dateInMonth(9, 2020));
    }
    @Test
    void UTCID10() {
        assertEquals(31, Main.dateInMonth(10, 2020));
    }
    @Test
    void UTCID11() {
        assertEquals(30, Main.dateInMonth(11, 2020));
    }
    @Test
    void UTCID12() {
        assertEquals(31, Main.dateInMonth(12, 2020));
    }
    @Test
    void UTCID13() {
        assertEquals(0, Main.dateInMonth(0, 2020));
    }
    @Test
    void UTCID14() {
        assertEquals(0, Main.dateInMonth(13, 2020));
    }
    @Test
    void UTCID15() {
        assertEquals(28, Main.dateInMonth(2, 2022));
    }
    @Test
    void UTCID16() {
        assertEquals(0, Main.dateInMonth(1, 10));
    }
    @Test
    void UTCID17() {
        assertEquals(0, Main.dateInMonth(1, 4000));
    }

}