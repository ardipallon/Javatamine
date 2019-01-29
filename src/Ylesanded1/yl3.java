package Ylesanded1;

import java.util.Scanner;

public class yl3 {
    public static void main(String[] args){
        System.out.println("Sisesta arv: ");
        Scanner scanner = new Scanner(System.in);
        String sisend = scanner.nextLine();
        scanner.close();

        int summa = 0;
        for(int arv = 0; arv < sisend.length(); arv++){
            char symbol = sisend.charAt(arv);
            summa = summa + Character.digit(symbol, 20);
        }
        System.out.println("Arvu " + sisend + " numbrite summa on " + summa);
    }
}
