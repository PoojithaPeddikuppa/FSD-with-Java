import java.io.IOException;
public class SingleCharacterReader {
	public static void main(String[] args) throws IOException{
		char ch;
		System.out.println("Enter your choice y/n");
		ch = (char) System.in.read();
		System.out.println( ch );
		
	}

}
