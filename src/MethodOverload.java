
public class MethodOverload {
	
	public int add(int a,int b)
	{
		int sum = a + b;
		return sum;
	}
	public int add(int a, int b,int c)
	{
		int sum =a + b + c;
		return sum;
	}
	public float add(float a,float b)
	{
		float sum =a + b;
		return sum;
	}
	public static void main(String[] args)
	{
		int result;
		float resultf;
		MethodOverload test =new MethodOverload();
		result = test.add(1,2 );
		System.out.println("add����1+2�ĺ��ǣ�"+result);
		resultf=test.add(1.2f,2.3f);
		System.out.println("add���㸡����1.2+2.3��ֵ��"+resultf);
		result=test.add(1, 2,3);
		System.out.println("add����������1+2+3��ֵ��"+result);
	}
}
