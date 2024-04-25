package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    private final ArrayList orders1 = new ArrayList();

    public String order(OrderDTO[] orders){
        //0

        int oldNum =getOrder().size();

        for(OrderDTO orderDTO : orders){
            orders1.setItem(orderDTO);
        }

        if(oldNum >= orders1.getOrder().size()){
            return "등록실패";
        }
        return "등록성공";

    }

    public OrderDTO detailView(int index){
        return (OrderDTO) orders1.get(index);

    }

    public String Delete(int no)
    {   orders1.remove(no);
        return "";



    }




}