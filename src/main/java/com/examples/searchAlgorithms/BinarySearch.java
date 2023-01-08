package com.examples.searchAlgorithms;

public class BinarySearch {
    

    public static int binarySearch(int[] array, int value) {

        int low=0;
        int high = array.length-1;
        while(low<=high){
            int middle = (low+high)/2;
            int guess = array[middle];
            if(value < guess)
                high = middle-1;
            else if (value>guess)
                low=middle+1;
            else 
                return middle;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{2,5,6,8,12,16,18,23,36};
        System.out.println(binarySearch(temp, 41));
    }
}
