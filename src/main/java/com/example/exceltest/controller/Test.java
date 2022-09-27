package com.example.exceltest.controller;

import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        perm(new int[]{2,5,4},new Stack<>());
    }
    public static void perm(int[] array, Stack<Integer> stack) {
        String str = "";
        String mm = "";
        if(array.length <= 0) {
            //进入了叶子节点，输出栈中内容
            for (Integer s : stack) {
                str += s + "-";
            }
            System.out.println(str);
        }else {
            for (int i = 0; i < array.length; i++) {
                //tmepArray是一个临时数组，用于就是Ri
                //eg：1，2，3的全排列，先取出1，那么这时tempArray中就是2，3
                int[] tempArray = new int[array.length-1];

                // 取i之前的元素到tempArray中
                System.arraycopy(array,0,tempArray,0,i);

                // 取i之后的元素到tempArray中
                System.arraycopy(array,i+1,tempArray,i,array.length-i-1);

                stack.push(array[i]);
                perm(tempArray,stack);
                stack.pop();
            }
        }
    }
}
