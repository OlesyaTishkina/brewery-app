package guru.springframework.breweryapp.services;

import guru.springframework.breweryapp.web.model.CustomerDto;

import java.util.UUID;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Michael Parker")
                .build();
    }
}
