
/*
public class reverseArray {
	
	public static void reverseArr(int[] arr, int index1, int index2) {
		{ 
	        for (int i = 0; i < index1; i += index2) 
	        { 
	            int left = i; 
	      
	            // to handle case when index2 is not multiple 
	            // of n 
	            int right = Math.min(i + index2 - 1, index1 - 1); 
	            int temp; 
	              
	            // reverse the sub-array [left, right] 
	            while (left < right) 
	            { 
	                temp=arr[left]; 
	                arr[left]=arr[right]; 
	                arr[right]=temp; 
	                left+=1; 
	                right-=1; 
	            } 
	        } 
	        int x = 23;
	        int y = (int) Math.pow(x,2);
	        System.out.println(y);
		
	        for (int i = 0; i < index1; i++) 
	            System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		reverseArr(arr, 5, 0);
	}
}
*/