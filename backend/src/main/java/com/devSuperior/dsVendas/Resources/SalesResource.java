package com.devSuperior.dsVendas.Resources;

import com.devSuperior.dsVendas.DTO.SaleDTO;
import com.devSuperior.dsVendas.DTO.SalesAmountDTO;
import com.devSuperior.dsVendas.DTO.SalesSumDTO;
import com.devSuperior.dsVendas.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesResource {

    @Autowired
    private SalesService service;


    @GetMapping
        public ResponseEntity <Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }
    @GetMapping(value="sum-by-seller")
    public ResponseEntity <List<SalesSumDTO>> sumGroupedBySeller(){
        List<SalesSumDTO> list = service.sumGroupedBySeller();
        return ResponseEntity.ok(list);
    }
    @GetMapping(value="amount-by-seller")
    public ResponseEntity <List<SalesAmountDTO>> amountGroupedBySeller(){
        List<SalesAmountDTO> list = service.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }



    }


