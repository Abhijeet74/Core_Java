package in.com.rays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {400,800,500,600,50,100,200,150,25};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		
	}

}
