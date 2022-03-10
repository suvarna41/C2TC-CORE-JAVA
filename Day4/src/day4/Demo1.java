package day4;

class Car {
	public int gear, speed;
	boolean clutch, brk, accelerator;
	public void start() {
		
	}
	public void stop() {
		
	}
	public void setSpeed(int i)
	{
		speed = i;
	}
	public int getSpeed() {
		return speed;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c1,c2;
        c1 = new Car();
        c2 = new Car();
        c1.setSpeed(100);
        c1.speed=100;
        c2.speed=200;
        c2.setSpeed(200);
        //System.out.println(c1.getSpeed);
        System.out.println(c1.speed);
        System.out.println(c2.speed);
	}

}
