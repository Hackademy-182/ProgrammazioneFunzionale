
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        List<Apple> apples = List.of(
            new Apple (Color.green, 150),
            new Apple (Color.red, 120),
            new Apple (Color.green, 170),
            new Apple (Color.red, 135),
            new Apple (Color.green, 155),
            new Apple (Color.red, 140),
            new Apple (Color.green, 147)
        );

        List<Apple> redApples = apples.stream().filter(a -> a.getColor().equals(Color.red)).toList();
        List<Apple> greenApples = apples.stream().filter(a -> a.getColor().equals(Color.green)).toList();
        List<Apple> lightApples = apples.stream().filter(a -> a.getWeight() < 150).toList();
        List<Apple> heavyApples = apples.stream().filter(a -> a.getWeight() >= 150).toList();

        System.out.println("Le mele rosse sono: " + redApples.size());
        System.out.println("Le mele verdi sono: " + greenApples.size());
        System.out.println("Le mele leggere sono: " + lightApples.size());
        System.out.println("Le mele pesanti sono: " + heavyApples.size());

    }

}
