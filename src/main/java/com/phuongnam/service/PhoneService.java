package com.phuongnam.service;

import com.phuongnam.model.Phone;
import org.springframework.stereotype.Service;

@Service
public interface PhoneService{
    Iterable<Phone> findAll();

    Phone findById(Long id);

    void save(Phone phone);

    void remove(Long id);
}
