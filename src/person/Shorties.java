package person;
import Emotion.Emotion;
import food.Food;

import java.util.Objects;

public class Shorties extends Groups {
    public Shorties(String name, int countOfPeople) {
        super(name,countOfPeople);
    }
    public void toDo(String action, String target){

        System.out.println(getName() + action+target);
    }
    public void eat(String action, Food food){

       System.out.println(action+food.getFoodType());
    }
    public void sleep(String action, boolean snore) {
        if (snore) {
            System.out.println(getName() + action + " и кто-то захрапел");
        } else {
            System.out.println(getName() + action);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCountOfPeople());
    }

    public String toString() {
        return "Groups{}";
    }


    }
