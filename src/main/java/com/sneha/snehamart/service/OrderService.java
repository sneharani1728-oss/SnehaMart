package com.sneha.snehamart.service;
import com.sneha.snehamart.dao.OrderRepository;import java.sql.SQLException;import java.util.Map;
/** Coordinates the validated mock-checkout transaction. */
public final class OrderService {private final OrderRepository orders;public OrderService(OrderRepository orders){this.orders=orders;}public Map<String,Object> placeOrder(long buyerId)throws SQLException{if(buyerId<=0)throw new IllegalArgumentException("A signed-in buyer is required.");return orders.placeOrder(buyerId);}}
