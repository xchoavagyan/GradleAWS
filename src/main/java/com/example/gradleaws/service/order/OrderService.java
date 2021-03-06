package com.example.gradleaws.service.order;

import com.example.gradleaws.facade.order.OrderDTO;

import java.util.ArrayList;

public interface OrderService {

    OrderDTO create(OrderDTO dto);

    OrderDTO getById(Long id);

    ArrayList<OrderDTO> getAll();

    void deleteById(Long id);
}
