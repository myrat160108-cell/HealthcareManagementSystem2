package model;

import java.util.Objects;

public class Freelancer extends User {
    private String skill;
    private int experienceYears;

    public Freelancer(int id, String name, String skill, int experienceYears) {
        super(id, name);
        this.skill = skill;
        this.experienceYears = experienceYears;
    }

    public String getSkill() {
        return skill;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String getRole() {
        return "Freelancer";
    }

    @Override
    public String toString() {
        return "Freelancer{id=" + id +
                ", name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Freelancer)) return false;
        Freelancer that = (Freelancer) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
