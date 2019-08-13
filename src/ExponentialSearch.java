import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String args[]) {
        final int[] arrayInput = {1, 2, 3, 4, 5};
        final int arrayLength = arrayInput.length;
        final int elementToFind = 3;
        Solver solver = new Solver();
        System.out.println(solver.solve(arrayInput, arrayLength, elementToFind));
    }

}

class Solver {
    public int solve(final int[] arrayInput, final int arrayLength, final int elementToFind) {
        int iterator = 0;
        int boundaryEnd = 0;
        int result = 0;

        //exponential search
        if (arrayInput[0] == elementToFind) {
            return 0;
        } else {
            iterator = 1;

            while (iterator < arrayLength && iterator < elementToFind) {
                iterator *= 2;
            }

            boundaryEnd = iterator > arrayLength ? arrayLength : iterator;

            //binary search logic
            result = Arrays.binarySearch(arrayInput, iterator / 2, boundaryEnd, elementToFind);

        }

        return result;

    }
}
