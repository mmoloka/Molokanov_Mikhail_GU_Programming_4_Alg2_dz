import java.util.concurrent.ThreadLocalRandom;

public class Randomiser {

    public static <T> T getRandomValue(T[] values) {
        int randomIndex = ThreadLocalRandom.current().nextInt(values.length);
        return values[randomIndex];
    }

}
