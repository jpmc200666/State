public class App {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine(2);

        vendingMachine.insertCoin();
        vendingMachine.pressButton();

        vendingMachine.insertCoin();
        vendingMachine.ejectCoin();

        vendingMachine.insertCoin();
        vendingMachine.pressButton();

        vendingMachine.insertCoin();
    }
}

