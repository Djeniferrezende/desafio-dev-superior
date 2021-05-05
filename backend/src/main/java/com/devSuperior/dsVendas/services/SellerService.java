package com.devSuperior.dsVendas.services;

import com.devSuperior.dsVendas.DTO.SellerDTO;
import com.devSuperior.dsVendas.entities.Seller;
import com.devSuperior.dsVendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();
        //converto minha lista seller para setterDto e converto de novo para lista
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
