package kodlama.io.Devs.entities.concretes;

import java.util.Set;

public class ProgrammingLanguage {
    private int id;
    private String name;

    public ProgrammingLanguage() {

    }

    public ProgrammingLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
