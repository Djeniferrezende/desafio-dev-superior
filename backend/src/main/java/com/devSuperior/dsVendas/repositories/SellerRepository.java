package com.devSuperior.dsVendas.repositories;

import com.devSuperior.dsVendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
