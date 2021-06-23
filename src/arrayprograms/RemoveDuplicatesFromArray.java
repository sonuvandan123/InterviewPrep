package arrayprograms;

public class RemoveDuplicatesFromArray 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,2,1,3,5,6,8,2};
		int n=a.length;
		int flag=0;
		int temp[]=new int[n];
		int j;
		for(int i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i]==temp[j])
				flag=1;
				break;	
			}
			if(flag==0)
			{
				temp[j]=a[i];
				j++;
			}
		}
		for(int k=0;k<temp.length;k++)
		{
			System.out.println(temp[k]);
		}
		
		
		
	}
}
