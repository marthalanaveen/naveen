package cc.CleanseCar.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class fbRequestsBaseEntity {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String phoneNo;

}
