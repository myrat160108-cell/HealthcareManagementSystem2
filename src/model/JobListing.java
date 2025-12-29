package model;

import java.util.Objects;

public class JobListing {
    private int id;
    private String title;
    private String category;
    private double budget;

    public JobListing(int id, String title, String category, double budget) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "JobListing{id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", budget=" + budget +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobListing)) return false;
        JobListing that = (JobListing) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
