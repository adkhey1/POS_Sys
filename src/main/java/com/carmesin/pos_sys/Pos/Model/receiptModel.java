package com.carmesin.pos_sys.Pos.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "receipt")
@ToString
public class receiptModel {


    @Id
    @Column(name = "idreceipt")
    private String idReceipt;

    @Column(name = "receipt")
    private String receipt;

    @Column(name = "totalPrice")
    private float totalPrice;

    @Column(name = "timestamp")
    private String timestamp;

}
