public class Fan {
    public int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed  = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }

//    public Fan(){
//
//    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        if(fan1.getOn())
        {
            System.out.println("speed = "+fan1.getSpeed() + ", the color is "+fan1.getColor()+", with "+fan1.getRadius()+"radius and fan is on");
        }

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        if(!fan2.getOn()){
            System.out.println("speed = "+fan2.getSpeed() + ", the color is "+fan2.getColor()+", with "+fan2.getRadius()+"radius and fan is off");
        }


    }
//    public String toString(){
//        return speed + color + radius +""
//
//    }
}
