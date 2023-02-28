package transport;

import java.util.Objects;

public class Vehicle {
    private final VehicleType vehicleType;
    private SoundType soundType;
    private String color;
    private WindowType window;

    public Vehicle(VehicleType vehicleType, SoundType soundType, String color, WindowType window) {
        this.vehicleType = vehicleType;
        this.soundType = soundType;
        this.color = color;
        this.window = window;
    }

    public String printVehicleType() {
        switch (vehicleType) {
            case CAR -> {
                return("Машина ");
            }
            case TRUCK -> {
                return ("Грузовик ");
            }
            case MOTORCYCLE -> {
               return ("Мотоцикл ");
            }
            case POLICE_TRUCK -> {
                return ("Полицейский грузовик ");
            }
            default -> {
                return ("Неизвестная машина");
            }

        }
    }
        public String printSoundType() {
            switch (soundType) {
                case QUITE -> {
                    return ("Тихо ");
                }
                case LOUD -> {
                    return ("Громко ");
                }
                case SILENT -> {
                    return ("Бесшумно ");
                }
                default -> {
                    return ("С неизвестным звуком");
                }
            }
        }

        public String  printWindowType() {
            switch (window) {
                case TINTED -> {
                    return ("С тонированными окнами ");
                }
                case LATTICE -> {
                    return ("С решетчатыми окнами ");
                }
                case GLASS -> {
                    return ("С стеклянными окнами ");
                }
                default -> {
                    return ("Без окон ");
                }
            }
        }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, soundType, getColor(), window);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", soundType=" + soundType +
                ", color=" + color +
                ", window=" + window +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleType == vehicle.vehicleType && soundType == vehicle.soundType && Objects.equals(color, vehicle.color) && window == vehicle.window;
    }
}

