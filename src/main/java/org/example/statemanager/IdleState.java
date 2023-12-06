package org.example.statemanager;

import org.example.VendingMachine;

public class IdleState extends State {

    public void clickOnInsertButton(VendingMachine machine){
        System.out.println("clicked on insert button");
        machine.setState(new AcceptMoneyState());
    }


}
