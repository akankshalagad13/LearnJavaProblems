package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Write a program to shuffle the elements of an ArrayList.
public class shufflearraylist {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(11,14,16,17,18,19,20,22,24,27));
		System.out.println(ar);
		Collections.shuffle(ar);
		System.out.println(ar);
		
	}

}
