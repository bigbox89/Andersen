import java.util.Objects;

public class Intern implements Comparable<Intern>{
    private String name, lastName;
    private int test1, test2;

    public Intern(String name, String lastName, int test1, int test2) {
        this.name = name;
        this.lastName = lastName;
        this.test1 = test1;
        this.test2 = test2;
    }

    public String getName() {
        return name;
    }

    public String getFemale() {
        return lastName;
    }

    public int getTest1() {
        return test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFemale(String female) {
        this.lastName = female;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intern intern = (Intern) o;
        return test1 == intern.test1 &&
                test2 == intern.test2 &&
                Objects.equals(name, intern.name) &&
                Objects.equals(lastName, intern.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, test1, test2);
    }

    @Override
    public int compareTo(Intern o)
    {
        return this.test1 - o.test1 ;
    }
}
