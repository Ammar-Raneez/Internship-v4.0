package test.java.com;

import main.java.com.ArrayAdder;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class ArrayAdderTest {
    ArrayAdder arrayAdder;

    @Before
    public void testASetup() {
        this.arrayAdder = new ArrayAdder();
    }

    @Test
    public void testBSetArrayOne() {
        this.arrayAdder.setFirstArray(new int[] {1, 2, 3});

        try {
            int[] arr = arrayAdder.getFirstArray();
            System.out.println(arr[0]);
        } catch (IndexOutOfBoundsException | NullPointerException ignored) {
            fail("[Error] --> array wasn't set");
        }

        assertArrayEquals(new int[] {1, 2, 3}, arrayAdder.getFirstArray());
        System.out.println("[SUCCESS] --> Test B Passed");
    }

    @Test
    public void testCSetArrayTwo() {
        this.arrayAdder.setSecondArray(new int[] {4, 3, 6});

        try {
            int[] arr = arrayAdder.getSecondArray();
            System.out.println(arr[0]);
        } catch (IndexOutOfBoundsException | NullPointerException ignored) {
            fail("[Error] --> array wasn't set");
        }

        assertArrayEquals(new int[] {4, 3, 6}, arrayAdder.getSecondArray());
        System.out.println("[SUCCESS] --> Test C Passed");
    }

    @Test
    public void testDGetNewArray() {
        this.arrayAdder.setFirstArray(new int[] {1, 2, 3});
        this.arrayAdder.setSecondArray(new int[] {3, 4});

        Exception e = assertThrows(Exception.class, () -> this.arrayAdder.getNewArray());
        String expectedMsg = "Inputs were different in length";
        String actualMsg = e.getMessage();

        System.out.println(actualMsg.contains(expectedMsg));
        assertTrue(actualMsg.contains(expectedMsg));
        System.out.println("[SUCCESS] --> Test D Passed");
    }

    @Test
    public void testFGetNewArray() {
        this.arrayAdder.setFirstArray(new int[] {1, 2, 3});
        this.arrayAdder.setSecondArray(new int[] {3, 4, 5});

        int[] total = null;
        try {
            total = this.arrayAdder.getNewArray();
            System.out.println(Arrays.toString(total));
        } catch (Exception e) {
            fail("ERROR] --> Array total is expected");
        }

        assertArrayEquals(new int[] {4, 6, 8}, total);
        System.out.println("[SUCCESS] --> Test E Passed");
    }
}
