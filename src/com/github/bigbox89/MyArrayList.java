package com.github.bigbox89;

public interface MyArrayList<T> {

    /**
     * Добавляет элемент в конец списка
     * @param t добавляемый элемент
     */
    boolean add (T t);


    boolean add(int index);

    T get(int index);

    T get (T t);

    void set (int index, T t);

    void remove (int index);

    void remove(T t);

    int size();

    void sort(Comparable <T> T);
}
