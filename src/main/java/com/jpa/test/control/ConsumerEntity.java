package com.jpa.test.control;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity(name = "consumer_e")
public class ConsumerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cmr")
	@SequenceGenerator(name = "seq_cmr", sequenceName = "seq_cmr", allocationSize = 1, initialValue = 4000)
	private Long id;

	@Column
	private String name;

	@Column
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "consumerEntity")
	private Set<MobileInfoEntity> mobileInfo = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<MobileInfoEntity> getMobileInfo() {
		return mobileInfo;
	}

	public void setMobileInfo(Set<MobileInfoEntity> mobileInfo) {
		this.mobileInfo = mobileInfo;
	}

}
