package com.service;

import com.bean.registration;

public interface ServiceInf {
	
	public String create(registration reg);
   public String update(registration reg);
	
   public String delete(registration reg);

}
