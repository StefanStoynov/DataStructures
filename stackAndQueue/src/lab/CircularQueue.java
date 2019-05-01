package lab;

public class CircularQueue<E> {

    private static final int INITIAL_CAPACITY = 16;
    private E[] elements;
    private int startIndex = 0;
    private int endIndex = 0;
    private int size;

    public CircularQueue() {
        this.elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    public CircularQueue(int initialCapacity) {
        this.elements = (E[]) new Object[initialCapacity];
    }

    public int size() {
        return this.size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public void enqueue(E element) {
        if (this.size >= this.elements.length) {
            this.grow();
        }
        this.elements[endIndex] = element;
        this.endIndex = (this.endIndex + 1) % this.elements.length;
        this.size++;
    }

    private void grow() {
        E[] newArray = (E[]) new Object[this.elements.length * 2];
        this.copyAllElements(newArray);
        this.elements = newArray;
        this.startIndex = 0;
        this.endIndex = this.size;
    }

    private void copyAllElements(E[] newArray) {
        int sourceIndex = this.startIndex;
        int destinationIndex = 0;
        for (int i = 0; i < this.size; i++) {
            newArray[destinationIndex] = this.elements[sourceIndex];
            sourceIndex = (sourceIndex + 1) % this.elements.length;
            destinationIndex++;
        }
    }

    public E dequeue() {
        if (this.size == 0) {
            throw new IllegalArgumentException("The queue is empty!");
        }
        E result = this.elements[startIndex];
        this.startIndex = (this.startIndex + 1) % this.elements.length;
        this.size--;
        return result;
    }

    public E[] toArray() {

        E[]result = (E[])new Object[this.size];
        copyAllElements(result);
        return result;
    }

}
