package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PolyClassTest {

    @Test
    void getMax_points() {
        PolyClass polyClass = new PolyClass(50, 5, 5);
        assertEquals(50, polyClass.getMax_points());
    }

    @Test
    void setMax_points() {
        PolyClass polyClass = new PolyClass(50, 5, 5);
        polyClass.setMax_points(50);
        assertEquals(50, polyClass.getMax_points());
    }

    @Test
    void getCircle_width() {
        PolyClass polyClass = new PolyClass(50, 5, 5);
        assertEquals(5, polyClass.getCircle_width());
    }

    @Test
    void setCircle_width() {
        PolyClass polyClass = new PolyClass(50, 5, 5);
        polyClass.setCircle_width(5);
        assertEquals(5, polyClass.getCircle_width());
    }

    @Test
    void getLine_width() {
        PolyClass polyClass = new PolyClass(50, 5, 5);
        assertEquals(5, polyClass.getLine_width());
    }

    @Test
    void setLine_width() {
        PolyClass polyClass = new PolyClass(50, 5, 5);
        polyClass.setLine_width(5);
        assertEquals(5, polyClass.getLine_width());
    }
}