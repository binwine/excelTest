package com.example.exceltest.controller;

public class PaiLie {// 对一组数字进行全排列

    public static void main(String[] args) {
        int a[] = new int[] {4, 2, 5};
        /*for (int i = 1; i < a.length; i++)
            a[i] = i;*/
        System.out.println(a);
        pailie(a, 1);
    }

    public static void pailie(int[] a, int n) {// n 待交换数的索引
        if (n < a.length - 1) {
            for (int i = n; i < a.length; i++) {
                int temp = a[i];
                for (int k = i; k > n; k--)
                    a[k] = a[k - 1];
                a[n] = temp; // 把该段最右面的数移到最左面
                pailie(a, n + 1);
// 还原原来序列
                for (int k = n; k < i; k++)
                    a[k] = a[k + 1];
                a[i] = temp;
            }
        } else {
            for (int j = 1; j < a.length; j++)
                System.out.print(a[j] + " ");
            System.out.println();
        }
    }
}