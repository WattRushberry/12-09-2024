public class App {
    public static void main(String[] args) throws Exception {
        Member diamond = new Diamond("Watt", 1000);
        System.out.println("Platinum info: ");
        diamond.display();

        Member gold = new Gold("Watt", 1000);
        System.out.println("Gold info: ");
        gold.display();

        Member silver = new Silvy("Watt", 1000);
        System.out.println("Silver info: ");
        silver.display();
    }
}
