package Animals;

public class AnimalTest {
    public static void main(String[] args){
        Cat cat1 = new Cat();

        Dog dog1 = new Dog();

        cat1.run = 150;
        cat1.jump = 1.5f;
        cat1.catInfo();

        dog1.run = 300;
        dog1.jump = 0.4f;
        dog1.swim = 9;
        dog1.dogInfo();
    }
}
