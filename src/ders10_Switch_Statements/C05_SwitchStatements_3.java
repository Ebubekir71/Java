package ders10_Switch_Statements;

import java.util.Scanner;

public class C05_SwitchStatements_3 {
    public static void main(String[] args) {
        //Kullanicidan ay numarasini alip mevsinimi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ay numarasini giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecersiz ay numarasi");
        }
    }
}
