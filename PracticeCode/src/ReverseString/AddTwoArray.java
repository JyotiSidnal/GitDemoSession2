package ReverseString;

import java.util.ArrayList;

public class AddTwoArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(40);
		arr1.add(50);
		ArrayList<Integer> combined=new ArrayList<>(arr);
		combined.addAll(arr1);
		System.out.println(combined);
		

	}

}
