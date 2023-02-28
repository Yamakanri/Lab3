package place;


import person.Human;

import java.util.Objects;

public class Place {
    private final String name;
    private final int x;
    private final int y;


    public Place(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void description(EnvironmentObject environmentObject) {
        System.out.println(environmentObject.getEnvironmentObject() + environmentObject.getAction() + " на" + name);
    }
    public void placeChanges(String name, String changes){
        System.out.print(name + changes);
    }
    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getX(), getY());
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", coordinate x=" + x +
                ", coordinate y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return x == place.x && y == place.y && Objects.equals(name, place.name);
    }
}

