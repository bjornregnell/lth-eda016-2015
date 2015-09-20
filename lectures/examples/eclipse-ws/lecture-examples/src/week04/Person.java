package week04;

public class Person {
	private String givenNames;  //separated by blank if more than one
	private String familyName;
	private String socialSecurityNumber;  //12 digits e.g. 199901013538
	
	public Person(String givenNames, String familyName, String socialSecurityNumber) {
		this.givenNames = givenNames;
		this.familyName = familyName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String getGivenNames() {
		return givenNames;
	}
	public void setGivenNames(String givenNames) {
		this.givenNames = givenNames;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
}