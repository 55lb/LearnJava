package Practise;

public class BookPress {
	
	
	public static void main(String[] args)
	{
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		b1.price=10;
		b1.getInfo();
		b2.title="Javaѧϰ";
		b2.getInfo();
		b3.pub="�������������";
		b3.getInfo();
	}
	
}
		class Book
		{
			String title;
			int price;
			String pub="���쾫�ʳ�����";
			/**public Book()
			{
				String title;
				int price;
				String pub;
				
			}*/
			void getInfo()
			{
				System.out.println("�ҵ������ǣ�"+title+"��ļ۸��ǣ�"+price+"������������ǣ�"+pub+"\n");
			}
			
		}

