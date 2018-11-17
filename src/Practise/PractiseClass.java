package Practise;

public class PractiseClass
{
	

		public static void main(String[] args)
		{
			Arr arr= new Arr();
		int[] newArr= new int[arr.oldArr.length];
			arr.getArr(newArr);
			
		}
}

	class Arr
	{
		int[] oldArr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		
		public  void getArr(int[]m)
		{
			for(int j=0;j<oldArr.length;j++)
			{
				if(oldArr[j]==0)
				
				{
				 continue;
				}
				
				else 
					{
					m[j]= oldArr[j];
					}
				System.out.println("新的数组是："+m[j]);
			}
		
		}
	}
	
	