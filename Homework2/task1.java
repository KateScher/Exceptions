package Homework2;
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

import java.util.Scanner;

public class task1 {

  public static void main(String[] args) {
    int x = 0;
    while (x != 1) {
      System.out.println("Введите дробное число: ");
      Scanner scan = new Scanner(System.in);
      String num = scan.nextLine();

      try {
        float number = Float.parseFloat(num);
        System.out.println(number);
        System.out.println("Все верно!");
        x = 1;

      } catch (Exception NumberFormat) {
        System.out.println("Exception NumberFormat: Строки вводить нельзя, введите число!");
      }
    }
  }
}
