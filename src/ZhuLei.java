
public class ZhuLei {

	public static void main(String[] args)
	{
		Book bookA = new Book();
		Book bookB =new Book();
		bookA.title ="Javaѧϰ";
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
		System.out.println("���������;"+title+"��ļ۸���"+price+"\n");
	}
	}

