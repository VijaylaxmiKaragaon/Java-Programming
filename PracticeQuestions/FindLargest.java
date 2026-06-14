package PracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class FindLargest {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(100);
		a.add(30);
		a.add(245);
		int x=Collections.max(a);
		int y=Collections.min(a);
		System.out.println("Min number of array:"+" "+y);
		System.out.println("Max number of array:"+" "+x);
        
		//contains element or not
		boolean z=a.contains(10);
		System.out.println(z); //true
		
		//sort the array
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		//Decreasing order
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
		
		//for each method
//		for(Integer i:a) {
//			System.out.println(i);
//		}
		
		//size of an array
		a.size();
		
		for(int i=0;i<=a.size()-1;i++) {
			System.out.println(a.get(i));
		}
		
	}

}
