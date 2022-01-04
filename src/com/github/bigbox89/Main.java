package com.github.bigbox89;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        InternsRepository internsRepository = new InternsRepository();
        internsRepository.getAllInterns();
        Intern internForRemove = new Intern("Асфандиаров", "Тимур", 47, 60);

        Crew<Intern> spisok = internsRepository.getAllInterns();
        System.out.println("Печатаем весь список");
        spisok.printAll();
        System.out.println("Удаляем элемент из массива по обьекту " + internForRemove.toString());
        spisok.remove(internForRemove);
        System.out.println("Печатаем весь список");
        spisok.printAll();
        System.out.println("Сортируем список по сумме баллов в тесте");
        spisok.sort();
        System.out.println("Печатаем весь список");
        spisok.printAll();
        System.out.println("Получаем элемент из списка с индексом 2");
        System.out.println(spisok.get(2).toString());
        System.out.println("Печатаем капитанов");
        spisok.isCapitan();

    }
}
