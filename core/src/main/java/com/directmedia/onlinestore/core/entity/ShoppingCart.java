package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {

    private Set<Work> items;


    public ShoppingCart() {
        items = new HashSet<>();
    }

    public ShoppingCart(Set<Work> items) {
        this.items = items;
    }

    public int getSize (){
        return this.items.size();
    }

    public void addItem(Work work){
        items.add(work);
    }

    public void removeItem (Work work){
        items.remove(work);
    }

    public Set<Work> getItems() {
        return items;
    }

    public void setItems(Set<Work> items) {
        this.items = items;
    }
}
