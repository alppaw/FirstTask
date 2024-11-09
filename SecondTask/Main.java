package SecondTask;


import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1234, "Vova", "Pain", 26, "Russia"));
        users.add(new User(1111, "Aloha","Dance", 21, "Ukraine"));
        users.add(new User(4321,"Ilia","Yatoro",18,"Ukraine"));
        users.add(new User(4567,"Miroslav","Mira",15,"Belorussia"));
        users.add(new User(3222, "Magomed","COllapse",17,"Dagestan"));

        var userService = new UserService();

        System.out.println("Сортировка по фамилии : ");
        userService.sortLastName(users).forEach(System.out::println);

        System.out.println("Сортировка по возрасту : ");
        userService.sortAge(users).forEach(System.out::println);

        System.out.println("Все ли старше 7 лет : " + userService.filterAge(users));

        System.out.println("Средний возраст :  " + userService.averageAge(users));

        System.out.println("Из скольки разных стран пользователи : " + userService.countOfCountry(users));
    }
}
