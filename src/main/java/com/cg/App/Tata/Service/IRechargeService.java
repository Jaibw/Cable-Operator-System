package com.cg.App.Tata.Service;


import java.time.LocalDate;
import java.util.List;


import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Module.Pack;
import com.cg.App.Tata.Module.Recharge;



public interface IRechargeService {
  Recharge createRecharge(Pack pack, Account account);
  Recharge update(Recharge recharge);
  int rechargesForUserCount(long id);
  List<Recharge> findAllRechargesInPeriod(LocalDate startDate, LocalDate endDate);
  int countRechargesInPeriod(LocalDate startDate, LocalDate endDate);
  double totalRevenueInPeriod(LocalDate startDate, LocalDate endDate);
  long rechargesCount();
  String expireIfValidityFinished(Account account, Recharge recharge);

  

}
  

