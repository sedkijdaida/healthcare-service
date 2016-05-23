package tn.com.healthcare.core.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Measure extends AbstractHealthcareEntity {

	private static final long serialVersionUID = 1L;

	private long temperatureValue;

	private long pressureValue;

	private long heartBeat;

	private long glucoseValue;

	private long pulseValue;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@ManyToOne
	private Patient patient;

	public long getTemperatureValue() {
		return temperatureValue;
	}

	public void setTemperatureValue(long temperatureValue) {
		this.temperatureValue = temperatureValue;
	}

	public long getPressureValue() {
		return pressureValue;
	}

	public void setPressureValue(long pressureValue) {
		this.pressureValue = pressureValue;
	}

	public long getHeartBeat() {
		return heartBeat;
	}

	public void setHeartBeat(long heartBeat) {
		this.heartBeat = heartBeat;
	}

	public long getGlucoseValue() {
		return glucoseValue;
	}

	public void setGlucoseValue(long glucoseValue) {
		this.glucoseValue = glucoseValue;
	}

	public long getPulseValue() {
		return pulseValue;
	}

	public void setPulseValue(long pulseValue) {
		this.pulseValue = pulseValue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient
	 *            the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
