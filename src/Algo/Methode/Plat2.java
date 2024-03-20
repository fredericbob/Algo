package Algo.Methode;

public class Plat2 {

    public static int convertabase10(String nombre,int base){

        int resultat = 0;
        int puissance= 0;
        for(int i=nombre.length()-1;i>=0;i--){

            int string = Character.getNumericValue(nombre.charAt(i));

             resultat += string * Math.pow(base,puissance);

             puissance++;
        }
        return resultat;
    }


    public static  double somme(double a,double b){

        if(b==1) return a;

        double result = a + somme(a,(b-1));
        return  result ;
    }

}
