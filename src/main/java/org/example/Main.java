package org.example;

import org.example.statemanager.IdleState;
import org.example.statemanager.State;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Pepsi");
        p1.setPrice(20);

        Product p2 = new Product();
        p2.setName("Coke");
        p2.setPrice(20);

        Slot s1 = new Slot();
        s1.setId("101");
        s1.setProduct(p1);
        s1.setQty(3);

        Slot s2 = new Slot();
        s2.setId("102");
        s2.setProduct(p2);
        s2.setQty(2);

        Inventory inventory = new Inventory();
        inventory.addSlot(s1);
        inventory.addSlot(s2);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setState(new IdleState());
        vendingMachine.setMoney(0);
        vendingMachine.setInventory(inventory);

        State state = vendingMachine.getState();
        state.clickOnInsertButton(vendingMachine);

        System.out.println("state is " + vendingMachine.getState());
        vendingMachine.getState().insertCoin(vendingMachine, 10);
        vendingMachine.getState().insertCoin(vendingMachine, 10);
        System.out.println("money inserted is " + vendingMachine.getMoney());

        vendingMachine.getState().clickOnStartProductSelectionButton(vendingMachine);
        vendingMachine.getState().chooseProduct(vendingMachine, "101");

        System.out.println("inv is "+ vendingMachine.getInventory().slots.get(1).getQty());
        System.out.println("money "+ vendingMachine.getMoney());
    }
}