package Practise;

public class BookPress {
	
	
	public static void main(String[] args)
	{
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		b1.price=10;
		b1.getInfo();
		b2.title="Java学习";
		b2.getInfo();
		b3.pub="人民教育出版社";
		b3.getInfo();
	}
	
}
		class Book
		{
			String title;
			int price;
			String pub="天天精彩出版社";
			/**public Book()
			{
				String title;
				int price;
				String pub;
				
			}*/
			void getInfo()
			{
				System.out.println("我的书名是："+title+"书的价格是："+price+"出版社的名字是："+pub+"\n");
			}
			
		}

