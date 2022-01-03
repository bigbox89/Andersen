package com.github.bigbox89;

import java.io.*;

public class InternsRepository {

    //Метод для считывания списка пользователей из файла
    private Crew<Intern> getInternsFromFile() throws FileNotFoundException {
        String inputFileName = "interns2.txt";

        Crew<Intern> internsList = new Crew<Intern>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            reader.lines().forEach(line -> {
                Intern internFromTxt = new Intern(line);
                internsList.add(internFromTxt);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return internsList;
    }

    public Crew<Intern> getAllInterns() throws FileNotFoundException {
        return getInternsFromFile();
    }


}
