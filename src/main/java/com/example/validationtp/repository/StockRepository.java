package com.example.validationtp.repository;
import com.example.validationtp.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
public interface StockRepository extends JpaRepository<Stock,Long> {

}
