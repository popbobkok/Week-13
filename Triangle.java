
public class Triangle extends arbitrary {
    double b, h;

    public void setValue(double b, double h) {
        this.b = b;
        this.h = h;
    };

    public double getArea() {
        double temp = 0.5, area = (b * h);
        area = area * temp;
        System.out.println("Triangle area : " + area);
        return 0;
    }

}
