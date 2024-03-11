package Algo.Methode;

import java.util.HashMap;

public class Plat4 {

    public static String octa(String octal){

        HashMap<String, Character> binaryToOctalMap = new HashMap<>();
        binaryToOctalMap.put("000", '0');
        binaryToOctalMap.put("001", '1');
        binaryToOctalMap.put("010", '2');
        binaryToOctalMap.put("011", '3');
        binaryToOctalMap.put("100", '4');
        binaryToOctalMap.put("101", '5');
        binaryToOctalMap.put("110", '6');
        binaryToOctalMap.put("111", '7');

        while(octal.length() % 3 !=0){
            octal = '0' + octal;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<octal.length();i+=3){
            System.out.println(octal);
            String group=octal.substring(i,i+3);
            stringBuilder.append(binaryToOctalMap.get(group));
        }

        return stringBuilder.toString();
    }
}
