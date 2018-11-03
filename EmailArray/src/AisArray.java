//print the unique number

import java.util.ArrayList;

public class AisArray {
	public static void main(String[] args) {
		
		
		int arr[] = {5,9,7,6,5,3,5,9,7,6,7,5,9,9,9};

		ArrayList <Integer> myarr= new ArrayList<Integer>();
		
		for(int i=0; i<arr.length;i++) {
			
			int k=0;
			if(!myarr.contains(arr[i])) {
				
				myarr.add(arr[i]);
				k++;
				
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]==arr[j])
						k++;
				}
				if(k>1) {
				System.out.println("value "+arr[i]+ " occurs "+k +" times");
				System.out.println("********************");
				}
				if(k==1)
					System.out.println(arr[i]+" is a unique number");
				
			}
		}
	}

}
