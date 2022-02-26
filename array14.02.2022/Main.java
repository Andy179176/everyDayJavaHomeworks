package telran.java_lessons;

import java.util.Arrays;

public class Main {
    //Implement the previous task «check parentheses» based on the fact that brackets can be of different types: () [] {}


    public static void main(String[] args) {
        System.out.println(isParenthesesCorrect("9*({8+3)}-( (9+1)5)")); //true
        System.out.println(isParenthesesCorrect("9(8+3)]- (9+1)5)"));   // false
        System.out.println(isParenthesesCorrect("98+3)-( (9]+1)*5"));   // false
        System.out.println(isParenthesesCorrect("9 -2){}"));             // false
        int[] array = {2, 4, -3, 7};

        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static boolean isParenthesesCorrect(String str) {
        int parenthes = 0;
        for (int i = 0; i < str.length(); i++) {
            if (parenthes < 0 || parenthes % 2 != 0) {
                return false;
            }
            String symbol = str.substring(i, i + 1);
            if (symbol.equals("(") || symbol.equals("[") || symbol.equals("{")) {
                parenthes++;
                continue;
            }
            if (symbol.equals(")") || symbol.equals("]") || symbol.equals("}")) {
                parenthes--;
            }
            if (parenthes == 0) {
                return true;
            } else {
                return false;
            }
        }
        return parenthes == 0;
    }


    //Implement the program that sort an array of random integers. Use the algorithm we talked about at class
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }

    }

    public static int minIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

}

