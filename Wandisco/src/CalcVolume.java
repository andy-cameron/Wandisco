import static java.lang.StrictMath.PI;

public class CalcVolume {
    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        Cube c = new Cube(5);
        Tetrahedron t = new Tetrahedron(5);

        System.out.println("Volume of a Sphere of radius " + s.radius + " = " + s.getVolume());
        System.out.println("Volume of a Cube of width " + c.width + " = " + c.getVolume());
        System.out.println("Volume of a Tetrahedron of edge " + t.edge + " = " + t.getVolume());
    }
}


class Sphere {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    String getVolume() {
        return String.format("%.2f", 4.0 / 3.0 * PI * (radius * radius * radius));
    }
}


class Cube {
    double width;

    Cube(double width) {
        this.width = width;
    }

    String getVolume() {
        return String.format("%.2f", width * width * width);
    }
}


class Tetrahedron {
    double edge;

    Tetrahedron(double edge) {
        this.edge = edge;
    }

    String getVolume() {
        return String.format("%.2f", ((edge * edge * edge) / (6 * Math.sqrt(2))));
    }
}