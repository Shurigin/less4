package task1;

public class Person {
    String name;
    String position;
    String email;
    String tel;
    int salary;
    int age;

    // Конструктор класса
    public Person(String _name, String _position, String _email, String _tel, int _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        tel = _tel;
        salary = _salary;
        age = _age;
    }

    public void printInfPers() {
        System.out.println("Имя сотрудника: " + name);
        System.out.println("Должность сотрудника: " + position);
        System.out.println("Почта сотрудника: " + email);
        System.out.println("Телефон сотрудника: " + tel);
        System.out.println("Заработная плата сотрудника: " + salary);
        System.out.println("Возраст сотрудника: " + age);
        System.out.println();
        System.out.println();
    }
}
