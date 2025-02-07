class HasCoinState implements State {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Ya hay una moneda insertada.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Devolviendo la moneda.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("Botón presionado.");
        vendingMachine.setState(vendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Presione el botón para dispensar.");
    }
}

