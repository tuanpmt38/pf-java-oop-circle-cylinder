public class CircleTest {
    public static void main(String[] args) {
//        Circle circle = new Circle(1.0 ,"green");
//        System.out.println(circle);
//        System.out.println("Area Circle is: "+circle.getArea());
        Cylinder cylinder = new Cylinder(5.0,"red",2.0);
        System.out.println(cylinder);
        System.out.println("The volume Cylinder:"+cylinder.getVolume());
    }
}
