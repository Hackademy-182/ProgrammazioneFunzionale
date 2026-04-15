
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


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

        // List<Apple> redApples = apples.stream().filter(a -> a.getColor().equals(Color.red)).toList();
        // List<Apple> greenApples = apples.stream().filter(a -> a.getColor().equals(Color.green)).toList();
        // List<Apple> lightApples = apples.stream().filter(a -> a.getWeight() < 150).toList();
        // List<Apple> heavyApples = apples.stream().filter(a -> a.getWeight() >= 150).toList();

        

        // System.out.println("Le mele rosse sono: " + redApples.size());
        // System.out.println("Le mele verdi sono: " + greenApples.size());
        // System.out.println("Le mele leggere sono: " + lightApples.size());
        // System.out.println("Le mele pesanti sono: " + heavyApples.size());

        
        List<Apple> redApples = filterApples(apples, (Apple a) -> a.getColor().equals(Color.red));
        List<Apple> greenApples = filterApples(apples, (Apple a) -> a.getColor().equals(Color.green));
        List<Apple> lightApples = filterApples(apples, (Apple a) -> a.getWeight() < 150);
        List<Apple> heavyApples = filterApples(apples, (Apple a) -> a.getWeight() >= 150);

        System.out.println("Rosse: " + redApples.size());
        System.out.println("Verdi: " + greenApples.size());
        System.out.println("Leggere: " + lightApples.size());
        System.out.println("Pesanti: " + heavyApples.size());
        
    }

    public static List<Apple> filterApples (List<Apple> apples, Predicate<Apple> predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }


}
