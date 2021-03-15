package com.example.tehtava_81;

public class BottleList {
    private String nLabel;
    private Integer iPrice;

    public BottleList(String label, Integer price) {
        nLabel= label;
        iPrice = price;
    }

    public String getLabel() {
        return nLabel;
    }

    public void setLabel(String label) {
        this.nLabel = label;
    }

    public Integer getPrice() {
        return iPrice;
    }

    public void setPrice(Integer price) {
        this.iPrice = price;
    }
}
