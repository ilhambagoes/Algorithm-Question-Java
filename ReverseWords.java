class ReverseWords {
  public static void main(String[] args) {
    System.out.println(reverseString("HELLO"));
    System.out.println(reverseWords("HELLO MY NAME ANDI"));
  }

  static String reverseString(String inputWord){
    return new StringBuilder(inputWord).reverse().toString();
  }

  static String reverseWords(String inputWords){
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\s");
    String[] temp = pattern.split(inputWords);
    String result = "";

    for (int i=0; i<temp.length; i++){
      if (i == temp.length-1){
        result = temp[i] + result;
      } else {
        result = " " + temp[i] + result;
      }
    }
    return result;
  }
}