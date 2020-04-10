import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

class SortedDate {
  public static void main(String[] args) {
    List<String> dateList = Arrays.asList(
      "12 January 2020",
      "25 February 1998",
      "31 March 2006",
      "04 December 2013",
      "28 July 1963"
    );
    System.out.println(sortDate(dateList));
  }

  static List<String> sortDate(List<String> inputDate){
    return inputDate.stream()
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.toList());
  }
}