package Lab2;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Мёртвые души", "Н.В.Гоголь", 352, 300);
        Book d2 = new Book("Ревизор", "Н.В.Гоголь", 120, 250);
        Book d3 = new Book("Капитанская дочка", "А.С.Пушкин", 320, 260);
        System.out.println(d1);
        d1.getprice();
        d2.getprice();
        d3.getprice();
    }
}
