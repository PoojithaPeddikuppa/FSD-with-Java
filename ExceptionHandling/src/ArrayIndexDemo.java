
public class ArrayIndexDemo {
	
	public static void main(String[] args) {
		int array[] = new int[3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		try {
			System.out.println(array[2]);
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println( aioobe.getMessage());
		} finally {
			System.out.println("I  finally block");
			
		
		}
	}

}
