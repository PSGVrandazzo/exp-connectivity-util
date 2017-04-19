package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum BedTypeModel {

    BunkBed("Bunk Bed"),
    FullBed("Full Bed"),
    Futon("Futon"),
    KingBed("King Bed"),
    MurphyBed("Murphy Bed"),
    QueenBed("Queen Bed"),
    SofaBed("Sofa Bed"),
    TrundleBed("Trundle Bed"),
    TwinBed("Twin Bed"),
    TwinXLBed("Twin XL Bed"),
    WaterBed("Water Bed");

    @Getter(onMethod = @__(@JsonValue))
    private String value;
}
