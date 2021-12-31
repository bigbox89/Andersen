package com.github.bigbox89;
import java.io.FileNotFoundException;

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
        /*spisok.remove(bad);
        spisok.remove(second);
        spisok.printAll(spisok);
        System.out.println("--------------------");
        spisok.sort();
        spisok.printAll(spisok);

        System.out.println(spisok.get(2).toString());
         */
        spisok.isCapitan();

    }
}
