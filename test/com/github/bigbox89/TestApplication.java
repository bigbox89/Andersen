package com.github.bigbox89;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestApplication {

    private Crew<String> list = new Crew<>();

    @Before
    public void cleanList() {
        list.clean();
    }

    @Test
    public void sizeTest() {
        assertEquals(list.size(), 0);
        fillList();
        assertEquals(list.size(), 5);
    }


    @Test
    public void addTest(){
        assertEquals(list.size(), 0);
        list.add("first");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        assertEquals(list.size(), 5);
    }

    @Test
    public void removeTest() {
        fillList();
        assertEquals(list.size(), 5);

        list.remove(1);

        assertEquals(list.size(), 4);

        list.remove("first");

        assertEquals(list.size(), 3);
    }

    @Test
    public void clearTest() {
        fillList();
        assertEquals(list.size(), 5);
        list.clean();
        assertEquals(list.size(), 0);
    }

    @Test
    public void getTest() {
        fillList();
        assertEquals(list.get(1), "Second");
    }

    private void fillList() {
        list.add("first");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
    }
}