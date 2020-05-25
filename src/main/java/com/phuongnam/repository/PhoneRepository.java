package com.phuongnam.repository;

import com.phuongnam.model.Phone;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends PagingAndSortingRepository<Phone, Long> {
}
