package logicprograms;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// Integer Palindrome
         int num=365;
         int reversedNumber=0;
         int rem=0;
         while(num>0)
         {
        	 rem=num%10;
        	 reversedNumber=(reversedNumber*10)+rem;
        	 num=num/10;
         }
         if(reversedNumber==num)
         {
        	 System.out.println("Number is palindrome");
         }
         else
         {
        	 System.out.println("Number is not palindrome");
         }
	}

}
