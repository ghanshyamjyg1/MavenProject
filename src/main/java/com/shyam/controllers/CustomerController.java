package com.shyam.controllers;

import com.shyam.model.Customer;
import com.shyam.service.CustomerService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
public class CustomerController {
    private static final Logger logger = Logger
            .getLogger(CustomerController.class);

    public CustomerController() {
        System.out.println("CustomerController()");
    }

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/")
    public ModelAndView listCustomer(ModelAndView model) throws IOException {
        List<Customer> listCustomer = customerService.getAllCustomers();
        model.addObject("listCustomer", listCustomer);
        model.setViewName("home");
        return model;
    }

    @RequestMapping(value = "/newCustomer", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
        Customer customer = new Customer();
        model.addObject("customer", customer);
        model.setViewName("CustomerForm");
        return model;
    }

    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    public ModelAndView saveCustomer(@ModelAttribute Customer customer) {

        if (customer.getId() == 0) { //
            customerService.addCustomer(customer);
        } else {
            customerService.updateCustomer(customer);
        }
        return new ModelAndView("redirect:/");
    }

}
