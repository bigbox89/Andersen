package com.github.bigbox89;

public class Crew<T>  implements MyArrayList
{
    private static final int DEFAULT_SIZE = 10;
    private T[] student;
    private int size;

    public Crew() {
        this.student = (T[])new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    @Override
    public boolean add(Object t) {
        if (size < student.length) {
            this.student[size] = (T) t;
            size++;
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean add(int index) {
        return false;
    }

    @Override
    public Object get(int ndex) {
        return null;
    }

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void set(int index, Object o) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void sort(Comparable T) {

    }
}
