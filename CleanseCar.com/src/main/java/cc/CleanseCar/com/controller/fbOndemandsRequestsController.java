package cc.CleanseCar.com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import cc.CleanseCar.com.utils.Response;

import cc.CleanseCar.com.dto.fbRequestsform;
import cc.CleanseCar.com.entity.onDemandsleadsTblEntity;
import cc.CleanseCar.com.repository.onDemandsleadsTblRepository;


@RestController
public class fbOndemandsRequestsController {

	
	@Autowired
	onDemandsleadsTblRepository onDemandsleadsTblRepo;
	
	@PostMapping(path = {"/saveRequestform"})
    public ResponseEntity<Object> saveRequestform(@RequestBody fbRequestsform requests) throws IOException {
		Map<String, Object> objMap = new HashMap<>();
       
		String custName = requests.getCustName();
		String contactNo = requests.getPhoneNo();
		String emailId = requests.getEmailId();
		String location = requests.getLocation();
		String priority = requests.getPriority();
		
		onDemandsleadsTblEntity onDemandsleadsEntity = new onDemandsleadsTblEntity();
		
		onDemandsleadsEntity.setCustomerName(custName);
		onDemandsleadsEntity.setPhoneNo(contactNo);
		onDemandsleadsEntity.setEmailId(emailId);
		onDemandsleadsEntity.setLocation(location);
		onDemandsleadsEntity.setPriorityStatus(priority);
		onDemandsleadsEntity.setIsActive("Y");
		
		onDemandsleadsTblEntity onDemandsleadsTblsave = onDemandsleadsTblRepo.save(onDemandsleadsEntity);
		Long autoLeadsId = onDemandsleadsTblsave.getSmLead();
		
		
		objMap.put("status", "Given Date is Stored");
    	objMap.put("autoID", autoLeadsId);
    	

		return Response.success(objMap);
    }
	
	
	
	
	
}
