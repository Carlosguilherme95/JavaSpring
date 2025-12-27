package com.devsuperior.aula.services;
import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order){
        return  + order.getBasic() - ((order.getDiscount() / 100) * order.getBasic()) +
                                    shippingService.shipment(order.getBasic());


    }
}
