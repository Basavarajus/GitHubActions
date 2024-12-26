package TestCases;

import java.util.*;

public class FrequencySort {


    public static void main(String args[]){
           System.out.println(freSort("Treee"));
    }



    public static String freSort(String s){
        System.out.println("Executing .....");
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        List<Map.Entry<Character,Integer>> SortedList = new ArrayList<>();
        Collections.sort(SortedList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        String lastString="";
        for(Map.Entry<Character,Integer> e :SortedList)
        {
            System.out.println("In a blockkkkkkk" +e);
            for(Integer j=0;j<e.getValue();j++)
                lastString+= e.getKey().toString();
                System.out.println("In a blockkkkkkk");
        }
        System.out.println(lastString);
        return lastString;
    }

}
