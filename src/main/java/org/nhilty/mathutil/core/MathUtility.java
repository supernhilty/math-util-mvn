/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.nhilty.mathutil.core;

/**
 *
 * @author leyen
 */


//clone java.util.Math which has Math.sqrt(), Math.sin(), Math.random(), Math.PI
public class MathUtility {
    public static final double PI = 3.1415;
    
    //long: 18 so 0 -> 21 giai thua -> exception
    /**
     * 
     * @param n
     * @return 
     */
    //TDD: Test Driven Development là kĩ thuật viết code có chất lượng
    //bằng cách code và test case, test run được thực thi đan xen
    //song song, vừa viết code vừa test
    //Công việc của QC và Dev có điểm giống nhau
    //Đều phải thiết kế các test case vá run chúng để coi đúng sai
    //test case run với app (QC) test case để run với code/hàm/class (DEV)
    //QC và dev khác nhau cơ bản là:
    //Dev viết code/viết app + viết test
    //QC không viết code ra app, có thể viết code để tự động hóa thao tác kiểm thử app
    //Dev và QC đều phải thiết kế test case
    //test case có thể viết tự do hay viết theo template
    //viết theo template:
    //Test case #1 (mục đích test case): check getF() method ưith n=0
    //steps/procedures (các bước để run test case, input, click...)
    //  1. Given n=0
    //  2. Call getF() with n = 0; getF(0) getF(n)
    //Expected results (kết quả kỳ vọng)
    //getF(0) must return 1
    
    //Test case #2 (mục đích test case): check getF() method ưith n=0
    //steps/procedures (các bước để run test case, input, click...)
    //  1. Given n=1
    //  2. Call getF() with n = 1; getF(1) getF(n)
    //Expected results (kết quả kỳ vọng)
    //getF(1) must return 1
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("n must be between 1 to 20!");
        if (n == 0 || n == 1)
            return 1;
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
