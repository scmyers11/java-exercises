package org.launchcode.java.restaurant;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by stephen on 3/13/17.
 */
public class MenuItem {
    private final String name;
    private double price;
    private String description;
    private String category;
    private final LocalDate createdOn;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.createdOn = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public boolean isNew() {
        return createdOn.isAfter(LocalDate.now().minusDays(7));
    }
}
