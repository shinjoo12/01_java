package com.ohgiraffers.order.controller;

import com.ohgiraffers.Application;
import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

public class OrderController { //필수로 입력되어야 하는 클래스

    private final OrderService orderService= new OrderService();


    public String order(OrderDTO orders){
       // orderDTO = Application에서 전달한
        //컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는 검사한다.
        for(OrderDTO orderDTO : orders){
            if(orderDTO.getMenuName().equals("")){
                return "메뉴를 정해주세요";

            }
            if(orderDTO.getQuantity() <=0) {
                return "수량을 입력해주세요";
        }

        }
            //service 로직으로 넘김
            String result = orderService.order(orders);

            return result;
    }

    public String orderModify(){
        return "주문수정";
    }
    public String orderDelete() {
        if (no < 0) {
            System.out.println("번호를 제대로 입력해주세요");
            return OrderService.orderDelete(no);
        }

    }
    public String orderRead(){
        return "주문조회";

    }
    public String orderDetail(){
        return "주문 상세조회";
    }
}
