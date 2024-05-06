class Complex {
    private int real, img;

    public Complex() {
        this(0, 0);
    }

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    public Complex add(Complex obj) {
        Complex res = new Complex();
        res.real = real + obj.real;
        res.img = img + obj.img;
        return res;
    }

    public void print() {
        System.out.println(real + " + i" + img);
    }
}

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 5);
        Complex c2 = new Complex(2, 4);
        Complex c3 = c1.add(c2);
        c3.print();
    }
}
