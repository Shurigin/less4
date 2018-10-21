package task1;

public class WorkerTest {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ivanov", "Engineer", "8888@gmail.com", "33442345", 105000, 33);
        Worker worker2 = new Worker("Petrov", "Cliner", "cliner742@mail.ru", "+7(905)3456789", 30000, 22);

        /*
         **Задание 4
         */

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivanov-i@gmail.com", "+79281876459", 99000, 33);
        persArray[1] = new Person("Petrov Peter", "Dreamteller", "storyteller-777@gmail.com", "+79043222232", 305000, 25);
        persArray[2] = new Person("Ivanov Peter", "Driver", "volvoForever@gmail.com", "+79045658132", 45000, 42);
        persArray[3] = new Person("Petrova Anna", "Roomcliner", "anna-73@gmail.com", "+79287711821", 30000, 46);
        persArray[4] = new Person("Ivanova Matilda Aristarkhovna", "actress", "shining-star@mail.ru", "+79057777777", 30500000, 27);



        /*
         ** Задание 3
         */
        worker1.printInf();
        worker2.printInf();

        /*
         ** Задание 4
         */

        System.out.println("Сотрудники старше сорока лет:");
        System.out.println("****************************************");

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                System.out.println("Возраст сотрудника: " + persArray[i].age);
                persArray[i].printInfPers();
            }
        }


    }
}
