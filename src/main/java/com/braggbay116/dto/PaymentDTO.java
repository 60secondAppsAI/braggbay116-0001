package com.braggbay116.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class PaymentDTO {

	private Integer paymentId;

	private double amount;

	private Date paymentDate;






}