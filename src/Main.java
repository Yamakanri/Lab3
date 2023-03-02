import Emotion.Emotion;
import person.Human;
import food.Food;
import person.Policemans;
import person.Role;
import person.Shorties;
import place.EnvironmentObject;
import place.Place;
import transport.SoundType;
import transport.Vehicle;
import transport.VehicleType;
import transport.WindowType;


import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Event someGoodWords = new Event("После этих слов");
        Emotion shortiesEmotion = new Emotion("хорошо");
        Shorties shorties = new Shorties(" Все(м) ", 7);
        someGoodWords.resultEvent(shorties.getName() + shortiesEmotion.getTypeOfEmotion());

        Shorties noOne = new Shorties("Никто", 0);
        noOne.toDo(" не хотел ложиться ", "спать");

        Food bread = new Food("Хлеб", 230);
        Event afterDinner = new Event("Наконец " + bread.getFoodType() + " был сьеден и" );

        Human pyzir = new Human("Пузырь", 55.2f, Role.CITIZEN);

        EnvironmentObject pillow = new EnvironmentObject("Подушку", "", 0, 5);
        pyzir.toDo(" опустил голову на ", pillow.getEnvironmentObject());
        pyzir.sleep(" уснул", true);

        afterDinner.resultEvent(shorties.getName() + "заснули");

        Place seafront = new Place(" набережная",20, 1);
        EnvironmentObject lighter = new EnvironmentObject("Фонари", " погасли", 25, 1);
        seafront.description(lighter);

        Place underBridge = new Place("Под мостом ",30, 2);
        underBridge.placeChanges(underBridge.getName(), "стало темно ");

        Place onBridge = new Place("на мосту", 30, 10);
        EnvironmentObject auto = new EnvironmentObject("Автомобили", "реже проносились", onBridge.getX(), onBridge.getY());
        System.out.println(auto.getEnvironmentObject() + " " + auto.getAction() + " " + onBridge.getName());

        Vehicle policeAuto = new Vehicle(VehicleType.POLICE_TRUCK, SoundType.SILENT, "черный ", WindowType.LATTICE);
        Place toTheBridge = new Place("К мосту ", 29, 2);
        System.out.println(toTheBridge.getName() + policeAuto.printSoundType() + "подкатил " + policeAuto.getColor()+policeAuto.printVehicleType() + policeAuto.printWindowType());

        Policemans policemans = new Policemans(" Полицейских ", 10);
        Human rvigl = new Human(" Рвигль", 38.9f, Role.CAPTAIN);
        System.out.println("Из " + policeAuto.printVehicleType() + policemans.toDo("выскочило ","" ) + policemans.getCountOfPeople() + policemans.getName() + "под командовнием " +rvigl.printRole()+ rvigl.getName());
    }
}
