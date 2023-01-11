package com.example.crm_project.buisness;


import com.example.crm_project.dao.Client;
import com.example.crm_project.dao.Order;
import com.example.crm_project.dao.OrderRepository;
import com.example.crm_project.dto.ClientDTO;
import com.example.crm_project.dto.ClientMapper;
import com.example.crm_project.dto.OrderDTO;
import com.example.crm_project.dto.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

@Autowired
    OrderRepository orderRepository;

public List <OrderDTO> getOrders(){
    List<OrderDTO> dtos= new ArrayList<>();
    List<Order> orders= orderRepository.findAll();
    orders.forEach(el->dtos.add(OrderMapper.fromEntity(el)));
    return dtos;
}
public Optional<Order> getOneOrder(Integer id){
   return orderRepository.findById(id);
}

public void createOrder(Order order){
    orderRepository.save(order);
}

public void deleteById(Integer id){
orderRepository.deleteById(id);
}


public void update(Order order){
    orderRepository.save(order);
}

}
