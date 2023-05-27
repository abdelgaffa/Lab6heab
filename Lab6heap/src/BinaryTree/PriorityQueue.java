package BinaryTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PriorityQueue {
    private  Myheap heap;

    public PriorityQueue() {
        heap = new Myheap();
    }

    public void addElement(int element) {
        heap.insert(element);
    }

    public int extractMinimum() {
        if (heap.isEmpty()) {
            return -1; // Return a negative value to indicate an empty queue
        }
        return heap.removeMin();
    }

    public void reduceElement(int index, int newValue) {
        heap.reduceKey(index, newValue);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("E:\\my projects\\2cemester\\Lab06heap\\src\\BinaryTree\\input02.txt"));
            FileWriter writer = new FileWriter("output.txt");

            int numOperations = scanner.nextInt();
            PriorityQueue priorityQueue = new PriorityQueue();

            for (int i = 0; i < numOperations; i++) {
                String operation = scanner.next();
                if (operation.equals("A")) {
                    int element = scanner.nextInt();
                    priorityQueue.addElement(element);
                } else if (operation.equals("X")) {
                    int minElement = priorityQueue.extractMinimum();
                    if (minElement == -1) {
                        writer.write("*\n");
                    } else {
                        writer.write(minElement + "\n");
                    }
                } else if (operation.equals("D")) {
                    int index = scanner.nextInt();
                    int newValue = scanner.nextInt();
                    priorityQueue.reduceElement(index, newValue);
                }
            }

            scanner.close();
            writer.close();

            System.out.println("Output file generated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
