package PointCircle;

public class Point {
	
	int[]a=new int[2];
	
		public Point(int x,int y)
		{
			
			
		}
		public int[] setPoint(int x,int y)
		{
			a[0]=x;
			a[1]=y;
			System.out.println("�����õ�Բ�������ǣ�"+x+","+y+")");
			return a;
		}
		public  void getPoint(int x,int y)
		{
			 x=a[0];
			y=a[1];
			System.out.println("Բ�������ǣ�"+x+","+y+")");
			}
}
