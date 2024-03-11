package Algo.Methode;

import java.util.HashMap;

public class Plat3 {

    public static  String binary(String binary){

        HashMap<String, Character> cle = new HashMap<>();
        cle.put("0000", '0');
        cle.put("0001", '1');
        cle.put("0010", '2');
        cle.put("0011", '3');
        cle.put("0100", '4');
        cle.put("0101", '5');
        cle.put("0110", '6');
        cle.put("0111", '7');
        cle.put("1000", '8');
        cle.put("1001", '9');
        cle.put("1010", 'A');
        cle.put("1011", 'B');
        cle.put("1100", 'C');
        cle.put("1101", 'D');
        cle.put("1110", 'E');
        cle.put("1111", 'F');

        while (binary.length() %4 !=0){
            binary ='0' + binary;
            System.out.println(binary);
        }

        StringBuilder stringBuilder= new StringBuilder();
        for(int i=0 ; i<binary.length(); i+=4 ){
            String group = binary.substring(i,Math.min(i+4,binary.length()));
            stringBuilder.append(cle.get(group));
        }

        return stringBuilder.toString();

    }
}
