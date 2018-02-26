package hw.t02;

import java.util.Scanner;

/* Task 01: Найти наименьший номер элемента последовательности,
для которого выполняется условие M. Вывести на экран этот номер
и все элементы ai  где i = 1, 2, ..., п.
  */
public class Task2 {
    public static void main(String[] args) {
      int n =1;
      int e;

      int[] myArray = new int[n];
      Scanner sc = new Scanner(System.in);
      if(sc.hasNextInt()) {
          e = sc.nextInt();
      for (n = 1; n <= e; n++)
          System.out.print(n);
      }

    }
}
