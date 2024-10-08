package serealization;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Serialization{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
