package com.devSuperior.dsVendas.repositories;

import com.devSuperior.dsVendas.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {
}
