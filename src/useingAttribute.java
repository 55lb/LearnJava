
public class useingAttribute {
	
		static String str1 ="string1";
		static String str2;
		String str3;
		String str4;
		static
		{
			printStatic("before static");
			str2 ="string2";
			printStatic("after static");
			
		}
		public static void printStatic(String title)
		{
			System.out.println("--"+title+"--");
			System.out.println("str1\n"+str1+"--");
			System.out.println("str2\n"+str2+"--");
			
		}
		public useingAttribute()
		{
			print("before static");
			str4 ="str4";
			print("after constructor");
		}
		public void print(String title)
		{
			System.out.println("--"+title+"--");
			System.out.println("str2"+str2+"\n");
			
		}
		public static void main(String[] args)
		{
			System.out.println();
			System.out.println("´´½¨useingAttibute");
			System.out.println();
			new useingAttribute();
		}
}
