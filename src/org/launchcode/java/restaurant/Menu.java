package org.launchcode.java.restaurant;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by stephen on 3/13/17.
 */
public class Menu {
    private Map<String, List<MenuItem>> items;
    private final LocalDate createdOn;

    public Menu(List<MenuItem> items) {
        this.items = new HashMap<>();
        for(MenuItem item : items) {
            if(!this.items.containsKey(item.getCategory())) {
                this.items.put(item.getCategory(), new ArrayList<>());
            }
            this.items.get(item.getCategory()).add(item);
        }
        this.createdOn = LocalDate.now();
    }

    public List<String> getCategories() {
        return (List<String>) this.items.keySet();
    }

    public List<MenuItem> getItemsForCategory(String category) {
        return this.items.get(category);
    }

    public boolean isNew() {
        return createdOn.isAfter(LocalDate.now().minusDays(7));
    }

    public static void main(String[] args) {

    }
}
