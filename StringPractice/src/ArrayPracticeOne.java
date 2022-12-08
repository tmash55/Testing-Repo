import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayPracticeOne {
	static List<Integer> list = new ArrayList<Integer>();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer Numbers[] = new Integer[] {1,2,3,4,5,6,7,8,9};
		Numbers[0] = 10;
		int total = 0;
		List<Integer> Numbers2 = new ArrayList();
		
		Numbers2.add(5);
		list.add(5);
		list.add(8);
		list.add(-1);
		
		System.out.println("The highest number in the arraylist is " + Collections.max(list));
		
		
		
		
//		for(int i = 0; i < Numbers.length; i++) {
//			System.out.println(Numbers[i]);
//			
//		}
//		System.out.println("There are " + Numbers.length + " numbers in the array");
//		
//		for(int i = 0; i<  Numbers.length; i++) {
//			
//			total += Numbers[i];
//			
//		}
//		System.out.println(total);
//		for(int i : Numbers2) {
//			System.out.println(i);
//		}
		

	}

}
