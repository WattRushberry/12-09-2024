public class App {
    public static void main(String[] args) throws Exception {
        Member diamond = new Diamond("Watt", 1000);
        System.out.println("Diamond info: ");
        diamond.display();

        Member gold = new Gold("Watt", 1000);
        System.out.println("gold info: ");
        gold.display();

        Member silver = new Silvy("Watt", 1000);
        System.out.println("Silver info: ");
        silver.display();
    }
}
