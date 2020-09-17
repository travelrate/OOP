package Lab3;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        Ball b2 = new Ball(122, 1);
        Ball b3 = new Ball(233, 143);
        Ball b4 = new Ball(322, 228);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b1.move(30,15);
        b2.move(43,33);
        b3.move(56,51);
        b4.move(21,88);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
