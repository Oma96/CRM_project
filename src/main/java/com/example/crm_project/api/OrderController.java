package com.example.crm_project.api;


import com.example.crm_project.buisness.OrderService;
import com.example.crm_project.dao.Order;
import com.example.crm_project.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class OrderController {

    @Autowired
    OrderService orderService;

@GetMapping("orders")
public List<OrderDTO> getOrders(){
    return orderService.getOrders();
}

@GetMapping("order/{id}")
    public ResponseEntity getOrderById(@PathVariable Integer id){
    Optional<Order> optional=  orderService.getOneOrder(id);
    if(optional.isEmpty()){
        return ResponseEntity.notFound().build();
    } else {
        Order order= optional.get();
        return ResponseEntity.ok(order);
    }
}

    @PostMapping("order")
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }

    @DeleteMapping("order/{id}")
    public  ResponseEntity deleteById(@PathVariable Integer id){
        Optional<Order> optional = orderService.getOneOrder(id);
        if(optional.isPresent()){
            orderService.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }

    }

    @PutMapping("order/{id}")
    public ResponseEntity update(@PathVariable Integer id, @RequestBody Order order){


        Optional<Order> op = orderService.getOneOrder(id);
        if(id != order.getId()){
            return ResponseEntity.notFound().build();
        } else if (op.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            orderService.update(order);
            return ResponseEntity.ok().build();
        }
    }



}
