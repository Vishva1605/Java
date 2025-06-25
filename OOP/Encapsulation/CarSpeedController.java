package Encapsulation;
class Car{
    private int speed;

    public Car(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    //method
    void accelaration(int amount){
        speed += amount;
        System.out.printf("speed has been increased by %d car speed %d%n",amount,speed);
    }
    void brake(int amount){
        if(speed>=amount){
            speed -= amount;
            System.out.printf("speed has been decreased by %d car speed %d%n",amount,speed);
        }else{
            speed = 0;
            System.out.println("Speed has been decreased to 0 car speed "+speed);
        }
    }
}
public class CarSpeedController {
    public static void main(String[] args) {
        Car c1 = new Car(80);

        c1.accelaration(30);
        c1.brake(20);
        c1.brake(91);
    }
}
