package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число:");
        int number = (int) (Math.random() * 6);
        int num;
        for (int n = 0; n < 3; n++) {
            num = scan.nextInt();
            if (number == num) {
                System.out.println("Ура ви виграли!");
                break;
            } else {
                System.out.println("Ви не вгадали...Спробуйте ще раз: ");
            }
        }
    }
}


