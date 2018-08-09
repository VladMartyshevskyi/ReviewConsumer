package com.vlad.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String positive;
	private String negative;
	private int usingPeriod;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPositive() {
		return positive;
	}
	public void setPositive(String positive) {
		this.positive = positive;
	}
	public String getNegative() {
		return negative;
	}
	public void setNegative(String negative) {
		this.negative = negative;
	}
	public int getUsingPeriod() {
		return usingPeriod;
	}
	public void setUsingPeriod(int usingPeriod) {
		this.usingPeriod = usingPeriod;
	}
	
}
