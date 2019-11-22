package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	int b = hw.Method3(4,4,-3);
    	int c = hw.Method3(4,4,1);
    	int d = hw.Method3(4,4,-1);
    	int e = hw.Method3(6, -1, -1);
    	int f = hw.Method3(5, -1, -3);
    	int g = hw.Method3(4, -1, 1);
    	int h = hw.Method3(6,1,1);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */

    @Test
    public void testMethod4() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 2, 1,0,0);
        int b = hw.Method4(1, 1, 3,4,0);
        int d = hw.Method4(5, 2, 3,3,0);
        int e = hw.Method4(5, 5, 3,3,0);
        int g = hw.Method4(5, 1, 3,3,0);

        try{
            int c = hw.Method4(1, 2, 3,3,0);
        }catch (Exception err){
            System.out.println("error");
        }
        try{
            int f = hw.Method4(5, 1, 3,4,0);;
        }catch (Exception err){
            System.out.println("error");
        }
        try{
            int h = hw.Method4(1, 1, 3,3,0);
        }catch (Exception err){
            System.out.println("error");
        }
        try{
            int j = hw.Method4(1, 2, 3,4,0);
        }catch (Exception err){
            System.out.println("error");
        }
    }
    @Test
    public void testisTriangle() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(0,1,1);
        boolean b = hw.isTriangle(1,0,1);
        boolean c = hw.isTriangle(1,1,0);
        boolean d = hw.isTriangle(1,1,2);
        boolean e = hw.isTriangle(1,2,1);
        boolean f = hw.isTriangle(2,1,1);
        boolean g = hw.isTriangle(1,1,1);

    }


    @Test
    public void testisBirthday() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        int[] y = {1880,2009,2020};
        int[] m = {0, 5,13};
        int[] d = {0,25, 40};
        for( int i = 0; i<3; i++ )
            for(int j = 0; j<3 ; j++ )
                for(int l = 0; l<3; l++)
                {
                    boolean a = hw.isBirthday(y[i],m[j],d[l]);
                }

        boolean b = hw.isBirthday(2019,12,3);
        boolean c = hw.isBirthday(2019,10,2);
        boolean f = hw.isBirthday(2019,10,1);
        boolean e = hw.isBirthday(2019,12,1);
        boolean n = hw.isBirthday(2019,1,1);

        for(int k = 1 ; k<=12 ; k ++ ){
            if(k==2)
                continue;
            e  = hw.isBirthday(2009,k,1);
            e  = hw.isBirthday(2009,k,31);
;
        }
        boolean v = hw.isBirthday(1900,2,3);
        boolean j = hw.isBirthday(2012,2,29);
        boolean k = hw.isBirthday(1900,2,29);
        boolean g = hw.isBirthday(2012,2,30);
        boolean o = hw.isBirthday(2000,2,29);
        boolean p = hw.isBirthday(2000,2,30);



    }


    @Test
    public void testminiCalculator() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        double a = hw.miniCalculator(0,1,'*');
        double b = hw.miniCalculator(1,0,'+');
        double c = hw.miniCalculator(1,1,'-');
        double d = hw.miniCalculator(1,1,'/');
        double e = hw.miniCalculator(1,0,'/');
        double f = hw.miniCalculator(2,1,'=');

    }
}
