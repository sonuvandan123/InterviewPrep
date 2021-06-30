package stringprograms;

public class StringUpperLower {

	public static void main(String[] args) 
	{
		// lower case are from 97 to 122
		// upper case are from 65 to 90
			String name = "vAnDaN";
			//System.out.println(name.toUpperCase());
			String upperlowername="";
			char name2[]=name.toCharArray();
			for(int i=0;i<name2.length;i++)
			{
				int ascii = (int) name2[i];
				if(ascii>=97 && ascii<=122)
				{
					//System.out.println(name2[i]+"is lower Character");
				   ascii=ascii-32;
				   char c= (char) ascii;
				   System.out.println(c);
				}
				else
				{
					   ascii=ascii+32;
					   char c= (char) ascii;
					   System.out.println(c);
				}
				/*
			 * if(ascii>65) { name2[i] }
			 */
			}
	
	}

}
