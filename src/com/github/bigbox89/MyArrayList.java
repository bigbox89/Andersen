package com.github.bigbox89;

public interface MyArrayList<T> {

    boolean add (T t);

    boolean add(int index);

    T get(int ndex);

    T get (T t);

    void set (int index, T t);

    void remove (int index);

    void remove(T t);

    int sixe();

    void sort(Comparable <T> T);
}
