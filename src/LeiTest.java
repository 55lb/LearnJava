
public class LeiTest {
	
	
		public static void main (String[] args)
		{
			PersonB p1 = new PersonB();
			p1.name ="����";
			p1.age =25;
			p1.talk(30);
		
			
		}
}
		class PersonB{
			String name;
			int age;
		
		  void talk(int age){
			System.out.println("���ǣ�"+name+",�ҵ������ǣ�"+age+"�ꡣ");
			return;
		}
		
		}

