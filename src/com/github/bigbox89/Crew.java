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

    /**
     * Добавляет нового интерна(студента) в конец списка
     * @param t добавляемый студент
     * @return
     */
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

    /**
     * Получить студента по индексу
     * @param index индекс искомого студента
     * @return студент под заданным индексом
     */
    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return student[index];
        } else return null;
    }

    @Override
    public T get(Object o) {
        return (T) o;
    }

    @Override
    public void set(int index, Object o)
    {
        if (index >= 0 && index < size)
        {
            student[index] = (T) o;
        }
        else System.out.println("Нет такого элемента, который вы хотели заменить");
    }

    @Override
    public void remove(int index)
    {
        if (index >= 0 && index < size)
        {

        }
        else System.out.println("Нет такого элемента, который вы хотели заменить");
    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void sort(Comparable T) {

    }

    /**
     * Печать в консоль данных студента
     * @param student - печатаемый студент
     */
    public void print(Intern student)
    {
        System.out.println(student.getName() + " " + student.getFemale() + " | " + student.getTest1() + " | " + student.getTest2());
    }

    public void printAll(Crew team)
    {
        for (int i = 0; i<team.size; ++i )
        {
            print((Intern) team.get(i));
        }
    }


}
