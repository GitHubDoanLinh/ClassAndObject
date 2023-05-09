import java.util.Scanner;

public class QuadraticEquation {
    int a, b, c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = b * b - (4 * a * c);
        return delta;
    }

    public double getRoot1() {
        double x1 = (-b + Math.pow(getDiscriminant(),0.5)) / (2 * a);
        return x1;
    }

    public double getRoot2() {
        double x2 = (-b - Math.pow(getDiscriminant(),0.5)) / (2 * a);
        return x2;
    }

    public static void main(String[] args) {
        System.out.print("Nhập vào hệ số a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào hệ số b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào hệ số c: ");
        int c = new Scanner(System.in).nextInt();
        if (a == 0) {
            if (b == 0 & c == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else if (b == 0 && c != 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (b != 0 && c == 0) {
                System.out.println("Phương trình có nghiệm x=0");
            } else {
                System.out.println("Phương trình có nghiệm x = " + (-c / b));
            }
        } else {
            QuadraticEquation obj = new QuadraticEquation(a, b, c);
            if (obj.getDiscriminant() > 0) {
                System.out.println("Phương trình có 2 nghiệm phân biêt x1 = "+obj.getRoot1()+ "; x2 = "+obj.getRoot2());
            } else if (obj.getDiscriminant()<0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có nghiệm kép x = "+(-b/(2*a)));
            }
        }

    }
}
