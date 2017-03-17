package org.launchcode.java.restaurant;

import java.time.LocalDate;
import java.util.*;

public class Menu {
    private Map<String, List<MenuItem>> items;
    private final LocalDate createdOn;
    private LocalDate updatedOn;

    public Menu(List<MenuItem> items) {
        this();
        for(MenuItem item : items) {
        }
    }

    public Menu() {
        this.items = new HashMap<>();
        this.createdOn = LocalDate.now();
        updatedMenu();
    }

    public void addMenuItem(MenuItem item) {
        if(!this.items.containsKey(item.getCategory())) {
            this.items.put(item.getCategory(), new ArrayList<>());
        }
        if(!this.items.get(item.getCategory()).contains(item)) {
            this.items.get(item.getCategory()).add(item);
        }
        updatedMenu();
    }

    public void removeMenuItem(MenuItem item) {
        if(!this.items.containsKey(item.getCategory())) {
            return;
        }
        this.items.get(item.getCategory()).remove(item);
        updatedMenu();
    }

    private void updatedMenu() {
        this.updatedOn = LocalDate.now();
    }

    @Override
    public String toString() {
        String menuString = "Menu\n\n";
        for(String category : items.keySet()) {
            menuString = menuString + category + "\n";
            for(MenuItem item : items.get(category)){
                menuString = menuString + item.getName() + "\t" + item.getPrice() + "\n";
            }
            menuString += "\n";
        }
        menuString += "Menu last updated on " + updatedOn;
        return menuString;
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
        Menu menu = new Menu();
        MenuItem pizza = new MenuItem("Pizza", 12.00, "Its pizza...", "Entree");
        MenuItem pasta = new MenuItem("Pasta", 12.00, "Its pasta...", "Entree");
        MenuItem iceCream = new MenuItem("Ice Cream", 12.00, "Its ice cream...", "Dessert");

        menu.addMenuItem(pizza);
        menu.addMenuItem(pasta);
        menu.addMenuItem(iceCream);

        System.out.print(menu);
    }
}
