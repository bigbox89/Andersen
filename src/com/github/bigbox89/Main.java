package com.github.bigbox89;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code

        CommandArrayList<CourseMember> commandArrayList = new CommandArrayList();
        commandArrayList.add(new CourseMember("Petr", "Pyatkov", 60, 60));
        commandArrayList.add(new CourseMember("Aleksey", "Karpenkov", 56, 53));
        commandArrayList.add(new CourseMember("Nikita", "Riazancev", 68, 66));

        System.out.println(commandArrayList.toString());
       // commandArrayList.sort();
    }
}
