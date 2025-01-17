package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Cat {
    private Integer id;
    private String name;
    private Date dateOfBirth;
    private Boolean sex;

    public Cat() {
    }

    public Cat(String name, Date dateOfBirth, Boolean sex) {

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    @Id //khoa chinh
    @GeneratedValue //Tu dong tang dan
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex=" + sex +
                '}';
    }
}
