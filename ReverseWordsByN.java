import java.io.*;

class ReverseWordsByN {
  public static void main (String[] args) throws java.lang.Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    Integer n = Integer.valueOf(input.trim()); // count and delete spacing
    String[] words = new String[n]; // storage words
    String[] result = new String[n]; // storage result in array
    String temp ="";
	
    // Add input words depend on count
    for (int i=0; i<n; i++){
      words[i] = br.readLine();
    }
    
    for (int j=0; j<n; j++){
      String[] tempArray = new String[words[j].split("\\s+").length];
      tempArray = words[j].split("\\s+");
      for (int k=0; k<tempArray.length; k++){
        if (k == tempArray.length-1){
          temp = tempArray[k] + temp;
        } else {
          temp = " " + tempArray[k] + temp;
        }
      }
      result[j] = temp;
      temp = "";
      System.out.println(result[j]);
    }
    
  }
}
