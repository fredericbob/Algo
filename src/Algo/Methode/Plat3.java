package Algo.Methode;

import java.util.ArrayList;
import java.util.List;

public class Plat3 {
    public static void main(String[] args) {
        String nbr="134064539";

        int nbr0 = 4 - (nbr.length() % 4);
        nbr = "_"+nbr;
        if (4 != nbr0) {
            nbr = nbr.replace("_","0".repeat(nbr0));
        }else {
            nbr = nbr.replace("_","");
        }

        List<List<Integer>> result = new ArrayList<>();
        int ind = 0;
        List<Integer> temp = null;
        for (char s : nbr.toCharArray()) {
            if (ind == 0 || ind == 4) {
                temp = new ArrayList<>();
                ind = 0;

                result.add(temp);
            }
            temp.add(Integer.valueOf(String.valueOf(s)));

            ind++;
        }

        for (List<Integer> i : result) {
            for (int in : i) {
                System.out.print(in +" ");
            }
            System.out.print("\t");
        }
    }
}
