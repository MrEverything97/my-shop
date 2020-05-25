package com.phuongnam.repository;

import com.phuongnam.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
    Page<Product> findAllByModelContaining(String name, Pageable pageable);
}
