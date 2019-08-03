package com.aravind.dashboard.dao.intf;

import java.util.List;

import com.aravind.dashboard.entity.MobileInfo;

public interface MobileDataRepository {
	List<MobileInfo> fetchMobileInfo();
	List<MobileInfo> fetchFilteredMobiles(String model);
	void insertMobile(MobileInfo mobile);
}
