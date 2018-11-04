package com.jpa.test.control;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="mobile_info")
public class MobileInfoEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_mobile")
	@SequenceGenerator(name="seq_mobile", sequenceName="seq_mobile", allocationSize=1, initialValue=5000)
	private Long id;
	
	
	@Column(name="mobile_num")
	private String mobileNum;
	@Column(name="craete_dt")
	private Timestamp cratedDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consumerEntity_id", nullable=false)
	private ConsumerEntity consumerEntity;
	
	public ConsumerEntity getConsumerEntity() {
		return consumerEntity;
	}
	public void setConsumerEntity(ConsumerEntity consumerEntity) {
		this.consumerEntity = consumerEntity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public Timestamp getCratedDate() {
		return cratedDate;
	}
	public void setCratedDate(Timestamp cratedDate) {
		this.cratedDate = cratedDate;
	}
	
}
