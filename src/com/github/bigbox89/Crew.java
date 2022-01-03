package com.github.bigbox89;

public class Crew<T> implements MyArrayList {
    private static final int DEFAULT_SIZE = 3;
    private T[] student;
    private int size;

    public Crew() {
        this.student = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    /**
     * Добавляет нового интерна(студента) в конец списка (Так как метод boolean, в случае переполнения элементов просто выводит false)
     *
     * @param t добавляемый студент
     * @return
     */
    @Override
    public boolean add(Object t) {
        if (size < student.length) {
            this.student[size] = (T) t;
            size++;
            return true;
        } else
            return false;
    }

    /**
     * Метод добавляет обьект в массив
     * @Return
     */
    @Override
    public void addElement(Object t) {
        // если массив уже заполнен
        if (isFullArray()) {
            resize();
        }

        this.student[size] = (T) t;
        size++;
    }

    /**
     * Метод меняет размер массива
     * @Return
     */
    private void resize() {
        // запоминаем старый массив
        T[] oldElements = this.student;
        // создаем новый массив, который в полтора раза больше предыдущего
        this.student = (T[]) new Object[oldElements.length + oldElements.length / 2];
        // копируем все элементы из старого массива в новый
        for (int i = 0; i < size; i++) {
            this.student[i] = oldElements[i];
        }
    }

    /**
     * Метод проверяет массив на заполненность
     * @Return
     */
    private boolean isFullArray() {
        return size == student.length;
    }

    /**
     * Получить студента по индексу
     *
     * @param index индекс искомого студента
     * @return студент под заданным индексом
     */
    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return student[index];
        } else return null;
    }

    /**
     * Метод получает обьект из массива
     * @Return
     */
    @Override
    public T get(Object o) {
        return (T) o;
    }

    /**
     * Метод заменяет обьект в массиве по индексу
     * @Return
     */
    @Override
    public void set(int index, Object o) {
        if (index >= 0 && index < size) {
            student[index] = (T) o;
        } else System.out.println("Нет такого элемента, который вы хотели заменить");
    }

    /**
     * Метод удаляет обьект из массива по индексу
     * @Return
     */
    @Override
    public void remove(int index) {
        rangeCheck(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(student, index + 1, student, index, numMoved);
        }
        student[--size] = null;

    }

    /**
     * Метод проверяет выход за размеры массива
     * @Return
     */
    public void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Метод удаляет обьект из массива по обьекту
     * @Return
     */
    @Override
    public void remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (((Intern) get(i)).equals((Intern) o)) {
                remove(i);
            }
        }
    }

    /**
     * Метод возвращает размер массива
     * @Return size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Пузырьковая сортировка
     */
    @Override
    public void sort() {
        for (int i = 0; i < this.size; ++i) {
            for (int j = i + 1; j < this.size; ++j) {

                if (((Intern) this.get(i)).compareTo(((Intern) this.get(j))) < 0) {
                    Intern tempIntern = (Intern) this.get(i);
                    this.set(i, this.get(j));
                    this.set(j, tempIntern);
                }
            }
        }
    }

    /**
     * Печать в консоль данных студента
     *
     * @param student - печатаемый студент
     */
    public void print(Intern student) {
        System.out.println(student.getName() + " " + student.getFemale() + " | " + student.getTest1() + " | " + student.getTest2());
    }

    /**
     * Печать в консоль списка студентов
     * @return
     */

    public void printAll() {
        for (int i = 0; i < size; ++i) {
            print((Intern) this.get(i));
        }
    }

    /**
     * Печатает в списке капитанов (у кого второй тест >= 60)
     *
     * @return
     */
    public void isCapitan() {
        int porog = 60;
        for (int i = 0; i < this.size; ++i) {
            if (((Intern) this.get(i)).getTest1() >= porog) System.out.println(this.get(i));
        }
    }


}
