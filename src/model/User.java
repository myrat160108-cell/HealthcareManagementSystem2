package model;

import java.util.Objects;

public abstract class User {
    protected int id;
    protected String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getRole();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
