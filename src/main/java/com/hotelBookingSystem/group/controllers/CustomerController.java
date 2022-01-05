package com.hotelBookingSystem.group.controllers;
import com.hotelBookingSystem.group.models.Customer;
import com.hotelBookingSystem.group.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping(path = "api/v1/customer")
public class CustomerController {

    //private final CustomerService CustomerService;
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

   // @Autowired
    //public CustomerController(CustomerService customerService) {
      //  this.CustomerService = customerService;
   // }


    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable("id") String customerId) {
        return customerRepository.getCustomerById(customerId);

    }
    @DeleteMapping("/customer/{id}")
    public String deleteCustomer(@PathVariable("id") String customerId){
        return customerRepository.delete(customerId);
    }

    @PutMapping("/customer/{id}")
    public String updateCustomer(@PathVariable("id") String customerId, @RequestBody Customer customer){
        return customerRepository.update(customerId,customer);
    }
}
