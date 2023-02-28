package Emotion;

import java.util.Objects;

public class Emotion {
    private final String typeOfEmotion;

    public Emotion(String typeOfEmotion) {
        this.typeOfEmotion = typeOfEmotion;
    }

    public String getTypeOfEmotion() {
        return typeOfEmotion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeOfEmotion());
    }

    @Override
    public String toString() {
        return " настроение " + typeOfEmotion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emotion emotion = (Emotion) o;
        return Objects.equals(typeOfEmotion, emotion.typeOfEmotion);
    }
}

