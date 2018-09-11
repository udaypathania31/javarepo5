import java.util.Scanner;
 class SecondLargest {
 
	public static void main(String[] args) {
		System.out.println("Enter any 10 numbers ");
        Scanner scan=new Scanner(System.in);
      int arr[]={0,0,0,0,0,0,0,0,0,0};
     int largest = arr[0];
		int secondLargest = arr[0];
         int i;
        for(i=0;i<10;i++)
             arr[i]=scan.nextInt();
 			System.out.println("The given array is:" );
 		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
} 