package com.jpa.test.control;

import java.util.List;

public class Consumer {

	private String name;
	private List<MobileInfo> mobileInfo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MobileInfo> getMobileInfo() {
		return mobileInfo;
	}
	public void setMobileInfo(List<MobileInfo> mobileInfo) {
		this.mobileInfo = mobileInfo;
	}
	
}
