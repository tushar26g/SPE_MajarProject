package com.example.ebillpay;

import com.example.ebillpay.dto.CustomerDTO;
import com.example.ebillpay.dto.LoginDTO;
import com.example.ebillpay.entity.Customer;
import com.example.ebillpay.repository.CustomerRepository;
import com.example.ebillpay.service.CustomerServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class EBillPayApplicationTests {
    private CustomerServiceImpl customerService;

    @Mock
    private CustomerRepository customerRepository;
    @Test
    public void testLogin() {
        LoginDTO loginDto = new LoginDTO();
        loginDto.setUserName("tushar26g");
        loginDto.setPassword("tushar");
        CustomerDTO customer = new CustomerDTO();
        customer.setUserName("tushar26g");
        customer.setPassword("tushar");
        customer.setAddress("Sambhajinagar");
        customer.setEmail("tushar26g@gmail.com");
        customer.setLastName("Gunware");
        customer.setFirstName("Tushar");
        customer.setMobileNumber("9370923154");
        when(customerRepository.findByUserName(loginDto.getUserName())).thenReturn(customer);
        CustomerDTO customerDTO = customerService.loginCustomer(loginDto.getUserName(), loginDto.getPassword());
        assertNotNull(customerDTO);
        assertEquals(HttpStatus.OK, customerDTO);
        assertEquals(customer, customerDTO);
    }

}
