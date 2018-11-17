
public class ZhuLei {

	public static void main(String[] args)
	{
		Book bookA = new Book();
		Book bookB =new Book();
		bookA.title ="Java学习";
		bookA.price =50;
		bookB =bookA;
		bookA.printInfo();
		bookB.printInfo();
		
	}
}
	class Book
	{
	String title;
	int price;
	void printInfo()
	{
		System.out.println("我买的书是;"+title+"书的价格是"+price+"\n");
	}
	}

