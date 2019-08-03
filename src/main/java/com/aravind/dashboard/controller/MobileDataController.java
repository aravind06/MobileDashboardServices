package com.aravind.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aravind.dashboard.entity.MobileInfo;
import com.aravind.dashboard.services.impl.DefaultMobileDataServices;

@RestController
@CrossOrigin
public class MobileDataController {

	@Autowired
	DefaultMobileDataServices mobileService;

	@RequestMapping(value = "/listAllMobiles", method = RequestMethod.GET)
	public ResponseEntity<List<MobileInfo>> getMobiles() {
		return new ResponseEntity<List<MobileInfo>>(mobileService.getMobileInfo(), HttpStatus.OK);
	}

	@RequestMapping(value = "/listMatchigMobiles", method = RequestMethod.GET)
	public ResponseEntity<List<MobileInfo>> getMatchingMobiles(@RequestParam String brand) {
		return new ResponseEntity<List<MobileInfo>>(mobileService.getFilteredMobiles(brand), HttpStatus.OK);
	}

	@RequestMapping(value = "/addMobile", method = RequestMethod.POST)
	public ResponseEntity<String> addMobileInfo(@RequestBody MobileInfo mobile) {
		mobileService.includeMobile(mobile);
		return new ResponseEntity<String>(HttpStatus.CREATED);

	}

}
