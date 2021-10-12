package com.cg.App.Tata.Service;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.ServiceRequest;

public interface IServiceRequestService {
  ServiceRequest createServiceRequestForUser(Account account);
  ServiceRequest openedServiceRequest(Account account);
  ServiceRequest close(Long serviceRequestId);
}
