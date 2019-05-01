package p06_ImplementingReverceList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class RevercedList<T> implements Iterable<T> {
    private int capacity;
    private int count;
    private T[] elements;

    public RevercedList() {
        this.capacity = 2;
        this.count = 0;
        this.elements = (T[]) new Object[2];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCount() {
        return this.count;
    }

    public void addItem(T element) {
        if (this.capacity > this.count) {
            this.elements[this.count] = element;
            this.count++;
        } else {
            this.capacity = this.capacity * 2;
            T[] elementsNew = (T[]) new Object[this.capacity];
            for (int i = 0; i < this.elements.length; i++) {
                elementsNew[i] = this.elements[i];
            }
            this.elements = elementsNew;
        }
    }

    public T getIndex(int index) {
        if (index < 0 || index >= this.count) {
            throw new IndexOutOfBoundsException();
        }
        return this.elements[this.count - 1 - index];
    }

    public T removeAt(int index) {
        if (index < 0 || index >= this.count) {
            throw new IndexOutOfBoundsException();
        }

        int reversedIndex = this.count - 1 - index;
        T element = elements[reversedIndex];
        this.elements[reversedIndex] = null;

        for (int i = reversedIndex + 1; i < this.count; i++) {
            elements[i - 1] = elements[i];
        }

        elements[this.count - 1] = null;
        count--;
        return element;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterator iterator = this.iterator();
        while (iterator.hasNext()){
            action.accept((T)iterator.next());
        }
    }

    class ArrayIterator implements Iterator<T>{

    int current = 0;


        @Override
        public boolean hasNext() {
            if (current< count){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public T next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }

            return elements[current++];
        }
    }
}
