import com.google.gson.Gson;

public class Program {
    public static void main(String[] args) {
        Person per1 = new Person("Василий", "Иванов", 29);
        Person per2 = new Person("Анатолий", "Смирнов", 27);
        Person per3 = new Person("Елена", "Сидорова", 33);
        Person per4 = new Person("Елена", "Сидорова", 33);

        System.out.println(per1.equals(per2));
        System.out.println(per3.equals(per4));

        Gson gs1 = new Gson();

        String json1 = gs1.toJson(per1);
        System.out.println(json1);
        Person read1 = gs1.fromJson(json1, Person.class);
        System.out.println("Фамилия: " + read1.getLastName());
        System.out.println("Имя: " + read1.getFirstName());
    }
}
