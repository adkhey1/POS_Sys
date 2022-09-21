package com.carmesin.pos_sys.Pos.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "prices")
@ToString
public class priceModel {

    @Id
    @Column(name="idprices")
    private String idPrices;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private float price;
}
