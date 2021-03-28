
public class Circle extends arbitrary {

    double r;

    public void setValue(double r) {
        this.r = r;

    };

    public double getArea() {
        double area, temp = r * r, pie = 3.14;
        area = temp * pie;

        System.out.println("Circle area : " + area);
        return 0;
    }

}
