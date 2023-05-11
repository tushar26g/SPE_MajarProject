package com.example.ebillpay;

import com.example.ebillpay.dto.CustomerDTO;
import com.example.ebillpay.dto.LoginDTO;
import com.example.ebillpay.entity.Customer;
import com.example.ebillpay.repository.CustomerRepository;
import com.example.ebillpay.repository.LoginRepository;
import com.example.ebillpay.service.CustomerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
    @Test
    public void testValidLogin() {
        // arrange
        Customer expectedCustomer = new Customer("John", "Doe", "johndoe@gmail.com", "1234567890", "123 Main St");
        LoginRepository loginRepo = new LoginRepository() {
            @Override
            public Customer findOneByUserNameAndPassword(String userName, String password) {
                return null;
            }

            @Override
            public Customer findByCustomerId(Integer customerId) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Customer> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Customer> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Customer> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Customer getOne(Integer integer) {
                return null;
            }

            @Override
            public Customer getById(Integer integer) {
                return null;
            }

            @Override
            public Customer getReferenceById(Integer integer) {
                return null;
            }

            @Override
            public <S extends Customer> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Customer> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public List<Customer> findAll() {
                return null;
            }

            @Override
            public List<Customer> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends Customer> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Customer> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Customer entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Customer> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<Customer> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Customer> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Customer> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Customer> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Customer> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Customer, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
        loginRepo.addCustomer(expectedCustomer);

        // act
        CustomerDTO actualCustomerDTO = loginCustomer("johndoe", "password");

        // assert
        assertNotNull(actualCustomerDTO);
        assertEquals(expectedCustomer.getCustomerId(), actualCustomerDTO.getCustomerId());
        assertEquals(expectedCustomer.getFirstName(), actualCustomerDTO.getFirstName());
        assertEquals(expectedCustomer.getLastName(), actualCustomerDTO.getLastName());
        assertEquals(expectedCustomer.getEmail(), actualCustomerDTO.getEmail());
        assertEquals(expectedCustomer.getMobileNumber(), actualCustomerDTO.getMobileNumber());
        assertEquals(expectedCustomer.getAddress(), actualCustomerDTO.getAddress());
    }

    @Test
    public void testInvalidLogin() {
        // arrange
        LoginRepository loginRepo = new LoginRepository() {
            @Override
            public Customer findOneByUserNameAndPassword(String userName, String password) {
                return null;
            }

            @Override
            public Customer findByCustomerId(Integer customerId) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Customer> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Customer> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Customer> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Customer getOne(Integer integer) {
                return null;
            }

            @Override
            public Customer getById(Integer integer) {
                return null;
            }

            @Override
            public Customer getReferenceById(Integer integer) {
                return null;
            }

            @Override
            public <S extends Customer> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Customer> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public List<Customer> findAll() {
                return null;
            }

            @Override
            public List<Customer> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends Customer> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Customer> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Customer entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Customer> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<Customer> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Customer> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Customer> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Customer> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Customer> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Customer, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };

        CustomerServiceImpl customerService=new CustomerServiceImpl();
        // act
        CustomerDTO actualCustomerDTO = customerService.loginCustomer("johndoe", "password");

        // assert
        assertNull(actualCustomerDTO);
    }

}
