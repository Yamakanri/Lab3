package place;

import java.util.Objects;

public class EnvironmentObject {
    private final String environmentObject;
    private String action;
    private int x;
    private int y;
    public EnvironmentObject(String environmentObject, String action, int x, int y){
        this.environmentObject = environmentObject;
        this.action =  action;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getAction() {
        return  action;
    }

    public String getEnvironmentObject() {
        return environmentObject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEnvironmentObject(), getAction(),getX(),getY());
    }
    @Override
    public String toString() {
        return "EnvironmentObject{" +
                "name='" + environmentObject + '\'' +
                ", action=" + action +
                ", coordinate x=" + x +
                ", coordinate y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnvironmentObject that = (EnvironmentObject) o;
        return x == that.x && y == that.y && Objects.equals(environmentObject, that.environmentObject) && Objects.equals(action, that.action);
    }
}
