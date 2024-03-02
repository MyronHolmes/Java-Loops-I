package com.hrcodingchallenge.javaloopsi;

public class Solution {
    public static void main(String[] args){
//        **Objective**
//        In this challenge, we're going to use loops to help us do some simple math.
//        Task
//        Given an integer,N , print its first 10 multiples. Each multiple N x i (where  1 <= i <= 10)  should be printed on a new line in the form: N x i = result.
//
//        **Input Format**
//        A single integer,N .
//
//        **Constraints**
//         2 <= N <= 20

//        **Output Format**
//        Print 10 lines of output; each line i (where 1 <= i <= 10) contains the result of N x 1 in the form:
//        N x i = result.

        int N = 2;
        for (int i =1; i <= 10; i++){
            int result = N * i;
            System.out.printf("%d x %d = %d%n", N, i, result);
        }
    }
}

