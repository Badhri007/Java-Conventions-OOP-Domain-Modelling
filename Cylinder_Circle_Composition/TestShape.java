public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println();
        System.out.println("Circle Details: " + circle.toString());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println();
        
        Cylinder defaultCylinder = new Cylinder();
        System.out.println("Default Cylinder Details: " + defaultCylinder.toString());
        System.out.println("Default Cylinder Volume: " + defaultCylinder.getVolume());
        System.out.println();
    
        Cylinder customCylinder = new Cylinder(3.0, 5.0);
        System.out.println("Custom Cylinder Details (radius 3, height 5): " + customCylinder.toString());
        System.out.println("Custom Cylinder Volume: " + customCylinder.getVolume());
        System.out.println();
        
        
        Cylinder coloredCylinder = new Cylinder(2.5, "green", 7.0);
        System.out.println("Custom Colored Cylinder Details: " + coloredCylinder.toString());
        System.out.println("Colored Cylinder Volume: " + coloredCylinder.getVolume());
        System.out.println();
        
        
        coloredCylinder.setRadius(4.0);
        coloredCylinder.setHeight(10.0);
        System.out.println("Modified Colored Cylinder Details: " + coloredCylinder.toString());
        System.out.println("Modified Colored Cylinder Volume: " + coloredCylinder.getVolume());
        System.out.println();
    }
}
