
import java.util.Collections;

public class Main {

    private static Object ResultComparator;

    public static void main(String[] args)
    {
        Intern bad = new Intern("Худший","Студент",1,10);
        Intern best = new Intern("Лучший","Интерн",1000000,99);
        Intern fifty = new Intern("Средний", "Студент", 5000, 50);
        Crew<Intern> spisok  = new Crew<>();
        spisok.add(bad);
        spisok.add(best);
        spisok.add(fifty);
        spisok.sort();
        spisok.printAll(spisok);

    }
}
