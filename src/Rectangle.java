import java.util.Scanner;

public class Rectangle {
    int width;
    int height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }

    public static void main(String[] args) {
        System.out.print("Nhập vào chiều cao: ");
        int h = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào chiều rộng: ");
        int w = new Scanner(System.in).nextInt();
        Rectangle hcn = new Rectangle(h,w);
        System.out.println("Diện tích hình chữ nhật với chiều dài = "+h+" chiều rộng = "+w+" : "+hcn.getArea());
        System.out.println("Chu vi hình chữ nhật với chiều dài = "+h+" chiều rộng = "+w+" : "+hcn.getPerimeter());
    }
}
