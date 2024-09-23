package com.set;

import java.util.Objects;

public class Actor implements Comparable<Actor>{


    private String name;
    private String industry;
    private int noOfMovies;

    public Actor(String name, String industry, int noOfMovies) {
        this.name = name;
        this.industry = industry;
        this.noOfMovies = noOfMovies;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", noOfMovies=" + noOfMovies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return noOfMovies == actor.noOfMovies && Objects.equals(name, actor.name) && Objects.equals(industry, actor.industry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, industry, noOfMovies);
    }

    @Override
    public int compareTo(Actor a) {
        return this.name.compareTo(a.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getNoOfMovies() {
        return noOfMovies;
    }

    public void setNoOfMovies(int noOfMovies) {
        this.noOfMovies = noOfMovies;
    }
}
