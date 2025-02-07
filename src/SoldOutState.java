public class SoldOutState implements State {
    private VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("El producto está agotado.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No hay moneda para devolver.");
    }

    @Override
    public void pressButton() {
        System.out.println("El producto está agotado.");
    }

    @Override
    public void dispense() {
        System.out.println("No se puede dispensar. El producto está agotado.");
    }
}