public class Circle {
    public static final double PI=3.14;
    private static double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){

    }


    public static void area(double radius){
        double area=PI*(radius*radius);
        System.out.println("area: "+area);
    }
    public static void circumference(double radius){
        double circumference=PI*2*radius;
        System.out.println("circumference: "+circumference);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
