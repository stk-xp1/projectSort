package com.company;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class SortTest {

        @Test
        public void testSortInt(){
            int[] in = new int[]{-2, 10, 3, 6, 15, -13};
            int[] result = new int[]{-13, -2, 3, 6, 10, 15};

            sorter = new Sorter();
            assertTrue(Arrays.equals(in, result));

        }


        @Test
        public void testSortInt1(){
            int[] in = new int[]{986,456,789,867,100,-100};
            int[] result = new int[]{-100,100,456,789,867,986};

            sorter = new Sorter();
            assertTrue(Arrays.equals(in, result));
        }
    }


}