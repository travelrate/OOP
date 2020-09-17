package Lab12.mogunov;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Лукаша", 4);
        Dog d2 = new Dog("Путяша", 3);
        Dog d3 = new Dog("Зеленяша");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
