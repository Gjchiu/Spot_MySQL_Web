package com.order.model;

import java.sql.Timestamp;
import java.util.List;



public class Store_OrderService {
	
	private Store_OrderDAO_interface dao;
	
	public Store_OrderService(){
		dao = new Store_OrderDAO();
	}
	
	public Store_OrderVO addOrder(String order_id, java.sql.Timestamp order_time, String mem_id, String store_id, String order_state, Integer totalprice, String order_way, String receive_address, byte[] qrcode, String order_note, Timestamp order_taketime ){
		
		Store_OrderVO orderVO = new Store_OrderVO();
		
		orderVO.setOrder_id(order_id);
		orderVO.setOrder_time(order_time);
		orderVO.setMem_id(mem_id);
		orderVO.setStore_id(store_id);
		orderVO.setOrder_state(order_state);
		orderVO.setTotalprice(totalprice);
		orderVO.setOrder_way(order_way);
		orderVO.setReceive_address(receive_address);

		orderVO.setOrder_note(order_note);
		orderVO.setOrder_taketime(order_taketime);
		dao.insert(orderVO);
		
		return orderVO;
		
	}
	
	public Store_OrderVO updateRecord(String order_id, java.sql.Timestamp order_time, String mem_id, String store_id, String order_state, Integer totalprice, String order_way, String receive_address, byte[] qrcode, String order_note, Timestamp order_taketime){
		
		Store_OrderVO orderVO = new Store_OrderVO();
		
		orderVO.setOrder_id(order_id);
		orderVO.setOrder_time(order_time);
		orderVO.setMem_id(mem_id);
		orderVO.setStore_id(store_id);
		orderVO.setOrder_state(order_state);
		orderVO.setTotalprice(totalprice);
		orderVO.setOrder_way(order_way);
		orderVO.setReceive_address(receive_address);
		orderVO.setOrder_note(order_note);
		orderVO.setOrder_taketime(order_taketime);
		dao.update(orderVO);
		
		return orderVO;
	}
	
	public void deleteOrder(String order_id){
		dao.delete(order_id);
	}
	
	public Store_OrderVO getOneOrder(String order_id){
		return dao.findByPrimaryKey(order_id);
	}
	
	public List<Store_OrderVO>getAll(){
		return dao.getAll();
	}
	
	
	
	
	
	
	
	
}
