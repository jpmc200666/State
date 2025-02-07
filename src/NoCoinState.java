public class NoCoinState implements State{
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Moneda insertada.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No hay moneda para devolver.");
    }

    @Override
    public void pressButton() {
        System.out.println("Inserte una moneda primero.");
    }

    @Override
    public void dispense() {
        System.out.println("No se puede dispensar sin moneda.");
    }
}
