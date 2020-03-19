package br.com.spring.stream;

public class Product {

    private String name;

    private String category;

    private Double value;

    private Integer quantity;

    public Product() {
    }

    public Product(String name, String category, Double value, Integer quantity) {
        super();
        this.name = name;
        this.category = category;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
