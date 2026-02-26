package com.array;

public class Maxelement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 2, 5, 3, 2, 6, 2, 3, 6};
        boolean[] visited = new boolean[arr.length];

        int firstMax = 0, secondMax = 0;
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        int firstMaxNum = 0, secondMaxNum = 0;
        int firstMinNum = 0, secondMinNum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            
            if (count > firstMax) {
                secondMax = firstMax;
                secondMaxNum = firstMaxNum;

                firstMax = count;
                firstMaxNum = arr[i];
            }
            else if (count > secondMax && count != firstMax) {
                secondMax = count;
                secondMaxNum = arr[i];
            }

           
            if (count < firstMin) {
                secondMin = firstMin;
                secondMinNum = firstMinNum;

                firstMin = count;
                firstMinNum = arr[i];
            }
            else if (count < secondMin && count != firstMin) {
                secondMin = count;
                secondMinNum = arr[i];
            }
        }

        System.out.println("Second Max Element : " + secondMaxNum + " Count : " + secondMax);
        System.out.println("Second Min Element : " + secondMinNum + " Count : " + secondMin);
    }
}