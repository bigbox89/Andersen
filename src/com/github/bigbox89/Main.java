package com.github.bigbox89;

public class Main {

    public static void main(String[] args)
    {
        Intern first = new Intern("Гайниев","Эдуард",60,60);
        Crew<Intern> lines  = new Crew<>();
        lines.add(first);
    }
}
