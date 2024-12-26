package org.example;

import com.google.common.collect.HashBiMap;

import java.util.HashMap;

public class TestCase1 {

    //java

    public static void main(String args[]) {
        String str = "java";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);

            }
        }
        System.out.print(map);
    }


    // Webelement elem1= driver.findELement(by.xpath(""));
    // // wait obje = new wait()
    //driver.waituntill(elem1.visible());

    //select sc = new select(xpathh);
    //sc.visibleText("sdsds");


    // 5 =5*4*3*2*1

    //int fact =1;
    //for(int i=num;i>1;i--){
    // fact = fact * i;
//}
    //print fact ;







}
