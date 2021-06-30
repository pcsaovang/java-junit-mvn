package com.corize;

// import java.util.Collection;
// import java.util.ArrayList;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.DynamicTest;
// import org.junit.jupiter.api.function.Executable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  // private Calculator calculator;

  // @BeforeEach
  // public void setUp() {
  // calculator = new Calculator();
  // }

  @Test
  public void testTwoSum() {
    Calculator c = new Calculator();
    Integer result = c.twoSum(1, 2);
    Integer expected = 3;
    assertEquals(expected, result);
    // Collection<DynamicTest> dynamicTests = new ArrayList<>();

    // try {
    // BufferedReader br = new BufferedReader(new
    // FileReader("calculator_test_case.txt"));
    // try {
    // String line;
    // while ((line = br.readLine()) != null) {
    // int input1 = Integer.parseInt(line);

    // line = br.readLine();
    // int input2 = Integer.parseInt(line);

    // line = br.readLine();
    // int expected = Integer.parseInt(line);

    // int ret = calculator.twoSum(input1, input2);
    // Executable exec = () -> assertEquals(expected, ret);

    // String testCase = "Test Two Sum: Input: " + input1 + "," + input2 + "; Your
    // answer: " + ret
    // + "; Expected answer: " + expected;

    // DynamicTest dTest = DynamicTest.dynamicTest(testCase, exec);

    // dynamicTests.add(dTest);
    // }
    // } catch (Exception io) {
    // System.out.println("Exception: " + io);
    // } finally {
    // br.close();
    // }
    // } catch (IOException ioe) {
    // System.out.println("IOException: " + ioe.getMessage());
    // }

    // return dynamicTests;
  }
}
