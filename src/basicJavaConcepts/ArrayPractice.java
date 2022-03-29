package basicJavaConcepts;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] a= {3,5,6,7,9,12,34};
		float avg;int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		
		avg=(float)sum/a.length;
		
		System.out.println(avg);
		
		
	}

}
