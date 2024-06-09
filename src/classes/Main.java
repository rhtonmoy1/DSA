package classes;

public class Main {
    public static void main(String[] args) {
        Cookies cookieOne = new Cookies("Green");
        Cookies cookieTow = new Cookies("Blue");

        System.out.println(cookieOne.getColor());
        cookieOne.setColor("Yellow");
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTow.getColor());
    }
}
