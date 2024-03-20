package Algo;

import Algo.Methode.Plat2;
import Algo.Methode.Plat3;
import Algo.Methode.Plats1;
//import Algo.Methode.Plats1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //plat1
     Scanner scanner= new Scanner(System.in);

      /*System.out.println("Entrer le nombre en base 10 à convertir : ");
        int nombre= scanner.nextInt();

        System.out.println("Entrer la base : ");
        int base= scanner.nextInt();
        if(base>=2){
            Plats1 plats1= new Plats1();
            String result = plats1.convertion(base,nombre);

            System.out.println("Le nombre " + nombre + " en base 10 est égal à " + result + " en base " + base + ".");
        }else {
            System.out.println("La base doit etre superieur ou egale 2");
        }*/


        //plat2

        /*System.out.println("Entre le nombre : ");
        String number= scanner.nextLine();

        System.out.println("Entrer la base : ");
        int base = scanner.nextInt();
        if(base<2 || base>10){
            System.out.println("La base doit être comprise entre 2 et 10.");
        }else {
            int decimalValue = Plat2.convertabase10(number, base);
            System.out.println("Le nombre " + number + " en base " + base + " est équivalent à " + decimalValue + " en base décimale.");
        }*/

        //plat3
        System.out.println("Entre le nombre a :" );
        double numbera= scanner.nextDouble();

        System.out.println("Entre le nombre b :" );
        double numberb= scanner.nextDouble();


        double multiple = Plat2.somme(numbera,numberb);
        System.out.println(multiple);
        scanner.close();

    }
}
