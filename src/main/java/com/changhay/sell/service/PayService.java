package com.changhay.sell.service;

import com.changhay.sell.dto.OrderDTO;

public interface PayService {

    void create(OrderDTO orderDTO);

}
