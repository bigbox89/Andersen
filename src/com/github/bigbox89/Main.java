package com.github.bigbox89;

public class Main {

    public static void main(String[] args)
    {
        Intern bad = new Intern("Худший","Студент",10,10);
        Intern best = new Intern("Лучший","Интерн",100,99);
        Crew<Intern> spisok  = new Crew<>();
        spisok.add(bad);
        spisok.add(best);
        spisok.printAll(spisok);
        System.out.println( spisok.size() );
        spisok.print( spisok.get(best) );
        spisok.print( spisok.get(0)      );
        spisok.set(3, best);

    }
}
