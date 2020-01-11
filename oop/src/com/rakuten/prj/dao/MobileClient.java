package com.rakuten.prj.dao;

import com.rakuten.prj.entity.Mobile;

public class MobileClient {
	public static void main(String args[]) {
	Mobile m=new Mobile();
	MobileDao mobileDao =new MobileDaoMySQLlmpl(); //MobileDaoMongolmpl-->o/p-->stored in MongoDb
	mobileDao.addMobile(m);
}
}