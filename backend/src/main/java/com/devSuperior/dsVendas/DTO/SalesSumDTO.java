package com.devSuperior.dsVendas.DTO;

import com.devSuperior.dsVendas.entities.Seller;

public class SalesSumDTO {

    private String sellerName;
    private Double sum;

   public SalesSumDTO(){

   }

    public SalesSumDTO(Seller seller, Double sum) {
       sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
