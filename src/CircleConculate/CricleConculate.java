package CircleConculate;
import PointCircle.*;

public class CricleConculate 

	{
		public static void main(String[] args)
		{	
			int r=0;
			int x=0;
			int y=0;
			Circle cir =new Circle(r);
			cir.setr(10);
			cir.getr(10);
			Point p = new Point(x,y);
			p.setPoint(2, 3);
			p.getPoint(x,y);
		}
	}	




 class Circle {
		int r;
		public Circle(int r)
		{	
			r=0;
					System.out.println("�����õ�Բ�İ뾶�ǣ�"+r);
		}
		public void getr(int r)
		{
			this.r=r;
			System.out.println("Բ�İ뾶�ǣ�"+r);
		}
		public int setr(int r)
		{
			System.out.println("�����õ�Բ�İ뾶�ǣ�"+r);
			return r;
		}
		
}
	
	