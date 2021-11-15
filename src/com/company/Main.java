package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] nums = {2.4, 94.3, -56.23, 64.2, -88.9, 72.12, 33.0, -7.1, 90.4, 23.2, 47.8, 12.09, 49.1, 66.2, 11.8};
        double theFirstPositiveNumber = 0;
        int theSecondPositiveNumber = 0;
        boolean addition = false;
        for (double num : nums) {
            if (num < 0) {
                addition = true;
            } else if (addition) {
                theFirstPositiveNumber += num;
                theSecondPositiveNumber++;
            }
        }
        System.out.println(theFirstPositiveNumber);
        System.out.println(theSecondPositiveNumber);
        System.out.println("Среднее арифмическое" + theFirstPositiveNumber / theSecondPositiveNumber);


        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    double temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    isSorted = false;
                }


            }
            for (int i = 0; i < nums.length; i++) {
                if (i > 0) {
                }
            }
            System.out.println(Arrays.toString(nums));


        }
    }
}


