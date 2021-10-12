package com.cg.App.Tata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cg.App.Tata.Module.Recharge;

@Repository
public interface IRechargeRepository extends JpaRepository<Recharge,Long>{


	
  

}

