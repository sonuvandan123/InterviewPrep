package stringprograms;

public class DuplicateCharacterString {

	public static void main(String[] args) {
		
		String name ="vandan";
		int size=name.length();
	    String duplicateChar="";
		int flag=0;
	    for(int i=0;i<size;i++)
		{
		    for(int j=i+1;j<size;j++)
		    {
		    	if(name.charAt(i)==name.charAt(j))
		    	{
		    		
		    		if(flag>0)
		    		{
		    		   	duplicateChar=duplicateChar+",";
		    			 
		    		}
		    		duplicateChar=duplicateChar+name.charAt(j);
		    		flag=1;
		    	}
		    	
		    }
		    
		}
		System.out.println(duplicateChar);
	
	
	}

}
