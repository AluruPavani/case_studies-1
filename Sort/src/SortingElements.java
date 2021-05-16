
public class SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int[] arrNumbers= {1,2,3,4,1,2,3,4,1,2,3,4};
		System.out.println("Before sort: ");
		for(int num : arrNumbers) {
			System.out.print(num+",");
		}
		System.out.println();
		for(int a=0;a<arrNumbers.length;a++) {
			for(int b=a+1;b<arrNumbers.length;b++) {
				if(arrNumbers[a]>arrNumbers[b]) {
					temp=arrNumbers[a];
					arrNumbers[a]=arrNumbers[b];
					arrNumbers[b]=temp;
				}
			}
		}
		System.out.println("After sort: ");
		for(int num : arrNumbers) {
			System.out.print(num+",");
		}
	}

}
