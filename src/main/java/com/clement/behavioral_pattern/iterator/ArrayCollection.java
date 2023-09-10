package com.clement.behavioral_pattern.iterator;

import java.util.Iterator;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 17:26
 * @Desc
 * @Version 1.0
 */
public class ArrayCollection<T> implements Iterable<T> {
    private final T[] arr;

    private ArrayCollection(T[] arr) {
        this.arr = arr;
    }

    public static <T> ArrayCollection<T> of(T[] arr) {
        return new ArrayCollection<>(arr);
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }
    public class ArrayIterator implements Iterator<T>{
        private  int cur=0;

        @Override
        public boolean hasNext() {
            return cur<arr.length;
        }

        @Override
        public T next() {
            return arr[cur++];
        }
    }
}
