package main.java.com;

import java.util.Scanner;

class Helper {
    static Scanner sc = new Scanner(System.in);

    static int[] getInput() {
        while (true) {
            try {
                System.out.println("Enter numbers, separated by commas: ");
                String[] numbers = sc.nextLine().split(", ");
                int[] arr = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    arr[i] = Integer.parseInt(numbers[i]);
                }

                return arr;
            } catch (Exception e) {
                System.out.println("Invalid input, Please try again");
            }
        }
    }

    static int[] calculateTotal(int[] firstArray, int[] secondArray) throws Exception {
        try {
            validateLength(firstArray, secondArray);
            int[] totalArray = new int[firstArray.length];
            for (int i = 0; i <= firstArray.length; i++) {
                totalArray[i] = firstArray[i] + secondArray[i];
            }

            return totalArray;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private static void validateLength(int[] firstArray, int[] secondArray) throws Exception {
        if (firstArray.length != secondArray.length) {
            throw new Exception("Inputs were different in length");
        }
    }
}
