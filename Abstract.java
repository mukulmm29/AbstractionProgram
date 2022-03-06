abstract class A {
	abstract public void a();
}	
class B extends A
{
	public void a() 
	{
		System.out.println("Hello");
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B mm = new B();
		mm.a();
	}

}