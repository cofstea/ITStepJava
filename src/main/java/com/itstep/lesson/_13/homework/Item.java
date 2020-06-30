package com.itstep.lesson._13.homework;

import java.util.Objects;
import java.util.Random;

public class Item { // class of type Item

    // Attributes / Class properties
    public long itemId;

    public String itemTitle;

    public Type itemType;

    public Item(String itemTitle, Type itemType) { // Constructor ( Creation Instruction for Data Type - Item )
        Random random = new Random();
        this.itemId = random.nextInt(10000);
        this.itemTitle = itemTitle;
        this.itemType = itemType;
    }

    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemType=" + itemType +
                '}';
    }

    @Override
    public boolean equals( Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Item)) {
            return false;
        }
        final Item item = (Item) o;
        return Objects.equals(itemTitle, item.itemTitle) &&
                itemType == item.itemType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemTitle, itemType);
    }

}
