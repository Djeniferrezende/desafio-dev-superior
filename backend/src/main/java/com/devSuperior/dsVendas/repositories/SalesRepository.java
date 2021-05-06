package com.devSuperior.dsVendas.repositories;

import com.devSuperior.dsVendas.DTO.SalesAmountDTO;
import com.devSuperior.dsVendas.DTO.SalesSumDTO;
import com.devSuperior.dsVendas.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalesRepository extends JpaRepository<Sales, Long> {

    @Query("SELECT new com.devSuperior.dsVendas.DTO.SalesSumDTO(obj.sellers,SUM(obj.amount))" +
            "FROM Sales AS obj GROUP BY obj.sellers")
    List<SalesSumDTO> sumGroupedBySeller();

    @Query("SELECT new com.devSuperior.dsVendas.DTO.SalesAmountDTO(obj.sellers,SUM(obj.visited), SUM(obj.deals))" +
            "FROM Sales AS obj GROUP BY obj.sellers")
    List<SalesAmountDTO> amountGroupedBySeller();

}
