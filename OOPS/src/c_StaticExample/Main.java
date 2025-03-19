package c_StaticExample;

public class Main {
    public static void main(String[] args) {
        Human jaiveer = new Human(21, "Jaiveer", 78412563, false);
        Human jasmeet = new Human(21, "Jasmeet Singh", 78412563, false);

        System.out.println(jaiveer.population);
        System.out.println(jasmeet.population);
    }
}
