import java.io.*;

class FibbonaciFindNthElement{
    public static void main (String[] args) throws java.lang.Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String input = br.readLine(); // Expected string ==> 1 2 3 || 10 10 10 || 2 1 4
      String[] data = input.split("\\s+"); // split input
      Integer a = Integer.valueOf(data[0]); // firstIndex
      Integer b = Integer.valueOf(data[1]); // secondIndex
      Integer n = Integer.valueOf(data[2]); // n Element
      Integer result = 0;
      
      // Looping for fibbonaci function
      for (int i=2; i<n; i++){
        result = a+b;
        a = b;
        b = result;
      }
	    System.out.println(result);
    }
}
