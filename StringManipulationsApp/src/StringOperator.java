
public class StringOperator {
	
	public static void main(String[] args) {
		int counter = 0;
		String str = "life is Beautiful";
		String str2 = new String("Life is beautiful");
		System.out.println(str.length());
		char ch = str.charAt(1);
	    System.out.println(ch);
	//substring -  to get a particular value of a string
	    String substr =  str.substring(5,7);
	    System.out.println(substr);
	    //Life is beautiful folks
	    String concatStr = str.concat(",Folks");
	    System.out.println(concatStr);
		for(int index = 0;index < str.length(); index++) {
	    	char space = str.charAt(index);
	    	if(space == ' ') {
	    		counter++;
	    	}
	    }
	    System.out.println("Number of spaces:" + counter);
	    }
	    

}

