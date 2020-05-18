package com.si.practice.app.order;

import com.si.practice.client.order.api.OrderQueryService;
import com.si.practice.client.order.request.QueryOrderRequest;
import com.si.practice.common.order.OrderDTO;
import com.si.practice.domian.order.OrderManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class OrderQueryServiceImpl implements OrderQueryService {

    @Resource
    private OrderManager orderManager;

    @Override
    public OrderDTO queryOrderById(Long orderId) {

        return orderManager.queryOrderById(orderId);
    }

    @Override
    public List<OrderDTO> listOrders(QueryOrderRequest request) {
        return null;
    }
}
