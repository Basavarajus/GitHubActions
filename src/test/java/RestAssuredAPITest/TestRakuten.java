package RestAssuredAPITest;

import java.util.Arrays;

public class TestRakuten {
    // 12:30 --> 90

    public static void main(String args[]) {


        //12/360 = Each hour angle  -
        // 60 / 360 = Each min angel

        //
        String TimeInput = "12:30";
        getAngelforTime(TimeInput);

    }

    private static void getAngelforTime(String time) {
        String str1[] = time.split(":");
        System.out.println(Arrays.toString(str1));
//        int Degree  = 0;
////        int hour = str1[1] /12;
////
////        int min= 60/360;
//
//
//
//        Degree =
//
//        //
//    }
    }
}
