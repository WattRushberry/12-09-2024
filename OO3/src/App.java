public class App {
    public static void main(String[] args) throws Exception {
        Member platinum = new Platinum("Son", 1000);
        System.out.println("Platinum info: ");
        platinum.display();

        Member gold = new Gold("Oat", 1652);
        System.out.println("Gold info: ");
        gold.display();

        Member silver = new Silvy("Fill", 1200);
        System.out.println("Silver info: ");
        silver.display();
    }
}
