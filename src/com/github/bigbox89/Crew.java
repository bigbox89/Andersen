
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


    @Override
    public boolean add(int index) {
        return false;
    }

    @Override
    public void addElement(Object t) {
        // если массив уже заполнен
        if (isFullArray()) {
            resize();
        }

        this.student[size] = (T) t;
        size++;

    }

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

    @Override
    public T get(Object o) {
        return (T) o;
    }

    @Override
    public void set(int index, Object o) {
        if (index >= 0 && index < size) {
            student[index] = (T) o;
        } else System.out.println("Нет такого элемента, который вы хотели заменить");
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; ++i) {
                student[i] = student[i + 1];          //с учетом что get[error] = null , последний станет null
            }
        } else System.out.println("Нет такого элемента, который вы хотели удалить");

    }

    @Override
    public void remove(Object o) {
        for (int i = 0; i < this.size; i++) {

            if (o.equals(this.get(i)))
                remove(i);
        }
        this.size = size - 1;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Пузырьковая сортировка
     */
    @Override
    public void sort() {
        Crew[] sortedArrayList = new Crew[this.size];

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

    public void printAll(Crew team) {
        for (int i = 0; i < team.size; ++i) {
            print((Intern) team.get(i));
        }
    }


}
