abstract class P1Abstract 
{
	abstract public void marks();

}
class demo extends P1Abstract
{
	public void marks()
	{
		System.out.println("Final exam Marks");
	}
	public static void main(String[] args) 
	{
		demo dm = new demo();
		dm.marks();
	}
}