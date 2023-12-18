import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(
                1993,6,6),
                new ArrayList<>(), "Chumka", "Boss", 4);


        Animal eagle = new Eagle("Kesha", LocalDate.of(
                1996,6,6),
                new ArrayList<>(), "Chumka", "Boss");

        Snake snake = new Snake("pshh", LocalDate.of(2000, 2, 12),
                new ArrayList<>(), "Chumka", "Boss");

        Animal duck = new Duck("Krya", LocalDate.of(1999, 1, 3),
                new ArrayList<>(), "Chumka", "Boss");


        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);

        System.out.println("________________________________________");

        barsik.lifeCycle();
        System.out.println("________________________________________");

        snake.snakeLifeCycle();
        System.out.println("________________________________________");

        duck.duckLifeCycle();
    }

}

//    String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner