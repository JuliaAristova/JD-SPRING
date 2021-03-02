import org.junit.jupiter.api.*;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void  setUpEach() {
        System.out.println("Before each executed");
    }

    @BeforeAll
    static void setUpAll() {
        System.out.println("Before all executed");
    }

    @AfterAll
    static void tearAll() {
        System.out.println("After all executed");
    }

    @AfterEach
    void tearEach() {
        System.out.println("After each executed");
    }

//    @Test
//    void  testCase0() {
//         fail("Not implemented yet");
//    }

    @Test
    void  testCase1() {
        System.out.println("Test Case 1 executed");
        assertEquals(20, 20);
    }

    @Test
    void add() {
        int actual = Calculator.add(2, 3);
        assertEquals(5, actual);
    }

    @Test
    void testCase2() {
        System.out.println("Test Case 2 executed");
        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void testCase3() {
        System.out.println("Test Case 3 executed");
        assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
    }

    @Test
    void testCase4() {
        String nullString = null;
        String notNullString = "Cybertek";
         assertNotNull(notNullString);
      // assertNotNull(nullString);
         assertNull(nullString);
    }

    @Test
    void testCase5() {
        String nullString = null;
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        assertSame(c1, c2);
        assertNotSame(c1, c3);

    }

}