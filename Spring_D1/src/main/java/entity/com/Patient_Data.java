package entity.com;

public class Patient_Data {
	
	private int Patient_ID;
	private String Patient_Name; 
	private String Patient_DOB;
	private int Patient_Age;
	private String Patient_Address;
	public Patient_Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPatient_ID() {
		return Patient_ID;
	}
	public void setPatient_ID(int patient_ID) {
		Patient_ID = patient_ID;
	}
	public String getPatient_Name() {
		return Patient_Name;
	}
	public void setPatient_Name(String patient_Name) {
		Patient_Name = patient_Name;
	}
	public String getPatient_DOB() {
		return Patient_DOB;
	}
	public void setPatient_DOB(String patient_DOB) {
		Patient_DOB = patient_DOB;
	}
	public int getPatient_Age() {
		return Patient_Age;
	}
	public void setPatient_Age(int patient_Age) {
		Patient_Age = patient_Age;
	}
	public String getPatient_Address() {
		return Patient_Address;
	}
	public void setPatient_Address(String patient_Address) {
		Patient_Address = patient_Address;
	}
	public Patient_Data(int patient_ID, String patient_Name, String patient_DOB, int patient_Age,
			String patient_Address) {
		super();
		Patient_ID = patient_ID;
		Patient_Name = patient_Name;
		Patient_DOB = patient_DOB;
		Patient_Age = patient_Age;
		Patient_Address = patient_Address;
	}
	@Override
	public String toString() {
		return "Patient_Data [Patient_ID=" + Patient_ID + ", Patient_Name=" + Patient_Name + ", Patient_DOB="
				+ Patient_DOB + ", Patient_Age=" + Patient_Age + ", Patient_Address=" + Patient_Address + "]";
	}
	
	
	

}
