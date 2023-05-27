//4
package BinaryTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSortHeapsort {
    public static void main(String[] args) {
         int []array = readArrayFormFile("E:\\my projects\\2cemester\\Lab06heap\\src\\BinaryTree\\input.txt");
        if (array.length ==0){
            System.out.println("no data");
            return;
        }

        System.out.println("Original Array: ");
        printArray(array);

        jSortHeapsort(array);
        System.out.println("Sorted Array");
        printArray(array);

    }
    private static int []readArrayFormFile(String filename){
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
          String line= reader.readLine();
          String[] elements= line.split(" ");
          int[] array= new int[elements.length];
            for (int i = 0; i <elements.length ; i++) {
                array[i]= Integer.parseInt(elements[i]);
            }
            return array;
        }catch (IOException e){
            System.out.println("Error reader file:"+e.getMessage());
            return new int [0];
        }
    }
    private static void printArray(int []array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }
    private static void jSortHeapsort(int []array){
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            jSortHeapify(array, n, i);
        }
        for (int i = n -1;i > 0;i-- ) {
            int temp = array[0];
            array[0]= array[i];
            array[i]= temp;
            jSortHeapify(array,i,0);
        }
    }
    private static void jSortHeapify(int[] array ,int n ,int i){
        int largest=i;
        int left =2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && array[left] >array[largest]){
            largest= left;
        }
        if (right < n &&array[right] > array[largest]){
            largest = right;
        }
        if (largest != i){
            int tmp = array[i];
            array[i]= array[largest];
            array[largest]= tmp;
            jSortHeapify(array,n,largest);
        }

    }
}
