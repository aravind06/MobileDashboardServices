package com.aravind.dashboard.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aravind.dashboard.dao.impl.DefaultMobileDataRepository;
import com.aravind.dashboard.entity.MobileInfo;
import com.aravind.dashboard.services.intf.MobileDataServices;

@Service
public class DefaultMobileDataServices implements MobileDataServices {

	@Autowired
	DefaultMobileDataRepository mobileRepo;
	
	@Override
	public List<MobileInfo> getMobileInfo() {
		return mobileRepo.fetchMobileInfo();
	}

	@Override
	public List<MobileInfo> getFilteredMobiles(String model) {
		return mobileRepo.fetchFilteredMobiles(model);
	}

	@Override
	public void includeMobile(MobileInfo mobile) {
		 mobileRepo.insertMobile(mobile);		
	}

}
