package string.splitter;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Test Case 1: This triggers the StringSplitter warning.
    String[] test = "me:you".split(":");
    System.out.println(test.length);

    // Test Case 2: This does not trigger the String Splitter warning.
//    List<String> test = List.of("me:you".split(":"));
//    System.out.print(test.size());
  }
}
