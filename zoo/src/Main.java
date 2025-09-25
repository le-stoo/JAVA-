import src.zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("het isem e zoo");
        String nom = sc.nextLine();
        System.out.println("9adeh min 9fass fi " +nom);
        int nbrcage = sc.nextInt();
        zoo il7adi9a = new zoo(nbrcage,nom);
        System.out.println("isem il zoo :"+il7adi9a.nom+" feha :" +il7adi9a.nbrcage+" 9fass");
    }
}