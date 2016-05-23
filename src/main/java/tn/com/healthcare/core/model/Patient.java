package tn.com.healthcare.core.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Patient extends AbstractHealthcareEntity {

	private static final long serialVersionUID = 1L;

	private String lastName;

	private String firstName;

	private long identityCardNumber;

	private int bedNumber;

	private String address;

	private String country;

	private String town;

	private String email;

	private String postCode;

	@Lob
	private byte[] photo;

	private boolean state;

	@OneToOne
	private Bloc bloc;

	@OneToMany(mappedBy = "patient")
	private List<Measure> measures;

	@ManyToMany(mappedBy = "patients")
	private List<AbstractHealthCareStaff> healthCareStaffs;

	/**
	 * @return the measures
	 */
	public List<Measure> getMeasures() {
		return measures;
	}

	/**
	 * @param measures
	 *            the measures to set
	 */
	public void setMeasures(List<Measure> measures) {
		this.measures = measures;
	}

	/**
	 * @return the healthCareStaffs
	 */
	public List<AbstractHealthCareStaff> getHealthCareStaffs() {
		return healthCareStaffs;
	}

	/**
	 * @param healthCareStaffs
	 *            the healthCareStaffs to set
	 */
	public void setHealthCareStaffs(
			List<AbstractHealthCareStaff> healthCareStaffs) {
		this.healthCareStaffs = healthCareStaffs;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	public Bloc getBloc() {
		return bloc;
	}

	public void setBloc(Bloc bloc) {
		this.bloc = bloc;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the identityCardNumber
	 */
	public long getIdentityCardNumber() {
		return identityCardNumber;
	}

	/**
	 * @param identityCardNumber
	 *            the identityCardNumber to set
	 */
	public void setIdentityCardNumber(long identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	/**
	 * @return the bedNumber
	 */
	public int getBedNumber() {
		return bedNumber;
	}

	/**
	 * @param bedNumber
	 *            the bedNumber to set
	 */
	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

	/**
	 * @return the photo
	 */
	public byte[] getPhoto() {
		return photo;
	}

	/**
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town
	 *            the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode
	 *            the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}

}
