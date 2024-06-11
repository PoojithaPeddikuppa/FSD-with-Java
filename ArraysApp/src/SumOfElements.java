
public class SumOfElements {
public static void main(String[] args) {
		float prices[] = { 563.24f,953.26f,789.25f,685.24f,789.25f,987.28f};
		//we can 
		System.out.println(prices.length);
		float sum = 0;
		for(int index = 0;index < prices.length;sum+=prices[index],index++);{ 
			//sum+=prices[index];
			}
		System.out.println("The original array:");
		for(int index = 0;index < prices.length;index++) {
			System.out.println(prices[index]);
			
		}
		for(float price: prices) {
			System.out.println(price);
		}
		System.out.println("Sum of array elements:"+sum);
		for(;;) {
			System.out.println("Hi");
		}
	    
	

}
}
//list of initialized array elements is known as initializer list
//array.length is instance constant
//the max size of int data type is the max size of the array
//array size can't be negative
//array minimum size is 1 and maximum is max_size
//without a condition returns true the control will not gp into the bpdy of the loop
//