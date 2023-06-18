package ch.hslu.prg.block07.container;

public class SimpleGenericList <T> {
    private T content[];
    private int size;

    @SuppressWarnings(" unchecked ")
    public SimpleGenericList (int maxCapacity) {
        content = (T[]) new Object [maxCapacity];
    }

    public int getSize() {
        return size;
    }

    public boolean add (T object) {
        if ( size < content.length) {
            content[size] = object;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public T get (int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return content [index];
    }

    public boolean remove (int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        for ( int i = index; i < size - 1; i ++) {
            content [index] = content [ index + 1];
        }
    
        content [size - 1] = null;
        size--;
        return true;
    }
}