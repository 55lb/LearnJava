
public class LeiTest {
	
	
		public static void main (String[] args)
		{
			PersonB p1 = new PersonB();
			p1.name ="张三";
			p1.age =25;
			p1.talk(30);
		
			
		}
}
		class PersonB{
			String name;
			int age;
		
		  void talk(int age){
			System.out.println("我是："+name+",我的年龄是："+age+"岁。");
			return;
		}
		
		}

