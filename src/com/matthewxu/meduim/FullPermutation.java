package com.matthewxu.meduim;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 无重复数组的全排列
 * 
 * @author MatthewXu
 *
 */
public class FullPermutation{
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> permutation =  new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            test(nums[i], i);
        }

        return null;
    }

    public int test(int num, int index){

    }
}