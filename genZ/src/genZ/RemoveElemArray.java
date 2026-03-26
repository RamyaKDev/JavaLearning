package genZ;

import java.util.Arrays;

public class RemoveElemArray {

	public static void main(String[] args) {
		int[] a= {1,3,2,5};
		int [] b=Arrays.stream(a)
		.filter(n->n!=3)
		.toArray();
		System.out.println(Arrays.toString(b));
		
		
	}

}
