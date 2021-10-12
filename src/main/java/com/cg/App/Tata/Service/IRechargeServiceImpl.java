package com.cg.App.Tata.Service;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Module.Recharge;
import com.cg.App.Tata.Repository.IAccountRepository;
import com.cg.App.Tata.Repository.IPackRepository;
import com.cg.App.Tata.Repository.IRechargeRepository;
@Service
public class IRechargeServiceImpl implements IRechargeService{
	@Autowired
	IRechargeRepository rechargerepository;
	@Autowired
    private IPackRepository packrepository;
	@Autowired
    private IAccountRepository accountrepository;

	
	@SuppressWarnings("unused")
	public Recharge createRecharge(Pack pack, Account account) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
	packrepository.findById(pack.getId()).orElse(null);
				
    accountrepository.findById(account.getAccountId()).orElse(null);
				
	if(account==null) {
		System.out.print("Empty");
		
	}
		Recharge recharge= new Recharge();
			recharge.setAccount(account);
		    recharge.setAmount(pack.getCost());
			recharge.setDaysValidity(pack.getDaysValidity());
			recharge.setPlanDescription(pack.getDescription());
			recharge.setPlanName(pack.getPlanName());
			//recharge.setPurchasedDate(date);
		    List<String> list=new ArrayList<String>();
			list=pack.getChannels();
			recharge.setChannels(list);
			
			
    return rechargerepository.save(recharge); 
			
		
		
		
	}

	@Override
	public Recharge update(Recharge recharge) {
		// TODO Auto-generated method stub
		
		Optional<Recharge> existingUserContainer = rechargerepository.findById(recharge.getId());
		Recharge existingUser= null;
		 if(existingUserContainer.isPresent()) {
			 existingUser= existingUserContainer.get();
			 existingUser.setId(recharge.getId());
			 existingUser.setAmount(recharge.getAmount());
			 existingUser.setAccount(recharge.getAccount());
			 existingUser.setDaysValidity(recharge.getDaysValidity());
			 rechargerepository.saveAndFlush(existingUser);
			 
		 }
		return existingUser;
	}


	@Override
	public int rechargesForUserCount(long id) {
		// TODO Auto-generated method stub
    @SuppressWarnings("unused")
	Account accounts=accountrepository.findById(id).orElse(null);
		
		List<Recharge> rlist=new ArrayList<Recharge>();
		rlist=rechargerepository.findAll();
		
		rlist=rlist.stream().filter(item ->
			item.getAccount().getAccountId()==id).collect(Collectors.toList());
		
		return rlist.size();
		
	}

	@Override
	public List<Recharge> findAllRechargesInPeriod(LocalDate startDate, LocalDate endDate) {
		/*// TODO Auto-generated method stub
		List<Recharge> rlist=new ArrayList<Recharge>();
		rlist=rechargerepository.findAll();
		
	    rlist=	rlist.stream().filter(item->(item.getPurchasedDate().equals(startDate) || (item.getPurchasedDate().isAfter(startDate) && item.getPurchasedDate().isBefore(endDate) )||item.getPurchasedDate().equals(endDate))).collect(Collectors.toList());
	    Collections.sort(rlist, new Comparator<Recharge>() {
        public int compare(Recharge o1, Recharge o2) {
         
         
            	return ~(o1.getPurchasedDate().compareTo(o2.getPurchasedDate())) ;
       
		
	}
	    });
	   
		return rlist;*/
		return null;
	}

	
	@Override
	public int countRechargesInPeriod(LocalDate startDate,LocalDate endDate) {
		/*// TODO Auto-generated method stub

		List<Recharge> rlist=new ArrayList<Recharge>();
		rlist=rechargerepository.findAll();
		
	    rlist=	rlist.stream().filter(item->(item.getPurchasedDate().equals(startDate) || (item.getPurchasedDate().isAfter(startDate) && item.getPurchasedDate().isBefore(endDate) )||item.getPurchasedDate().equals(endDate))).collect(Collectors.toList());
		
		return rlist.size();*/
	    return 0;
	}



	@Override
	public long rechargesCount() {
		long count = rechargerepository.count();
		return count;
		/*// TODO Auto-generated method stub
		List<Recharge> rlist=rechargerepository.findAll();
		
	
		List<Recharge> newlist=new ArrayList<Recharge>();
	
		for(Recharge rec:rlist) {
			if(id==rec.getPack().getId()) {
				newlist.add(rec);
			}
		}
		return newlist.size();*/
		//return 0;
	}

	@Override
	public String expireIfValidityFinished(Account account, Recharge recharge) {
		/*// TODO Auto-generated method stub
	
		LocalDate date=LocalDate.now();
		//LocalDate purchaseDate=recharge.getPurchasedDate();
		LocalDate validity = purchaseDate.plusDays(recharge.getDaysValidity());
		if(validity.isBefore(date)) {
			account.setCurrentPack(null);
			return "Pack expired recharge for activating pack" ;
		}
		else {
			return "Pack is not expired";
		}*/
		return null;
	}

	@Override
	public double totalRevenueInPeriod(LocalDate startDate, LocalDate endDate) {
		/*// TODO Auto-generated method stub
		List<Recharge> rlist=new ArrayList<Recharge>();
		rlist=rechargerepository.findAll();
		
	    rlist=	rlist.stream().filter(item->(item.getPurchasedDate().equals(startDate) || (item.getPurchasedDate().isAfter(startDate) && item.getPurchasedDate().isBefore(endDate) )||item.getPurchasedDate().equals(endDate))).collect(Collectors.toList());
		double sum=0;
	    for(Recharge rec:rlist) {
		sum=sum+rec.getAmount();
	}
		
		return sum;*/
	   return 0;
	
	}

	


}
