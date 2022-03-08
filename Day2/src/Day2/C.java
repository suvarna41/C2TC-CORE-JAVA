package Day2;

class A {  //super class
	public void m1() {
		System.out.println("Hello Everyone!!!");
	}
}
class B extends A{ //sub class
	public void m2() {
		System.out.println("Welcome to C2TC Training");
	}
	public void m1() {  //overriding
		System.out.println("Day 2");
	}
	public void area(int l, int f) {
		//length and breadth of area
		int a = 0;
		a = l * f;
		System.out.println("The Area of length and breadth is : "+a);
	}
	public void area(int lt, int b, int ar) {
	    //breadth of a rectangle
		b = ar / lt;
		System.out.println("The breadth of a rectangle is : "+b);
	}
}
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a = new A();
       B b = new B();
       b.m2();
       b.m1();
       b.area(2, 4);
       b.area(2, 0, 6);
        
	}
}



