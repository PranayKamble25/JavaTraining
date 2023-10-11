package com.tns.dayfive.singlelevelinheritance;

public class Citizen { 
	   
	   private String name;
	   private String aadaharNo;
	   private String address;
	   private long phNo;
	   public Citizen ()  {
		   System.out.println("Citizens obj created");
	   }
	   public Citizen(String name,String aadaharNo,String address,long phNo)
	   {
		    super();
		    this.name=name;
		    this.aadaharNo=aadaharNo;
		    this.address=address;
		    this.phNo=phNo;
		    
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadaharNo() {
		return aadaharNo;
	}
	public void setAadaharNo(String aadaharNo) {
		this.aadaharNo = aadaharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhNo
	 phNo;
	
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	public String toStrin() {
		return "Citizen [name=" + ", aadaharNo=" + aadaharNo + ", address=" + address + ", phNo=" + phNo + "]";
		
	}
}	   
 
	
		   
		   
	   



