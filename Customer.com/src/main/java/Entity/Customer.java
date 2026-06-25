package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "Darsh " )

public class Customer {
	@Id
	private int customerId ;
	
	@Column(unique = true) 
	private long AadhaarNumber;
	
	@Column(unique = true) 
	private String PANnumber ;
	
	private String Fullname;
	private String DOB;
	private String Gender; 
	
	@Column(unique = true) 
	private long MobileNo; 
	
	@Column(unique = true) 
	private String EmailID;
	
	private String PermanentAdd;
	private String CurrentAdd;
	
	@Column(unique = true) 
	private long AccountNumber;
	
	private int CreditScore;
	private int AnnualIncome;
	private String Occupation;
	private String Nationality ;
	
	public Customer(int customerId, long aadhaarNumber, String pANnumber, String fullname, String dOB, String gender,
			long mobileNo, String emailID, String permanentAdd, String currentAdd, long accountNumber, int creditScore,
			int annualIncome, String occupation, String nationality) {
		super();
		this.customerId = customerId;
		AadhaarNumber = aadhaarNumber;
		PANnumber = pANnumber;
		Fullname = fullname;
		DOB = dOB;
		Gender = gender;
		MobileNo = mobileNo;
		EmailID = emailID;
		PermanentAdd = permanentAdd;
		CurrentAdd = currentAdd;
		AccountNumber = accountNumber;
		CreditScore = creditScore;
		AnnualIncome = annualIncome;
		Occupation = occupation;
		Nationality = nationality;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public long getAadhaarNumber() {
		return AadhaarNumber;
	}
	public void setAadhaarNumber(long aadhaarNumber) {
		AadhaarNumber = aadhaarNumber;
	}
	public String getPANnumber() {
		return PANnumber;
	}
	public void setPANnumber(String pANnumber) {
		PANnumber = pANnumber;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getPermanentAdd() {
		return PermanentAdd;
	}
	public void setPermanentAdd(String permanentAdd) {
		PermanentAdd = permanentAdd;
	}
	public String getCurrentAdd() {
		return CurrentAdd;
	}
	public void setCurrentAdd(String currentAdd) {
		CurrentAdd = currentAdd;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public int getCreditScore() {
		return CreditScore;
	}
	public void setCreditScore(int creditScore) {
		CreditScore = creditScore;
	}
	public int getAnnualIncome() {
		return AnnualIncome;
	}
	public void setAnnualIncome(int annualIncome) {
		AnnualIncome = annualIncome;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", AadhaarNumber=" + AadhaarNumber + ", PANnumber=" + PANnumber
				+ ", Fullname=" + Fullname + ", DOB=" + DOB + ", Gender=" + Gender + ", MobileNo=" + MobileNo
				+ ", EmailID=" + EmailID + ", PermanentAdd=" + PermanentAdd + ", CurrentAdd=" + CurrentAdd
				+ ", AccountNumber=" + AccountNumber + ", CreditScore=" + CreditScore + ", AnnualIncome=" + AnnualIncome
				+ ", Occupation=" + Occupation + ", Nationality=" + Nationality + "]";
	}
	
	
	
	

}
