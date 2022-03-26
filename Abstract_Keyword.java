package day11;

abstract class A {
	static int c;
	final int i=10;
	private int d;
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	void m1()
	{
		System.out.println("Hello");
	}
	abstract void m2();
}
class B extends A {
	void m2()
	{
		System.out.println("Hi");
	}
}

public class Abstract_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b = new B();
        b.m1();
        b.m2();
        b.setD(15);
        System.out.println(b.getD());
	}

}
