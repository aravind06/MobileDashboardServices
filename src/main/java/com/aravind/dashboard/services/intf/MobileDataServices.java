package com.aravind.dashboard.services.intf;

import java.util.List;

import com.aravind.dashboard.entity.MobileInfo;

public interface MobileDataServices {
	List<MobileInfo> getMobileInfo();
	List<MobileInfo> getFilteredMobiles(String model);
	void includeMobile(MobileInfo mobile);
}
