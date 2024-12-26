package RestAssuredAPITest;

public class TestData1 {

    public static void main(String args[]) {
        //1 2 3 4 5
        //6 5 8 3 8
        //3 5 8 2 9
        //9 6 9 3 5
        //2 6 8 6 9

        int arr[][] ={{1,2,3,4,5},{6,5,8,3,8},{3,5,8,2,9},{9,6,9,3,5},{2,6,8,6,9}};
       // System.out.print(arr[0][0] +arr[0][1] +arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2]);
        int max =0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<3;j++){
              int sum = arr[i][j]+arr[i][j+1] +arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2] ;
               //max =sum ;
              if(sum>max){
                  max=sum;
              }
            }

        }

        System.out.println(max);

    }

}