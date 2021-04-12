package cc.CleanseCar.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sm_on_demand_leads")
public class onDemandsleadsTblEntity {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sm_lead")
    private Long smLead;

    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "location")
    private String location;
    @Column(name = "priority_status")
    private String priorityStatus;
    @Column(name = "is_active")
    private String isActive;
    @Column(name = "source_by")
    private String sourceBy;
    
    
	public Long getSmLead() {
		return smLead;
	}
	public void setSmLead(Long smLead) {
		this.smLead = smLead;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPriorityStatus() {
		return priorityStatus;
	}
	public void setPriorityStatus(String priorityStatus) {
		this.priorityStatus = priorityStatus;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getSourceBy() {
		return sourceBy;
	}
	public void setSourceBy(String sourceBy) {
		this.sourceBy = sourceBy;
	}
    
    
   
	
	
}
