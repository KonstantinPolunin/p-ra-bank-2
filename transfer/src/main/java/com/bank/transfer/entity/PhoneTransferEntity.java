package com.bank.transfer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Entity для таблицы "phone_transfer".
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "phone_transfer", schema = "transfer")
public class PhoneTransferEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_details_id")
    private Long accountDetailsId;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @NotNull
    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "purpose")
    private String purpose;
}
