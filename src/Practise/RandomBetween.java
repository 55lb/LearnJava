package Practise;
import java.lang.Math;
import java.util.Scanner;

public class RandomBetween {
	
		public static void main(String[] args)
		{
			RandomR ran1 =new RandomR();
			int f1 = ran1.Scanner();
			int f2 =ran1.Scanner();
			
			System.out.println("1,������֮��������:"+ran1.compare(f1,f2));
		}

}

 class RandomR
 {
	 int k;
	 int b;
	 
	 public static int Scanner()
	 {
		 System.out.println("��������Ҫ�������һ�����������»س���");
		 Scanner in =new Scanner (System.in);
		 
		int b = in.nextInt();
		 return b;
	 }
	
	
	int compare(int l,int g)
	 {
	  int k =(int)(Math.random()*g);
		//ry{
		for(int i=0;i<g;i++)
		{
			
		 if(k>l && k<g)
		 {
			 System.out.println("2,������֮���������ǣ�"+k);
			 break;
		 }
		 else 
			 continue;
		}
		return k;
		//}catch(Exception e){
		//	if(k)
			
		//}
	// }
	}
	 
 }
