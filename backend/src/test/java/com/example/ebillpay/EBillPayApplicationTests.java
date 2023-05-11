package com.example.ebillpay;

import com.example.ebillpay.dto.CustomerDTO;
import com.example.ebillpay.dto.LoginDTO;
import com.example.ebillpay.entity.Customer;
import com.example.ebillpay.repository.CustomerRepository;
import com.example.ebillpay.repository.LoginRepository;
import com.example.ebillpay.service.CustomerService;
import com.example.ebillpay.service.CustomerServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@SpringBootTest
class EBillPayApplicationTests {

    @Mock
    private LoginRepository loginRepo;

    @InjectMocks
    private CustomerService customerService;

    @Before("")
    public void setup() {
        // Setup any mock data or behavior here
    }

    @Test
    public void testLoginCustomer() {
        String userName = "testuser";
        String password = "testpass";
        Customer mockCustomer = new Customer();
        mockCustomer.setCustomerId(1);
        mockCustomer.setAddress("123 Main St");
        mockCustomer.setEmail("testuser@example.com");
        mockCustomer.setFirstName("John");
        mockCustomer.setLastName("Doe");
        mockCustomer.setMobileNumber("555-1234");

        when(loginRepo.findOneByUserNameAndPassword(userName, password)).thenReturn(mockCustomer);

        CustomerDTO expected = new CustomerDTO();
        expected.setCustomerId(1);
        expected.setAddress("123 Main St");
        expected.setEmail("testuser@example.com");
        expected.setFirstName("John");
        expected.setLastName("Doe");
        expected.setMobileNumber("555-1234");

        CustomerDTO actual = customerService.loginCustomer(userName, password);

        assertEquals(expected, actual);
    }

}
