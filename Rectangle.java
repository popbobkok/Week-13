
public class Rectangle extends arbitrary {

    double w, h;

    public void setValue(double w, double h) {
        this.w = w;
        this.h = h;
    };

    public double getArea() {
        double area = w * h;

        System.out.println("Rectangle area : " + area);
        return 0;
    }

}
