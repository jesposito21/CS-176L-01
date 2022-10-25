
public class ArrayAssignment1 {

	public static void main(String[] args) {
		
		double[] values= {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double maxElement= values[0];
		int neg=0;
		for (double element : values) {
			System.out.print(element+" ");
			if (maxElement<element){
				maxElement=element;
			}
			if (element<0) {
				neg++;
			}
			
			
		}
		System.out.println();
		System.out.println("The largest element in the array is "+ maxElement+"!");
		System.out.println("There are "+neg+" negative numbers in the array!");

	}

}
