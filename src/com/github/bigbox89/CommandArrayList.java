package com.github.bigbox89;

import java.util.Arrays;

public class CommandArrayList<T> implements MyArrayList{

    private static final int DEFAULT_SIZE = 10;

    private T[] elements;
    private int size;

    public CommandArrayList() {
        this.elements = (T[])new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    /**
     * Добавляет элемент в конец списка
     * @param t добавляемый элемент
     */

    @Override
    public boolean add(Object t) {
        // если массив уже заполнен
        if (isFullArray()) {
            resize();
        }

        this.elements[size] = (T) t;
        size++;
        return true;
    }

    @Override
    public boolean add(int index) {
        return false;
    }

    /**
     * Получить элемент по индексу
     * @param index индекс искомого элемента
     * @return элемент под заданным индексом
     */
    @Override
    public Object get(int index) {
        if (isCorrectIndex(index)) {
            return elements[index];
        } else {
            return null;
        }
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
        T[] elementsRemovedOne = (T[])new Object[this.size-1];
        //добавляем в дублирующий массив элементы с индексом меньше удаляемого
        if (index > 0)
            for (int i = 0; i < index; i++){
                elementsRemovedOne[i] = elements[i];
            }
        //сдвигаем элементы массива влево
        for (int i = index; i < this.size - 1; i++){
            elementsRemovedOne[i] = elements[i + 1];
        }
        this.size = size - 1;
        this.elements = elementsRemovedOne;
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

    public void clear() {
        this.size = 0;
    }

    private boolean isCorrectIndex(int index) {
        return index >= 0 && index < size;
    }

    private void resize() {
        // запоминаем старый массив
        T[] oldElements = this.elements;
        // создаем новый массив, который в полтора раза больше предыдущего
        this.elements = (T[])new Object[oldElements.length + oldElements.length / 2];
        // копируем все элементы из старого массива в новый
        for (int i = 0; i < size; i++) {
            this.elements[i] = oldElements[i];
        }
    }

    private boolean isFullArray() {
        return size == elements.length;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
