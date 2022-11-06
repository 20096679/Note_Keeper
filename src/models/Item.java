package models;

import java.util.Objects;

// Item: The responsibility for this class is to manage a single Item in the system.
// An item belongs to a specific Note.
public class Item {

 String itemDescriotion = "No Description";
boolean isItemCompleted = false;
    /*temDescription: The description is maximum 50 characters. When creating a new item, if the string is
    longer than 50 characters, you shoud truncate the string to the first 50 chars (Hint see Utilities for a
     useful method to do this) When updating itemDescription, you should only update if the value is less
     than or equal to 50.
     */
    public Item(String itemDescriotion){

    }
    public Item(String itemDescriotion, boolean isItemCompleted){

    }

    public String getItemDescriotion() {
        return itemDescriotion;
    }

    public void setItemDescriotion(String itemDescriotion) {
        this.itemDescriotion = itemDescriotion;
    }

    public boolean isItemCompleted() {
        return isItemCompleted;
    }

    public void setItemCompleted(boolean itemCompleted) {
        isItemCompleted = itemCompleted;
    }

    @Override // Gdy wygenerowalwm ten kod to jest on inny nix w ASS1
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return isItemCompleted() == item.isItemCompleted() && getItemDescriotion().equals(item.getItemDescriotion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemDescriotion(), isItemCompleted());
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemDescriotion='" + itemDescriotion + '\'' +
                ", isItemCompleted=" + isItemCompleted +
                '}';
    }
}