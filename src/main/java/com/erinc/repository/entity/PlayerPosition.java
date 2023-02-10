package com.erinc.repository.entity;

import lombok.Getter;

@Getter
public enum PlayerPosition {
    CB("Defans"),RB("Defans"),LB("Defans"),RWB("Defans"),LWB("Defans"),
    CM("Middle"),CDM("Middle"),CAM("Middle"),RM("Middle"),LM("Middle"),
    ST("Forvet"),CF("Forvet"),RW("Forvet"),LW("Forvet"),GK("GoolKeeper");

    String area;

    PlayerPosition(String area){
        this.area = area;
    }
}
