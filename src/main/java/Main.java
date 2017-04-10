import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);

    List reversedList = Lists.reverse(list);
    System.out.println(reversedList);

    String string = "1234";
    System.out.println(string);

    String rotatedString = StringUtils.rotate(string, 2);
    System.out.println(rotatedString);
  }
}
