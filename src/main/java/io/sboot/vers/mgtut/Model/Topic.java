package io.sboot.vers.mgtut.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//With this entity annotation, JPA knows to create a table in the db
//with the three columns mentioned as class variable
public class Topic {
    
    @Id
    private String id; //ID annotation makes id as the primary key of the table
    private String name;
    private String desciption;


    public Topic() {
    }

    public Topic(String id, String name, String desciption) {
        this.id = id;
        this.name = name;
        this.desciption = desciption;
    }

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesciption() {
        return desciption;
    }
    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
