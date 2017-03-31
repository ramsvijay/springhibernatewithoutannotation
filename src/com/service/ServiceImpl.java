package com.service;

import com.bean.registration;
import com.dao.DaoInf;

public class ServiceImpl implements ServiceInf {

	DaoInf daoservice;
	
	public DaoInf getDaoservice() {
		return daoservice;
	}

	public void setDaoservice(DaoInf daoservice) {
		this.daoservice = daoservice;
	}

	@Override
	public String create(registration reg) {
		// TODO Auto-generated method stub
		String result=daoservice.create(reg);
		return "created";
	}
	@Override
	public String update(registration reg) {
		// TODO Auto-generated method stub
		String result=daoservice.update(reg);
		return "created";
	}

	@Override
	public String delete(registration reg) {
		String result=daoservice.delete(reg);

		return "created";
	}

}
