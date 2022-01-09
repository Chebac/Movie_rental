package com.example.Movie_rental.Controllers;

import com.example.Movie_rental.Entities.Customer;
import com.example.Movie_rental.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/Movie-Rental/Customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/getCustomerById")
    public Customer getCustomerById(Long id){
        return customerService.getCustomerById(id);
    }

    @PostMapping("/addOrUpdateCustomer")
    public ResponseEntity<Customer> addOrUpdate(@RequestBody Customer customer){
        Customer customers = null;
        try{

            customers = customerService.addOrUpdateCustomer(customer);

        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @DeleteMapping("/deleteCustomer")
    public Customer deleteCustomer(Long id) throws Exception{
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/allCustomers")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> customers = null;
        try{

            customers = customerService.getCustomers();

        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }

}
