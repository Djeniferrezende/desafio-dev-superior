package com.devSuperior.dsVendas.services;

import com.devSuperior.dsVendas.DTO.SaleDTO;
import com.devSuperior.dsVendas.DTO.SalesAmountDTO;
import com.devSuperior.dsVendas.DTO.SalesSumDTO;
import com.devSuperior.dsVendas.DTO.SellerDTO;
import com.devSuperior.dsVendas.entities.Sales;

import com.devSuperior.dsVendas.repositories.SalesRepository;

import com.devSuperior.dsVendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SalesService {

    @Autowired
    private SalesRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        //chamar todos os vendedores de uma vez
        sellerRepository.findAll();
        Page<Sales> result = repository.findAll(pageable);
        //converto minha lista seller para setterDto e converto de novo para lista
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SalesSumDTO> sumGroupedBySeller(){
        return repository.sumGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SalesAmountDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }
}
