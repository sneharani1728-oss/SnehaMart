package com.sneha.snehamart.dao;
import java.sql.SQLException;import java.util.Map;
/** Persistence contract for checkout transactions. */
public interface OrderRepository {Map<String,Object> placeOrder(long userId)throws SQLException;}
