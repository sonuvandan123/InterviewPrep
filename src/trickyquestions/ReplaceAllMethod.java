package trickyquestions;

public class ReplaceAllMethod {

	public static void main(String[] args) {
		
		char ch='a';
		String name="vandan";
		
		String name2=name.replaceAll(Character.toString(ch),"");
		System.out.println(name2);
		
	}

}
