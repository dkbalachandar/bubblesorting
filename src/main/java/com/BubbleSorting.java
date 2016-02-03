package com;

/**
 * A simple class to demonstrate the bubble sorting
 */
public class BubbleSorting {

    public static void main(String[] args) {

        int[] intArray = {11, 2, 13, 4, 5, 7};
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.printElements("Before Sorting", intArray);
        bubbleSorting.doSorting(intArray);
        bubbleSorting.printElements("After Sorting", intArray);
    }

    public void printElements(String message, int[] intArray) {
        System.out.println(message);
        for (Integer num : intArray) {
            System.out.println(num);
        }
    }

    /**
     * Sort the elements with Bubble sort algorithm
     *
     * Large element will be bubbled to its proper position after each pass
     * Worst and Avg case complexity is O(n^2)
     * Best case is O(n)
     *
     * @param intArray
     */
    public static void doSorting(int[] intArray) {

        boolean isSwaped;
        int tmp;
        for (int i = 0; i < intArray.length - 1; i++) {
            isSwaped = false;
            for (int j = 1; j < intArray.length - i; j++) {
                if (intArray[j-1] > intArray[j]) {
                    tmp = intArray[j];
                    intArray[j] = intArray[j - 1];
                    intArray[j - 1] = tmp;
                    isSwaped = true;
                }
            }
            if (!isSwaped) {
                System.out.println("No Elements are sorted in this pass.Hence its sorted already.Hence break the loop");
                break;
            }
        }
    }
}
