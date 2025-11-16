// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      String name = scanner.next();
      int age = scanner.nextInt();

      System.out.printf("Hello, my name is %s and I am %d cm tall.", name, age);
  }
}
