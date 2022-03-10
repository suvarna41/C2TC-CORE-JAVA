package day3;

class A{    //super class/parent/base
	public A()
	{
		
	}
	public void m1() {  
		System.out.println("Hello Everyone!!");
	}
}
class B extends A{ //sub class/child/derived
	public void m2() {
		System.out.println("Welcome to C2TC");
	}
	public void m1(){
		System.out.println("Good Morning!!");
	}
	public void m1(String s) {
		System.out.println(s);
	}
}
class D{
	public D(){
		
	}
	public void m1() { //super class/parent/base
		System.out.println("Hello Everyone!!");
	}
}
public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a,a1;
        B b;
        //a = new A();
        a=new A();
        //a1 = new A();  //instantiating the object
        b=new B();
        a1=a;
        a1.m1();//Hello Everyone!!
        a1=b;
        b.m1();//good morning
        a1.m1();//good morning
        //a1.m2();
        D d = new D();
        d.m1(); //Hello Everyone!!
	}

}