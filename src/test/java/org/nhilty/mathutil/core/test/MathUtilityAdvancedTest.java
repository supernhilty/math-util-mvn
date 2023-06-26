/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.nhilty.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.nhilty.mathutil.core.MathUtility.getFactorial;
//import static org.nhilty.mathutil.core.MathUtility.*;

/**
 *
 * @author leyen
 */
public class MathUtilityAdvancedTest {

    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {4, 24},
                               {5, 1200}};
        return testData;
    }
    /**
     * 
     * @param n input data to test
     * @param expected expected value
     */

    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightArgument(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
    
    //Junit đưa ra hàm mới, AssertThrows()
    //hàm này dùng LAMDA EXPRESSION

}
