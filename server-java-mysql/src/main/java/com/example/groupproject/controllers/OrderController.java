package com.example.groupproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.groupproject.models.Order;
import com.example.groupproject.models.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {

  @Autowired
  OrderRepository orderRepository;

  @GetMapping()
  public List<Order> getOrders() {
    return orderRepository.findAll();
  }

//  private List<Customer> findAll() {
//	// TODO Auto-generated method stub
//	return null;
//}

@PostMapping()
  public Order addOrder(@RequestBody Order order) {
    return orderRepository.save(order);
  }

//  private Customer save(Customer customer) {
//	// TODO Auto-generated method stub
//	return null;
//}

@DeleteMapping("/{id}")
  public void deleteOrder(@PathVariable Long id) {
	orderRepository.deleteById(id);
  }

//private void deleteById(Long id) {
//	// TODO Auto-generated method stub
//	
//}

//@PutMapping("/{id}")
//  public Customer updateProject(@PathVariable Long id, @RequestBody Customer customer) {
//    Customer foundCustomer = customerRepository.findById(id).orElse(null);
//    if (foundCustomer != null) {
//    	foundCustomer.setName(customer.getName());
//    	foundCustomer.setComplete(customer.getComplete());
//      customerRepository.save(foundCustomer);
//      return foundCustomer;
//    }
//    return null;
//  }

}