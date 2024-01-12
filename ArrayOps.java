public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int findMissingInt(int[] array) {
        //keeps record of which numbers are present in the array
        boolean[] foundNumbers = new boolean[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            foundNumbers[array[i]] = true;
        }
        for (int i = 0; i < foundNumbers.length; i++) {
            if (!foundNumbers[i]) return i;
        }
        return -1;
    }

    public static int secondMaxValue(int[] array) {
        int max = Math.max(array[0], array[1]);
        int secondaryMax = Math.max(array[0], array[1]);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondaryMax = max;
                max = array[i];
            }
        }
        return secondaryMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        return oneDirectionContain(array1, array2) && oneDirectionContain(array2, array1);
    }

    public static boolean oneDirectionContain(int[] array1, int[] array2){
        //checks if array1 is contained in array2
        for (int i = 0; i < array1.length; i++) {
            boolean contained = false;
            //checks whether the current number is in array2
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) contained = true;
            }
            if (!contained) return false;
        }
        return true;
    }

    public static boolean isSorted(int[] array) {
        // checks if the a
        if (array.length == 1) return true;//array of length 1 is always sorted

        for (int i = 1; i < array.length; i++) {
            //checks whether the array has the start of an increasing or decreasing order
            if (array[i - 1] < array[i]) return isIncreasing(array);
            if (array[i - 1] > array[i]) return isDecreasing(array);
        }
        return true;//happens only if all the values are equal
    }

    public static boolean isIncreasing(int[] array) {
        //checks whether an array has an increasing order
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) return false;
        }
        return true;
    }

    public static boolean isDecreasing(int[] array) {
        //checks whether an array has an decreasing order
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) return false;
        }
        return true;
    }

}
