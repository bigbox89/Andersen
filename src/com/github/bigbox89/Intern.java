package com.github.bigbox89;

public class Intern {
    private String name, female;
    private int test1, test2;
    private int size;

    public Intern(String name, String female, int test1, int test2) {
        this.name = name;
        this.female = female;
        this.test1 = test1;
        this.test2 = test2;
    }

    public String getName() {
        return name;
    }

    public String getFemale() {
        return female;
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
        this.female = female;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public int sizeIntern()
    {
        return 5;
    }

}
