import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalcVolume {

    int testValue1 = 1;
    int testValue5 = 5;

    @Test
    public void sphereTest() {
        Sphere s = new Sphere(testValue1);
        Sphere s2 = new Sphere(testValue5);

        assertEquals("4.19", s.getVolume(), "The Volume of a Sphere, of radius " + s.radius + " should be 4.19");
        assertEquals("523.60", s2.getVolume(), "The Volume of a Sphere, of radius " + s2.radius + " should be 523.60");
    }

    @Test
    public void cubeTest() {
        Cube c = new Cube(testValue1);
        Cube c2 = new Cube(testValue5);

        assertEquals("1.00", c.getVolume(), "The volume of a cube, of radius " + c.width + " should be 1");
        assertEquals("125.00", c2.getVolume(), "The volume of a cube, of radius " + c2.width + " should be 125");
    }

    @Test
    public void tetrahedronTest() {
        Tetrahedron t = new Tetrahedron(testValue1);
        Tetrahedron t2 = new Tetrahedron(testValue5);

        assertEquals("0.12", t.getVolume(), "The volume of a tetrahedron, of edge " + t.edge + " should be 0.12");
        assertEquals("14.73", t2.getVolume(), "The volume of a tetrahedron, of edge " + t2.edge + " should be 14.73");
    }
}

