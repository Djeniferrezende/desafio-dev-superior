package com.devSuperior.dsVendas.DTO;

import com.devSuperior.dsVendas.entities.Seller;

public class SalesAmountDTO {

    private String sellerName;
    private Long visited;
    private Long deals;

   public SalesAmountDTO(){

   }

    public SalesAmountDTO(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
