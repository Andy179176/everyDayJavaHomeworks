package telran.practice;

import java.util.Arrays;

public class TwoBigArrays {
    public static void main(String[] args) {
        int[] array1 = {13, 78, 12, 18, 12, 36};
        int[] array2 = {14, 18, 11, 70};
//        String[]students = {"Alena","Masha","Vasya"};
//        int[][]grades  ={{2,4,3,2},{3,5,5,5},{6,6,6,6,6}};
//        studentsGrade(students,3, grades);

        sortTwoArrays(array1, array2);

    }
    //Given two big arrays of integers from 10 to 99 (it’s a result of some of test). You should implement the method that mutually sorts these arrays. You could use any algorithm you know
    //Example {13,78,12,18,12,36} {14,18,11,70} -> {11,12,12,13,14,18} {18,36,70,78}


    public static void sortTwoArrays(int[] array1, int[] array2) {
        int[] helperArray = new int[array1.length + array2.length];// создаем вспомогательный массив

        int count = 0;
        //заполняем вспомогательный массив двумя данными массивами
        for (int i = 0; i < array1.length; i++) {
            helperArray[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            helperArray[count++] = array2[j];
        }

        Arrays.sort(helperArray); //сортируем вспомогательный массив


        for (int i = 0; i < array1.length; i++) {//разделяем массив1 обратно
            array1[i] = helperArray[i];
        }

        int k = helperArray.length - array2.length;//длина второго данного отсортированного уже массива

        for (int i = 0; i < array2.length; i++, k++) {//разделяем массив2
            array2[i] = helperArray[k];

        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    //** Implement the previous task, but think in your system there is not enough memory for the resulting array[arr1.lenght+arr2.length] for merge like mergeSort does.
    public static void sortTwoArrays2(int[] array1, int[] array2) {

    }


    //1 Given two arrays. The first is String[n] students – names of students. The second is int[n][] grades – the array of grades for student homework. Every row of grades array is one student's grades (grades[k] is the grades of students[k]). Note, that each student has a different number of grades. You should implement the program that finds and displays the student with highest GPA and the score.
//Example:
//{Jack, Nick} { { 3,4,2}, { 5,5,5,4} } -> Nick 4.75
//
//* In previous task you should print students sorted by GPA
//Example:
//{Jack, Nick, John} { { 3,5,2}, { 5,5,5,4}, {5,5,5,5,5,5,5,5 } } ->
//John 5
//Nick 4.75
//Jack 3.333
    public static void studentsGrade(String[] students, int n, int[][] grades) { // n is the length of the array of students and it's equal to number
                                                                                 // of rows the grades array. So, I think, you should not pass n as an argument
        double sum = 0;
        double max = 0;
        int maxRow = 0;
        double gpa = 0;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                sum = sum + grades[i][j];

            }
            gpa = sum /grades[i].length;  //why grades[i].length+1 ?
            if (gpa > max) {
                max = gpa;
                maxRow = i;
                sum = 0;

            } /* else {    // i think, you do not need increment i here 
                i++;
            } */

        }
        System.out.println(students[maxRow] + " is student with max GPA = " + gpa);

    }

}


