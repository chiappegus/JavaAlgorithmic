/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickselect;

import java.util.Random;

/**
 *
 * @author gchiappe
 */
public class Quickselect {

    private int[] nums;

    public Quickselect(int[] nums) {
        this.nums = nums;
    }

    public int select(int k) {
        return select(0, nums.length - 1, k - 1);
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    private int select(int firstIndex, int LastIndex, int k) {
        int pivot = partition(firstIndex, LastIndex);
        if (pivot > k) {
            return select(firstIndex, pivot - 1, k);
        } else if (pivot < k) {
            return select(pivot + 1, LastIndex, k);

        }
        return nums[k];
    }

    private int partition(int firstIndex, int LastIndex) {

        int pivot = new Random().nextInt( LastIndex -firstIndex+ 1) + firstIndex;
        swap(LastIndex, pivot);

        for (int i = firstIndex; i < LastIndex; i++) {

            if (nums[i] > nums[LastIndex]) {
                swap(i, firstIndex);
                firstIndex++;
            }

        }
        swap(firstIndex, LastIndex);

        return firstIndex;

    }

}
