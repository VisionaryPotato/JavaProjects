import java.util.Arrays;

interface PriorityQueue<T extends Comparable<T>> {
    public void push(T item);
    public T pop();
    public T peek();
}

public class Heap<T extends Comparable<T>> implements PriorityQueue<T> {

    private T[] heap;
    private int size;

    public Heap(int capacity) {
        heap = (T[]) new Comparable[capacity];
    }

    /* Given an index in the heap array, calculate what the parent node's
     * index is.
     */
    private int parent(int index) {
        index = (index - 1) / 2;
        return index;
    }

    /* Given an index in the heap array, calculate what the right child's
     * index is.
     */
    private int rchild(int index) {
        index = 2 * (index + 1);
        return index;
    }

    /* Given an index in the heap array, calculate what the left child's
     * index is.
     */
    private int lchild(int index) {
        index = 2 * index + 1;
        return index;
    }

    private boolean hasLeftChild(int index) {
        return heap[index] != null;
    }

    private boolean hasRightChild(int index) {
        return heap[index] != null;
    }

    /* Swap the items in the array at index1 and index2.
     */
    private void swap(int index1, int index2) {
        T tempHeap = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = tempHeap;
    }

    /* Perform a heapify starting at the given index.
     * Check the index's two children to see if you should swap the node
     * with either of these children. If you should, do the swap, and call
     * another bubbleDown on the index you swapped to.
     */
    private void bubbleDown(int index) {
        if(heap[index].compareTo(heap[lchild(index)]) < 0){
            swap(index, lchild(index));
            bubbleDown(lchild(index));
        }
        if(heap[index].compareTo(heap[rchild(index)]) < 0) {
            swap(index, rchild(index));
            bubbleDown(rchild(index));
        }
    }

    /* Perform a "reverse-heapify" starting at the current index.
     * Check the index's parent to see if you should swap the two; If you
     * should, do a swap and call another bubbleUp on the index you swapped to.
     *
     * This should be a significantly simpler method than bubbleDown.
     */
    private void bubbleUp(int index) {
        if(heap[index].compareTo(heap[parent(index)]) > 0){
            swap(index, parent(index));
            bubbleUp(parent(index));
        }
    }

    /* Add an item to the queue.
     * Add the item at the end of the array, then bubble it up.
     * Assume that the heap will have space.
     */
    public void push(T item) {
        heap[size] = item;
        bubbleUp(size);
        size++;
    }

    /* Remove the highest priority item from the queue.
     * Replace the item at the root (index 0) with the last item
     * in the array, then bubble it down.
     * Assume that the heap won't be empty.
     */
    public T pop()
    {
        T tempVal = heap[0];
        heap[0] = heap[size-1];
        bubbleDown(0);
        size--;
        heap[size] = tempVal;
        return tempVal;
    }

    /* Return the highest priority item from the queue.
     */
    public T peek() {
        return heap[0];
    }

    public String toString() {
        return Arrays.toString(heap);
    }

    public static void main(String[] args) {
        Heap<Integer> numbers = new Heap<Integer>(10);

        numbers.push(2270);
        numbers.push(19720);
        numbers.push(3430);
        numbers.push(2001);
        numbers.push(1998);
        numbers.push(7);

        System.out.println(numbers);

        System.out.printf("%-15s", numbers.pop());
        System.out.println(numbers);
        System.out.printf("%-15s", numbers.pop());
        System.out.println(numbers);
        numbers.peek();
        System.out.printf("%-15s", numbers.pop());
        System.out.println(numbers);
        System.out.printf("%-15s", numbers.pop());
        System.out.println(numbers);

        numbers.push(404);
        numbers.push(7778);
        numbers.push(27015);
        System.out.println("               (Three new numbers pushed)");
        System.out.println("               " + numbers);

        System.out.printf("%-15s", numbers.pop());
        System.out.println(numbers);
        System.out.printf("%-15s", numbers.pop());
        System.out.println(numbers);
        System.out.printf("%-15s", numbers.pop());
        System.out.println(numbers);
        numbers.peek(); // make sure peek doesn't change anything!
        System.out.printf("%-15s", numbers.pop());
        System.out.println(numbers);
        System.out.printf("%-15s", numbers.pop());
        System.out.println(numbers);
    }

}

/*
[19720, 2270, 3430, 2001, 1998, 7, null, null, null, null]
19720          [3430, 2270, 7, 2001, 1998, 19720, null, null, null, null]
3430           [2270, 2001, 7, 1998, 3430, 19720, null, null, null, null]
2270           [2001, 1998, 7, 2270, 3430, 19720, null, null, null, null]
2001           [1998, 7, 2001, 2270, 3430, 19720, null, null, null, null]
               (Three new numbers pushed)
               [27015, 7778, 404, 7, 1998, 19720, null, null, null, null]
27015          [7778, 1998, 404, 7, 27015, 19720, null, null, null, null]
7778           [1998, 7, 404, 7778, 27015, 19720, null, null, null, null]
1998           [404, 7, 1998, 7778, 27015, 19720, null, null, null, null]
404            [7, 404, 1998, 7778, 27015, 19720, null, null, null, null]
7              [7, 404, 1998, 7778, 27015, 19720, null, null, null, null]
*/