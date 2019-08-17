import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String args[]) {
        final int[] arrayInput = {1, 2, 3, 4, 5};
        final int arrayLength = arrayInput.length;
        final int elementToFind = 3;
        Solver solver = new Solver();
        System.out.println(solver.solve(arrayInput, arrayLength, elementToFind));
        ExponentialSearch exponentialSearch = new ExponentialSearch();
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

            boundaryEnd = getMinBoundary(arrayLength, iterator);

            //binary search logic
            result = doBinarySearch(arrayInput, elementToFind, iterator, boundaryEnd);

        }

        return result;

    }

    private int doBinarySearch(int[] arrayInput, int elementToFind, int iterator, int boundaryEnd) {
        return Arrays.binarySearch(arrayInput, iterator / 2, boundaryEnd, elementToFind);
    }

    private int getMinBoundary(int arrayLength, int iterator) {
        return iterator > arrayLength ? arrayLength : iterator;
    }

}
