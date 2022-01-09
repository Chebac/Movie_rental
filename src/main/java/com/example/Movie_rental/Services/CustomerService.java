package com.example.Movie_rental.Services;

import com.example.Movie_rental.Entities.Customer;
import com.example.Movie_rental.Interfaces.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer addOrUpdateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer deleteCustomer(Long id) throws Exception {
        Customer deleteCustomer = null;
        try{

            deleteCustomer = customerRepository.findById(id).orElse(null);
            if (deleteCustomer == null)
            {
                throw new Exception("Customer does not exist");
            }else{
                customerRepository.deleteById(id);
            }

        } catch (Exception ex){
            throw ex;
        }
        return deleteCustomer;
    }

}
