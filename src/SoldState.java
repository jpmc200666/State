class SoldState implements State {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Espere, estamos dispensando el producto.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No se puede devolver la moneda después de presionar el botón.");
    }

    @Override
    public void pressButton() {
        System.out.println("Ya presionó el botón.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensando producto.");
        if (vendingMachine.getProductCount() > 0) {
            vendingMachine.setState(vendingMachine.getNoCoinState());
        } else {
            System.out.println("El producto se ha agotado.");
            vendingMachine.setState(vendingMachine.getSoldOutState());
        }
    }
}