package com.devSuperior.dsVendas.Resources;

import com.devSuperior.dsVendas.DTO.SellerDTO;
import com.devSuperior.dsVendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerResource {

    @Autowired
    private SellerService service;


    @GetMapping
    //resonse entity nao tem um tipo entao preciso dar um tipo pra ele
    public ResponseEntity <List<SellerDTO>> findAll(){
        List<SellerDTO>list = service.findAll();
        return ResponseEntity.ok(list);
    }
    }


