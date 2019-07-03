//"BCABA" -> the first recurring character is B

import java.util.HashMap;

public class FirstRecurring {
	public static void main(String [] args){
		String karakter = "BCABA";
		HashMap<Character, Integer> recurringCharsMap = new HashMap<>();

		for(char c : karakter.toCharArray()) {
      if(recurringCharsMap.containsKey(c)) {
  			System.out.println("karakter adalah : " + c);
  			break;
			} else {
				recurringCharsMap.put(c, 1);
			}
		}
	}
}
