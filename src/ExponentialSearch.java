import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String args[]) {

        int[] arrayInput = {1,2,3,4,5};
        int arrayLength = arrayInput.length;
        int elementToFind = 3;
        int iterator=0;
        int boundaryEnd=0;
        int result=0;

        if(arrayInput[0]==elementToFind)
        {
            System.out.println(0);
        }

        else
        {
            iterator=1;

            while(iterator<arrayLength && iterator<elementToFind) {
                iterator *= 2;
            }

            boundaryEnd = iterator>arrayLength? arrayLength:iterator;
            //binary search logic
            result=Arrays.binarySearch(arrayInput,iterator/2,boundaryEnd,elementToFind);
            System.out.println(result);
        }

    }

}
