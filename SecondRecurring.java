//"ABCA" -> the first recurring character is A

import java.util.HashMap;

public class SecondRecurring {
	public static void main(String [] args){
		String karakterTwo = "ABCA";
		HashMap<Character, Integer> recurringCharsMapTwo = new HashMap<>();

		for(char car : karakterTwo.toCharArray()) {
      if(recurringCharsMapTwo.containsKey(car)) {
  			System.out.println("karakter adalah : " + car);
  			break;
			} else {
				recurringCharsMapTwo.put(car, 1);
			}
		}
	}
}
