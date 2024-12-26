package Interview;

import java.util.Arrays;

public class Interview {

    //Input:  arr[] = {5, 1, 3, 2, 4}
    //Output: 10 14 12 13 11
    //{1+3+2+4, 5+3+2+4, 5+1+2+4, 5+1+3+4, 5+1+3+2}



    //Reverse a word in a string
    //Input : Hello World
    //Output : olleH dlroW

    public static void main(String[] args){
        int arr[] ={5, 1, 3, 2, 4};
        String str = "Hello World";
        ReversWord(str);
       // convertedValue(arr);
    }

    private static void ReversWord(String str) {
        String[] str1 = str.split(" ");

       // System.out.println((str1[1].charAt(1)));
        for(int i=0;i<str1.length;i++){
           // System.out.println(str1[i].length()-1);
           for(int j=str1[i].length()-1;j>=0;j--){
               System.out.print(String.valueOf(str1[i].charAt(j)));
           }
           System.out.print(" ");
        }
    }

    private static void convertedValue(int[] arr) {
        int[] arr1 = new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int flag =arr[i];
            for(int j=1;j<arr.length;j++){
                if(arr[j]!=flag){
                    sum = sum+j;
                   // arr[i]=sum;
                }
                else{
                    break;
                }

            }
            arr[i] =sum;
        }
        System.out.println(Arrays.toString(arr));
    }







}
