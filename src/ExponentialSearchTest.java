import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentialSearchTest {

    final int[] arrayInput = {1,2,3,4,6};
    final int arrayLength = arrayInput.length;
    final int elementToFind = 6;

    @Test
    public void test()
    {
      assertEquals(4,new Solver().solve(arrayInput,arrayLength,elementToFind));
    }



}