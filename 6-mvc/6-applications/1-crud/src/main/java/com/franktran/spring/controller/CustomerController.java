package com.franktran.spring.controller;

import com.franktran.spring.dto.CustomerDto;
import com.franktran.spring.model.Customer;
import com.franktran.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CustomerController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("get-customers")
    public String getCustomers(Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        List<CustomerDto> convertedCustomers = customers.stream().map(this::convertToDto).collect(Collectors.toList());
        model.addAttribute("customers", convertedCustomers);
        return "all-customers";
    }

    @RequestMapping("/create-customer-form")
    public String createCustomerForm(Model model) {
        model.addAttribute("customer", convertToDto(new Customer()));
        return "create-customer-form";
    }

    @RequestMapping("create-customer")
    public String createCustomer(CustomerDto customerDto, Model model) {
        Customer customer = convertToEntity(customerDto);
        Customer createdCustomer = customerService.createCustomer(customer);
        model.addAttribute("action", "Created");
        model.addAttribute("customer", convertToDto(createdCustomer));
        return "success";
    }

    @RequestMapping("/update-customer-form/{id}")
    public String updateCustomerForm(@PathVariable Long id, Model model) {
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("customer", convertToDto(customer));
        return "update-customer-form";
    }

    @RequestMapping("update-customer/{id}")
    public String updateCustomer(@PathVariable Long id, CustomerDto customerDto, Model model) {
        customerDto.setCustomerId(id);
        Customer customer = convertToEntity(customerDto);
        Customer updatedCustomer = customerService.updateCustomer(customer);
        model.addAttribute("action", "Updated");
        model.addAttribute("customer", convertToDto(updatedCustomer));
        return "success";
    }

    @RequestMapping("/delete-customer-confirm/{id}")
    public String deleteCustomerConfirm(@PathVariable Long id, Model model) {
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("customer", convertToDto(customer));
        return "delete-customer-confirm";
    }

    @RequestMapping("delete-customer/{id}")
    public String deleteCustomer(@PathVariable Long id, String action, Model model) {
        if ("Delete".equals(action)) {
            Customer customer = customerService.getCustomerById(id);
            Customer deletedCustomer = customerService.deleteCustomer(customer);
            model.addAttribute("action", "Deleted");
            model.addAttribute("customer", convertToDto(deletedCustomer));
            return "success";
        }
        return "redirect:/get-customers";
    }

    private Customer convertToEntity(CustomerDto customerDto) {
        Customer customer = modelMapper.map(customerDto, Customer.class);
        customer.setBirthDate(customerDto.getSubmissionBirthDateConverted());
        return customer;
    }

    private CustomerDto convertToDto(Customer customer) {
        CustomerDto customerDto = modelMapper.map(customer, CustomerDto.class);
        customerDto.setSubmissionBirthDate(customer.getBirthDate());
        return customerDto;
    }
}
