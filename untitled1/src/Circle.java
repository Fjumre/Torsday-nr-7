

public class Circle {


    double radius = 10;
    double diameter = radius*2;
    double Area;
    private static double π = 3.1415926535897;

    public Circle(double newCircle) {
        this.radius = newCircle;
    }

public void Area(){
        Area = π * diameter;

        System.out.println("Cirklens areal er " + Area);
    }
}


