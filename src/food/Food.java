package food;

import java.util.Objects;

public class Food {
    private final int calories;
    private final String foodType;

    public Food(String foodType, int calories) {
        this.foodType = foodType;
        this.calories = calories;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFoodType(), getCalories());
    }

    @Override
    public String toString() {
        return "Food{" + "foodType='" + foodType + '\'' + ", calories=" + calories + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return calories == food.calories && Objects.equals(foodType, food.foodType);
    }
}
