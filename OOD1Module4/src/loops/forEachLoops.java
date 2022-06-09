package loops;

import java.util.ArrayList;

public class forEachLoops {

	public static void main(String[] args) {
		String[] courses = {"UNIX", "SQL", "JAVA", "Python", "Web Apps"};
		
		for(String course : courses) {
			System.out.println("I love learning" + course);
		}
		
		ArrayList<String> courseList = new ArrayList<String>();
		
		for (String course : courses) {
			courseList.add(course);
		}
		
		for (String course : courseList) {
			System.out.println(course);
		}
		
		//Total Price
		
		ArrayList<Double> prices = new ArrayList<Double>();
		
		prices.add(4.50);
		prices.add(1.99);
		prices.add(9.75);
		prices.add(3.15);
		prices.add(10.25);
		
		double total = 0.0;
		
		for (double price : prices) {
			total += price;
		}
		
		System.out.println(total);
		
		
		//Copying to an array
		double[] priceArray = new double[5];
		
		int index = 0;
		
		for (double price : prices ) {
			priceArray[index] = price;
			index ++;
		}
		
		//adding numbers from a String
		String string = "10,7,25,3,8";
		
		String[] numbers = string.split(",");
		
		int total2 = 0;
		
		for (String number : numbers) {
			total2 += Integer.parseInt(number);
		}
		
		System.out.println (total2);
		
		
		//Reversing a string
		String string1 = "derever neeb sah txet siht";
		char[] letters = string1.toCharArray();
		
		String reversed = "";
		
		for (char letter : letters) {
			reversed = letter + reversed;
		}
		
		System.out.println(reversed);
		
		//Reversing a string with a for loop
		for (int index1 = string1.length() - 1; index1 >= 0; index1 --) {
			reversed += string1.charAt(index1);
		}
		
		System.out.println(reversed);
		
		

	}

}
