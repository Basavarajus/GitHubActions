package RestAssuredAPITest;


public class TestClass1 {

    public static void main(String args[]) {

        //	int arr[] = {-1,0,1,2,-1,-4};
        int arr[] = {1,2,3,4};
    //    findsubarray(arr);
     //   String str ="testt tests";
      String str = "abcd";
        palindrome(str);
    }

    private static void findsubarray(int[] arr) {
        boolean flag= false;
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n-1;j++) {
                for(int k =j+1;k<n;k++) {
                    if(arr[i]+arr[j]+arr[k]==0) {
                        //	int subarray[] = new int[n];
                        System.out.println(arr[i] + " " +arr[j]+ " " +arr[k]);
                        flag= true;
                    }
                    else {
                        flag=false;
                    }
                }
            }
        }
        if(!flag)
            System.out.println("No sub elements with 0 sum");

    }



    public static void palindrome(String str){

        String str1[] = str.split(" ");
        int maxpalind =0;

       // int longest

        for(int i =0;i<str1.length;i++){
            System.out.println(str1[i]);
           // String sub =

            for(int j=0;j<str1[i].length();i++){

                if(str1[i].equalsIgnoreCase(String.valueOf(str1[i].length()))){

                }
            }

        }

    }

}
