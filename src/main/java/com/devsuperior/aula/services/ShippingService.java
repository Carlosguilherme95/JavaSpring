package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double order){
        if(order < 100){
            return 20;
        }else if(order > 100 && order < 200){
            return 12;
        }else{
            return 0;
        }
    }
}
