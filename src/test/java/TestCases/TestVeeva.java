package TestCases;

import java.util.HashMap;
import java.util.Map;

public class TestVeeva {



    //* For example:
    //   *  - 1 will be written as "one 1"
    //   *  - 33 will be written as "two 3s"
    //   *  - 12331 will be written as "one 1, one 2, two 3s, one 1"
    public static void main(String args[]){
         String str[] = {"one","two","three","four","five"};
          String str1 ="12331";
          frequencyverb(str,str1);
    }


    public static void frequency1(String[] str,String str1){
        int count=1;
        for(int i=0;i<str1.length()-1;i++){
            for(int j=i+1;j<str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    count++;
                    System.out.println("");
                }
                else{
                    System.out.println(str1.charAt(i)+ ""+str[1]);
                }
            }
        }
    }


    public static void frequencyverb(String[] str,String str1){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
            }
            else{
                map.put(str1.charAt(i),1);
            }
        }

        System.out.println(map);

        for(Map.Entry<Character, Integer> e :map.entrySet()){
           char ch = e.getKey();
           System.out.println(str[e.getValue()-1] +" " +e.getKey());
        }

    }
}
