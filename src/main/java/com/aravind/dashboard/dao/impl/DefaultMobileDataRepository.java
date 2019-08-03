package com.aravind.dashboard.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate; 
import com.aravind.dashboard.dao.intf.MobileDataRepository;
import com.aravind.dashboard.entity.MobileInfo;

@Repository
public class DefaultMobileDataRepository implements MobileDataRepository {

	@Autowired  
    JdbcTemplate jdbc;   
	
	@Override
	public List<MobileInfo> fetchMobileInfo() {
		String query = "SELECT * FROM mobile_information";
		 List<MobileInfo> mobileList= jdbc.query(query,
					new BeanPropertyRowMapper(MobileInfo.class));
		return mobileList;
	}

	@Override
	public List<MobileInfo> fetchFilteredMobiles(String model) {
		String query = "Select * from mobile_information where brand='"+model+"'";
		return jdbc.query(query, new BeanPropertyRowMapper(MobileInfo.class));
	}

	@Override
	public void insertMobile(MobileInfo mobile) {
		String query = "insert into mobile_information(serial_id,brand,description,imageUrl,name,price,storage) values (?,?,?,?,?,?,?)";
		jdbc.update(query,mobile.serial_id, mobile.brand, mobile.Description, mobile.imageUrl, mobile.name, mobile.price, mobile.storage);
	}
	


}
