import java.util.Scanner;

class HeapSort {
    public void heapSort(int[] array) {
        int n = array.length;

        
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        
        for (int i = n - 1; i >= 1; i--) {
            
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest])
            largest = left;

        if (right < n && array[right] > array[largest])
            largest = right;

        if (largest != i) {
            
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }
    }
}


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        int[] array = new int[index];
        HeapSort heapSort = new HeapSort();

        for (int i = 0; i < index; i++) {
            array[i] = scan.nextInt();
        }
        heapSort.heapSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
