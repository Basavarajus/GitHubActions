package TestCases;

import org.testng.annotations.Test;

public class TestClass1 {
    @Test(enabled = true)
    public void Testcase1(){
        System.out.println("Hellow testcase1");
    }

    @Test(enabled = true)
    public void Testcase2(){
        System.out.println("Hello testcase2 ");
    }

    @Test
    public void NulTest(){
        System.out.println("Hello i'm also executing");
    }
}
