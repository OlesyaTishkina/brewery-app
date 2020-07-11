package guru.springframework.breweryapp.services;

import guru.springframework.breweryapp.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
