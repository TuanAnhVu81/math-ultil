/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.quoctrieu.mthutil.mathutil.core;

//quy tac dat ten package trong java
//tên miền đảo ngược, đi kèm thông tin dự án và module
//com.tên-cty.tên-dự-án.module.tên-class
//com.microsoft.sqlserver.jdbc.
//.NET: Chiều xuôi, chữ hoa từng đầu từ

import com.quoctrieu.mathultil.math.ultil.main.MathUltil;
import com.quoctrieu.mthutil.mathutil.core.MathUtil1808;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
//class này chứa các testcase dùng để test code của class chính bên MathUtility
public class MathUtilityTest {
    
    //test case: là bộ data đầu vào + thao tác nhập xuất trên app,
    //          màn hình, trên hàm để verify 1 hàm, màn hình,
    //          chức năng chạy đúng hay sai! PE
    // * Test case #1: Check/test getF() with n = 0
    // * Input/Given n = 0
    // * Step/Procedure (bước test)
    // call method getFactorial(n)
    // * Expected Result: 1 (hy vọng 0! = 1)
    // * Actual Result: ??? chờ chạy hàm mới biết
    // * Status: passed | failed
    
    @Test //framework ép ta phải viết code theo 1 quy tắc nào đó
          //thư viện cho viết tự do, gọi là hàm tự do
    public void testFactorialGivenRightArg0ReturnsWell() {
        assertEquals(1, MathUtil1808.getFactorial(0));
    }
    
    // * Test case #2: Check/test getF() with n = 1
    // * Input/Given n = 1
    // * Step/Procedure (bước test)
    // call method getFactorial(n)
    // * Expected Result: 1 (hy vọng 0! = 1)
    // * Actual Result: ??? chờ chạy hàm mới biết
    // * Status: passed | failed
    
    @Test //framework ép ta phải viết code theo 1 quy tắc nào đó
          //thư viện cho viết tự do
    public void testFactorialGivenRightArg1ReturnsWell() {
        assertEquals(1, MathUtil1808.getFactorial(1));
    }
    
    // * Test case #3: Check/test getF() with n = 5
    // * Expected Result: 120 
    
    @Test //framework ép ta phải viết code theo 1 quy tắc nào đó
          //thư viện cho viết tự do
    public void testFactorialGivenRightArg5ReturnsWell() {
        assertEquals(120, MathUtil1808.getFactorial(5));
    }
    
    @Test
    public void testFactorialGivenRightArg12345ReturnsWell() {
        assertEquals(1, MathUtil1808.getFactorial(1));
        assertEquals(2, MathUtil1808.getFactorial(2));
        assertEquals(6, MathUtil1808.getFactorial(3));
        assertEquals(24, MathUtil1808.getFactorial(4));
        assertEquals(120, MathUtil1808.getFactorial(5));
    }
    
    //thấy ngoại lệ là mừng
    //Test case #5: Check getF() with n = -1, the method throw Exception
    @Test
    public void testFactorialGivenWrongArg_1ThrowException() {
        //MathUtil1808.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, 
                        () -> {MathUtil1808.getFactorial(-1);});
    }
    
}
