package leet;

public class RemoveEle {

	public static void main(String[] args) {
		int[] a= {2,5,3,7};
		int s=3;
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=s) {
				a[j++]=a[i];
			}
		}
		System.out.println("Altered array");
		for(int i=0;i<a.length-1;i++) {
		System.out.println(a[i]);
		}
	}

}
