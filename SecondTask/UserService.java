package SecondTask;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    public List<User> sortLastName(List<User> users){
        return users.stream().sorted(Comparator.comparing(User::getLastName)).collect(Collectors.toList());
    }
    public List<User> sortAge(List<User> users){
        return users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
    }
    public boolean filterAge(List<User> users){
        return users.stream().allMatch(user -> user.getAge() > 7);
    }
    public double averageAge(List<User> users){
        return users.stream().mapToInt(User::getAge).average().orElse(0);
    }
    public Object countOfCountry(List<User> users){
        return users.stream().map(User::getCountry).distinct().count();
    }
}
