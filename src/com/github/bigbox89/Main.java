
import java.io.FileNotFoundException;
//TODO протестировать метод Remove (Object o)
//TODO в класс Intern добавить метод .toString

public class Main {

    private static Object ResultComparator;

    public static void main(String[] args) throws FileNotFoundException {

        InternsRepository internsRepository = new InternsRepository();

        internsRepository.getAllInterns();

        Intern bad = new Intern("Вася","Васильев",27,23);
        Intern second = new Intern("Вася","Андреев",56,55);
        Crew<Intern> spisok  = internsRepository.getAllInterns();

        spisok.sort();
        spisok.printAll(spisok);
        System.out.println("--------------------");
        spisok.remove(bad);
        spisok.remove(second);
        spisok.printAll(spisok);

    }
}
