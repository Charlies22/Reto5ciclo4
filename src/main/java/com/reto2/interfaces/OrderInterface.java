package com.reto2.interfaces;

import com.reto2.model.Order;
import java.util.Date;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderInterface extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
    List<Order> findBySalesManId(Integer salesManId);
    List<Order> findByStatusAndSalesManId(String status,Integer salesManId);
    List<Order> findByRegisterDayAndSalesManId(Date date, Integer id);
}
