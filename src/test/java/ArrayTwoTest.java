import org.example.ArrayTwo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class ArrayTwoTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        System.out.println("Parametrized test");
        return Arrays.asList(new Object[][]{
                {new int []{1, 1, 1, 4, 4, 1, 4, 4}, true},
                {new int []{14, 41, 11, 44},false},
                {new int []{1, 2, 3, 4, 5}, false},
                {new int []{1, 1, 1, 1, 1}, false},
                {new int []{4, 4, 4, 4}, false},
        });
    }

    private int[] arr;
    private boolean result;

    public ArrayTwoTest(int[] arr, boolean result) {
        this.arr = arr;
        this.result = result;
    }

    ArrayTwo arr2 = new ArrayTwo();

    @Test
    public void task2Test() {
        Assert.assertEquals(result, arr2.task2(arr));
    }

}
