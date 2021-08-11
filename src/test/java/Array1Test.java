import org.example.ArrayOne;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class Array1Test {
    private int[] arrayWithout4;

    @Before
    public void testOnException() {
        arrayWithout4 = new int[]{1, 2, 3};
    }

    ArrayOne arr1 = new ArrayOne();

    @Test(expected = RuntimeException.class)
    public void testArrException() {
        arr1.task1(arrayWithout4);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        System.out.println("Parametrized test");
        return Arrays.asList(new Object[][]{
                {new int[]{1, 4}, new int[]{}},
                {new int[]{1, 1, 4, 4}, new int[]{}},
                {new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}},
                {new int[]{1, 2, 4, 2, 3, 1,7}, new int[]{2, 3, 1, 7}},
        });
    }

    private int[] arrIn;
    private int[] arrOut;

    public Array1Test(int[] arrIn, int[] arrOut) {
        this.arrIn = arrIn;
        this.arrOut = arrOut;
    }

    ArrayOne arr2 = new ArrayOne();

    @Test
    public void task1Test() {
        Assert.assertArrayEquals(arrOut, arr2.task1(arrIn));
    }

}
