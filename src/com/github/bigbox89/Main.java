package com.github.bigbox89;
import java.io.FileNotFoundException;
//TODO протестировать метод Remove (Object o)
//TODO в класс Intern добавить метод .toString

public class Main {

    private static Object ResultComparator;

    public static void main(String[] args) throws FileNotFoundException {

        InternsRepository internsRepository = new InternsRepository();

        internsRepository.getAllInterns();

        Intern bad = new Intern("Саша","Богдан",0,0);
        Intern second = new Intern("Коля","Марсель",23,6);
        Crew<Intern> spisok  = internsRepository.getAllInterns();

        spisok.printAll(spisok);
        System.out.println("--------------------");
        spisok.remove(bad);
        spisok.remove(second);
        spisok.printAll(spisok);
        System.out.println("--------------------");
        spisok.sort();
        spisok.printAll(spisok);

    }
}
