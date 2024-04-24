package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    private final ArrayList orders = new ArrayList();

    public String order(OrderDTO orderDTO){
        //0

        int oldNum =orders.size();

        orders.add(orderDTO);
        if(oldNum >= orders.size()){
            return "등록실패";
        }
        return "등록성공";

    }

    public OrderDTO detailView(int index){
        return (OrderDTO) orders.get(index);

    }
}