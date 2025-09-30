class Car{
    String color;
    int speed;
    void run(){
        System.out.println("the " + color + " car is running at " + speed + " km/hr");
    }
    void stop(){
        System.out.println("the " + color + " car has stopped");
    }
}
public class CarExample {
    public static void main(String[] args){
        Car myBlue = new Car();
        myBlue.color = "blue";
        myBlue.speed = 60; 
        myBlue.run();
        myBlue.stop();
        Car myRed = new Car();
        myRed.color = "red";
        myRed.speed = 80;
        myRed.run();
        myRed.stop();
        System.out.println("race time");
        myBlue.run();
        myRed.run();
    }
}
