package com.ohgiraffers.order.dto;

public class OrderDTO {
    private String menuName;
    private int price;
    private int quantity;

    public OrderDTO(){

    }

    public OrderDTO(String menuName,int price,int quantity){
        this.menuName = menuName;
        this.price =price;
        this.quantity =quantity;
    }

    public int getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity,int price) {//1개당 가격얼마로 할건지
        this.quantity = quantity;
        this.price =quantity * price;

    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
