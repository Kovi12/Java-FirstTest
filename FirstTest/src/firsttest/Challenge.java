/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttest;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author ovidi
 */
public class Challenge implements Comparable<Challenge> {

    @Override
    public String toString() {
        return "Name: " + this.name + ", Description: " + this.description + ", Difficulty: " + this.difficulty + ", Programming Language: " + this.ProgrammingLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getProgrammingLanguage() {
        return ProgrammingLanguage;
    }

    public void setProgrammingLanguage(String ProgrammingLanguage) {
        this.ProgrammingLanguage = ProgrammingLanguage;
    }
    private String name;
    private String description;
    private Difficulty difficulty;
    private String ProgrammingLanguage;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.difficulty);
        hash = 97 * hash + Objects.hashCode(this.ProgrammingLanguage);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Challenge other = (Challenge) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.ProgrammingLanguage, other.ProgrammingLanguage)) {
            return false;
        }
        if (this.difficulty != other.difficulty) {
            return false;
        }
        return true;
    }
    

    public Challenge(String name, String description, Difficulty difficulty, String ProgrammingLanguage) {
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.ProgrammingLanguage = ProgrammingLanguage;
    }

    @Override
    public int compareTo(Challenge o) {
        return this.name.compareTo(o.getName());
        Comparator.comparing(Bill :: getName());
        }
        
        


    
}
