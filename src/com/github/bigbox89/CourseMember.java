package com.github.bigbox89;

import java.util.Objects;

public class CourseMember {
    private String name;
    private String surname;
    private int first_score;
    private int second_score;

    public CourseMember(String name, String surname, int first_score, int second_score) {
        this.name = name;
        this.surname = surname;
        this.first_score = first_score;
        this.second_score = second_score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseMember that = (CourseMember) o;
        return first_score == that.first_score &&
                second_score == that.second_score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_score, second_score);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getFirst_score() {
        return first_score;
    }

    public void setFirst_score(int first_score) {
        this.first_score = first_score;
    }

    public int getSecond_score() {
        return second_score;
    }

    public void setSecond_score(int second_score) {
        this.second_score = second_score;
    }

    @Override
    public String toString() {
        return "CourseMember{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", first_score=" + first_score +
                ", second_score=" + second_score +
                '}';
    }

}
