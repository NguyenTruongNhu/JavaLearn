package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Author {
    @Id
    private String author_id;
    private String name;
    private Date namdateOfBirth;

    public Author() {
    }

    public Author(String author_id, String name, Date namdateOfBirth) {
        this.author_id = author_id;
        this.name = name;
        this.namdateOfBirth = namdateOfBirth;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNamdateOfBirth() {
        return namdateOfBirth;
    }

    public void setNamdateOfBirth(Date namdateOfBirth) {
        this.namdateOfBirth = namdateOfBirth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id='" + author_id + '\'' +
                ", name='" + name + '\'' +
                ", namdateOfBirth=" + namdateOfBirth +
                '}';
    }
}
