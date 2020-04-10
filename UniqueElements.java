import java.util.List;
import java.util.stream.Collectors;
import java.util.*; 

class UniqueElements {
  public static void main(String[] args) {
    List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 2, 4, 6);
    System.out.println(uniqueElements(data));
  }

  static List<Integer> uniqueElements(List<Integer> list){
    return list.stream().distinct().collect(Collectors.toList());
  }

}