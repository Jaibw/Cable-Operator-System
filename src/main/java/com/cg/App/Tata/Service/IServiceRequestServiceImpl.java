package com.cg.App.Tata.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.ServiceRequest;
import com.cg.App.Tata.Repository.IServiceRequestRepository;
@Service
public class IServiceRequestServiceImpl implements IServiceRequestService {
	@Autowired
	IServiceRequestRepository iservicerequestrepository;
	@Override
	public ServiceRequest createServiceRequestForUser(Account account) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public ServiceRequest openedServiceRequest(Account account) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public ServiceRequest close(Long serviceRequestId) {
		// TODO Auto-generated method stub
		return null;
	}

}
