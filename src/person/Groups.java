package person;

import Emotion.Emotion;

import java.util.Objects;

public abstract class Groups {
    private final String name;
    private final int countOfPeople;


    public Groups(String name, int countOfPeople) {
        this.name = name;
        this.countOfPeople = countOfPeople;

    }


    public String getName() {
        return name;
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }


    public String toString() {
        return "Groups{" +
                "name='" + name + '\'' +
                ", currentEmotion=" + countOfPeople +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Groups groups = (Groups) o;
        return countOfPeople == groups.countOfPeople && Objects.equals(name, groups.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countOfPeople);
    }
}
