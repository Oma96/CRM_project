package com.example.crm_project.dto;

import com.example.crm_project.buisness.ClientState;
import com.example.crm_project.buisness.OrderState;
import com.example.crm_project.dao.Client;
import com.example.crm_project.dao.Order;

public class OrderMapper {

    public static OrderDTO fromEntity(Order order){

       OrderDTO dto=new OrderDTO();

        dto.setTypePresta(order.getTypePresta());
        dto.setDesignation(order.getDesignation());
        dto.setNbDays(order.getNbDays());
        dto.setUnitPrice(order.getUnitPrice());
        dto.setClient(ClientMapper.fromEntity(order.getClient()));

        if(order.getState()==0){
            dto.setState(OrderState.CANCELED);
        }else if (order.getState()==1){
            dto.setState(OrderState.OPTION);
        } else{
            dto.setState(OrderState.CONFIRMED);
        }

        return dto;
    }


}
