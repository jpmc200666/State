class VendingMachine {
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State soldOutState;

    private State currentState;
    private int productCount;

    public VendingMachine(int productCount) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        this.productCount = productCount;
        currentState = productCount > 0 ? noCoinState : soldOutState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void pressButton() {
        currentState.pressButton();
        currentState.dispense();
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getProductCount() {
        return productCount;
    }

    public void reduceProductCount() {
        if (productCount > 0) {
            productCount--;
        }
    }
}
