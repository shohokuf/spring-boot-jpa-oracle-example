package com.mkyong.controller;

import com.mkyong.dao.CustomerRepository;
import com.mkyong.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author sunchuanfu
 * @date 2021/2/26 10:20
 */
@Slf4j
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/save")
    public String save(){
        Customer c = new Customer();
        // c.setDate(new Date());
        // c.setEmail("shohokuf@163.com");
        c.setName("name");
        customerRepository.save(c);
        return "success";
    }

    @GetMapping("/query")
    public String query() {
        // List<Customer> lst = (List<Customer>) customerRepository.findAll();
        // for (Customer c : lst) {
        //     System.out.println(c);
        // }
        Customer customer = customerRepository.getByInsProcId("tony");
        log.info(customer.toString());
        return "success";
    }

}
