package stringprograms;

public class ReverseWihoutMethod {

	public static void main(String[] args)
	{
	   String name="vandan";
	   String name2="";
	   for(int i=name.length()-1;i>=0;i--)
	   {
		   name2=name2+name.charAt(i);
	   }
	   System.out.println(name2);
    }
    
}
