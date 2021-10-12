package com.cg.App.Tata.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Repository.IPackRepository;
@Service
public class IPackServiceImpl implements IPackService{
	@Autowired
	IPackRepository packrepo;
	@Override
	public Pack add(Pack pack) {
		// TODO Auto-generated method stub
		Pack thepack= packrepo.save(pack);
		return thepack;
		//return null;
	}

	@Override
	public Pack update(Pack pack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pack findPackById(Long id) {
		// TODO Auto-generated method stub
		Optional<Pack> byid = packrepo.findPackById(id);
		Pack sp = byid.get();
		return sp;
		//return null;
	}

	@Override
	public List<Pack> findPacksGreaterThanAmount(double amount) {
		// TODO Auto-generated method stub
		List<Pack> response = (List<Pack>) ((IPackService) packrepo).findPacksGreaterThanAmount(amount);
		return response;
		
		//return null;
	}

	@Override
	public List<Pack> findPacksInAscendingOrderByDaysValidity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pack> findPacksInAscendingOrderByCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pack> popularPacks() {
		// TODO Auto-generated method stub
		return packrepo.findAll();
		//return null;
	}

	@Override
	public String deleteByPackId(Long id) {
		packrepo.deleteById(id);
		return "Record deleted";
		//return null;
		// TODO Auto-generated method stub
		
	}

}
