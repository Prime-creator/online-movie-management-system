
/**********************************************************************************************************************************
 -File Name         :   Ticket Repository Interface
 -Author            :   Reetesh Kumar Mandal
 -Creation Date     :   23-09-2020
 -Description       :   Repository interface used to connect to the database 
 **********************************************************************************************************************************/
package com.cg.omtb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.omtb.entity.TicketEntity;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Integer>{

	public List<TicketEntity> findByCustomerId(Integer customerId);
}
