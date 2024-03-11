package Algo.Methode;

public class Plats1 {

    public String convertion(int base,int n){
        if(n==0) return "0";
        StringBuilder resultat = new StringBuilder();

        while(n>0){
            int reste=n%base;
            resultat.insert(0,reste);
            n=n/base;
        }
        return resultat.toString();
    }
}
