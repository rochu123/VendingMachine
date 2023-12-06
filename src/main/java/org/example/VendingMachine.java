package org.example;

import org.example.statemanager.State;

public class VendingMachine {

    private State state;
    private Inventory inventory;
    private int money;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
