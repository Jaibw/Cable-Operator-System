package com.cg.App.Tata.Ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.ServiceRequest;
import com.cg.App.Tata.Service.IServiceRequestService;

@RestController
@RequestMapping("/api/ServiceRequest")
public class ServiceRequestController {
	@Autowired
	IServiceRequestService srservice;
	
	@PostMapping("/createServiceRequest")
	public ServiceRequest createServiceRequestForUser(@RequestBody Account account) {
		return srservice.createServiceRequestForUser(account);
	}

	@PostMapping("/OpenServiceRequest")
	public ServiceRequest openedServiceRequest(@RequestBody Account account) {
		return srservice.openedServiceRequest(account);
	}

	@PostMapping("/closeServiceRequest/{serviceRequestId}")
	public ServiceRequest close(@PathVariable Long serviceRequestId) {
		return srservice.close(serviceRequestId);
	}
	
	

}
