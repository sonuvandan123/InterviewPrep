package logicprograms;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// if number is not divided by any number excepting 1 and number itself then it will be a prime number
		
		int number=19,flag=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Number is not a prime number");
		}
		else
		{
			System.out.println("number is a prime number");
		}

	}

}
