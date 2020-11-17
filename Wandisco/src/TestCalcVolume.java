import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalcVolume {

    int testValue1 = 1;
    int testValue5 = 5;

    @Test
    public void sphereTest() {
        Sphere s1 = new Sphere(testValue1);
        Sphere s5 = new Sphere(testValue5);

        assertEquals("4.19", s1.getVolume(), "The Volume of a Sphere, of radius " + s1.radius + " should be 4.19");
        assertEquals("523.60", s5.getVolume(), "The Volume of a Sphere, of radius " + s5.radius + " should be 523.60");
    }

    @Test
    public void cubeTest() {
        Cube c1 = new Cube(testValue1);
        Cube c5 = new Cube(testValue5);

        assertEquals("1.00", c1.getVolume(), "The volume of a cube, of radius " + c1.width + " should be 1");
        assertEquals("125.00", c5.getVolume(), "The volume of a cube, of radius " + c5.width + " should be 125");
    }

    @Test
    public void tetrahedronTest() {
        Tetrahedron t1 = new Tetrahedron(testValue1);
        Tetrahedron t5 = new Tetrahedron(testValue5);

        assertEquals("0.12", t1.getVolume(), "The volume of a tetrahedron, of edge " + t1.edge + " should be 0.12");
        assertEquals("14.73", t5.getVolume(), "The volume of a tetrahedron, of edge " + t5.edge + " should be 14.73");
    }
}
