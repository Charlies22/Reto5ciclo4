package com.reto2.interfaces;

import com.reto2.model.Gadget;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GadgetInterface extends MongoRepository<Gadget, Integer> {
    public List<Gadget> findByPriceLessThanEqual(double price);
    public List<Gadget> findByDescriptionContainingIgnoreCase(String description);
}
