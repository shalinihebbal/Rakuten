package com.rakuten.prj.dao;

import com.rakuten.prj.entity.Mobile;

public class MobileDaoMySQLlmpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("stored in MySQL!!");
	}

}
