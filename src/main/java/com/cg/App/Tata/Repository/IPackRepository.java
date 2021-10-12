package com.cg.App.Tata.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.App.Tata.Module.Pack;

@Repository
public interface IPackRepository extends JpaRepository<Pack,Long>{

	Optional<Pack> findPackById(Long id);




	
 
}
