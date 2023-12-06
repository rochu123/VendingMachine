package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Inventory {

    List<Slot> slots;

    public void addSlot(Slot slot) {
        if (isNull(slots)) {
            slots = new ArrayList<>();
        }
        slots.add(slot);
    }

    public Product dispenseProductFromSlot(String slotId) {
        Slot slot = getSlotById(slotId);
        if (isNull(slot)) {
            throw new RuntimeException("Invalid slotId");
        }
        if (slot.getQty() <= 0) {
            throw new RuntimeException("stock not available");
        }
        slot.setQty(slot.getQty() - 1);
        return slot.getProduct();
    }

    private Slot getSlotById(String id) {
        for (Slot slot : slots) {
            if (id.equals(slot.getId())) {
                return slot;
            }
        }
        return null;
    }

    public Product getProductFromSlotId(String slotId) {
        Slot slot = getSlotById(slotId);
        if (isNull(slot)) {
            throw new RuntimeException("Invalid slotId");
        }
        return slot.getProduct();
    }

}
