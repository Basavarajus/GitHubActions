package Interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.HashMap;

public class testing {

    //str = 'qa programming';
    public static void main(String[] args) {
        //  String str = "qa programming";
        //  showCharacterCounts(str);
        //  System.out.print(RemovedDuplicate(str));
        // 1, -2, -3,3, 4, 4,-1
        // -1, -2 ,
        int[] arr = {1, -1, -2, -3, 4, 2, 5, -5, 6};
        int[] arr1 = {0, 1, 1, 3, 5, 0, 3, 0};
        moveZeroes(arr1);


    }

//    private static void sortArray(int[] arr) {
//        int temp=0;
//
//
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1]= temp;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void RemovedDuplicate(String str) {
//
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i=0;i<str.length();i++){
//                if(map.containsKey(str.charAt(i))){
//                    map.put(str.charAt(i),map.get(str.charAt(i))+1);
//                }
//                else{
//                    map.put(str.charAt(i),1);
//                }
//
//        }
//        System.out.println("------------------"+map);
//    }
//
//    private static String showCharacterCounts(String str) {
//
//        return str;
//    }str
    public  static void moveZeroes(int[] nums) {
        int n=nums.length;
        int c=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k+=1;
            }
            else c+=1;
        }
        for(int j=n-1;c>0;c--,j--){
            nums[j]=0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
