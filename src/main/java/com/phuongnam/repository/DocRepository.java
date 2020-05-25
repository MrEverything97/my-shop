package com.phuongnam.repository;

import com.phuongnam.model.Doc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository<Doc,Long> {
}
