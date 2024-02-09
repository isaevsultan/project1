public class Triangle {


    double a;
    double b;
    double c;

    public Triangle (double a, double  b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;


    }

    public void multiplication() {
        double j = (a + b + c) / 2;
        double digit = Math.sqrt(j * (j - a) * (j - b) * (j - c));
        System.out.println("Area of a triangle:" + digit);
    }

}

