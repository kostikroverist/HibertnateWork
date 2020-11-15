package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {
    private Integer id;
    private  Integer total;
    private String name;
    private Set<Cart> carts = new HashSet<>();

     public  Item (){}


    public Item(Integer total, String name) {
        this.total = total;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) &&
                Objects.equals(total, item.total) &&
                Objects.equals(name, item.name) &&
                Objects.equals(carts, item.carts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, name, carts);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", total=" + total +
                ", name='" + name + '\'' +
                ", carts=" + carts +
                '}';
    }
}
