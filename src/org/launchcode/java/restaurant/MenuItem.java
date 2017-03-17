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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (Double.compare(menuItem.price, price) != 0) return false;
        if (name != null ? !name.equals(menuItem.name) : menuItem.name != null) return false;
        if (description != null ? !description.equals(menuItem.description) : menuItem.description != null)
            return false;
        if (category != null ? !category.equals(menuItem.category) : menuItem.category != null) return false;
        return createdOn != null ? createdOn.equals(menuItem.createdOn) : menuItem.createdOn == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
