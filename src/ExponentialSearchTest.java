import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentialSearchTest {

    final int[] arrayInput = {1,2,3,4,5};
    final int arrayLength = arrayInput.length;
    final int elementToFind = 2;

    @Test
    public void test()
    {
      assertEquals(1,new Solver().solve(arrayInput,arrayLength,elementToFind));
    }

}