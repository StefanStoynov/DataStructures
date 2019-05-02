package exercise;

public class p03_ImplementAnArrayBasedStack<T> {
    private static final int INITIAL_CAPACITY = 16;
    private T[] elements;
    public int size;

    public p03_ImplementAnArrayBasedStack() {
        this.elements = (T[]) new Object[INITIAL_CAPACITY];
    }

    public p03_ImplementAnArrayBasedStack(int size) {
        this.elements = (T[]) new Object[size];
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(T element) {
        if (this.size >= this.elements.length) {
            this.grow();
        }
        this.elements[size] = element;
        this.size++;
    }

    private void grow() {
        T[] newElements = (T[]) new Object[this.elements.length * 2];
        this.copyElements(newElements);
        this.elements = newElements;
    }

    private void copyElements(T[] newElements) {
        for (int i = 0; i < this.size; i++) {
            newElements[i] = elements[i];
        }
    }

    public T pop(){
        if (this.elements.length == 0){
            throw new IllegalArgumentException("Stack is empty!");
        }else{
            T element = this.elements[size-1];
            this.elements[size-1] = null;
            this.size--;
            return element;
        }
    }

    public T[] toArray(){
        T[]result = (T[])new Object[this.size];
        copyElements(result);
        return result;
    }
}
