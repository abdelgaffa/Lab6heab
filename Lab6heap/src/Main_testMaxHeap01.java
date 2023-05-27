public class Main_testMaxHeap01 {
    public static void main(String[] args) {
        MaxHeap heap1= new MaxHeap(new int []{3, 17, 10, 14, 12, 11, 15, 8 });
        System.out.println(heap1);
        System.out.println(heap1.isMaxHeap());
     //   System.out.println(heap1.isMinHeap());

        heap1.maxHeapify(0);
        System.out.println(heap1);

       // heap1.MinHeapify(0);
       // System.out.println(heap1);

        MaxHeap heap2= new MaxHeap(new int []{17,15,13,14,12,11,8,9,1,4,2,10 });
        System.out.println(heap2);
        System.out.println(heap2.isMaxHeap());
     //   System.out.println(heap2.isMinHeap());


        MaxHeap heap3= new MaxHeap();
        heap3.readFromFile("src\\data2.txt");
        System.out.println(heap3);
        System.out.println(heap3.isMaxHeap());
     //   System.out.println(heap3.isMinHeap());


          int[] a= {20,5,7,13,10,16,11,2,8,3,1,4};
          int[] b={3,6,12,1,0,25,14,7,4,10,5,11} ;
          int[] c={28,11,7,9,20,18,22,19,16,29,5,13,21,27,17,15,30,10,26,23,2,25,1} ;


    }
}
