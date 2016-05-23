package tn.com.healthcare.sample.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tn.com.healthcare.core.model.AbstractHealthCareStaff;
import tn.com.healthcare.core.model.Doctor;
import tn.com.healthcare.core.model.Patient;
import tn.com.healthcare.core.model.Period;
import tn.com.healthcare.core.service.BlocService;
import tn.com.healthcare.core.service.DoctorGradeService;
import tn.com.healthcare.core.service.DoctorService;
import tn.com.healthcare.core.service.HealthCareStaffService;
import tn.com.healthcare.core.service.HealthCareStaffTypeService;
import tn.com.healthcare.core.service.HealthcareTypeService;
import tn.com.healthcare.core.service.HospitalServices;
import tn.com.healthcare.core.service.MaleNurseService;
import tn.com.healthcare.core.service.MeasureService;
import tn.com.healthcare.core.service.PatientService;
import tn.com.healthcare.core.service.PerformanceReportService;
import tn.com.healthcare.core.service.PeriodService;
import tn.com.healthcare.core.service.UserService;

@ContextConfiguration(locations = { "classpath:spring/business-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("healthcare-data-jpa")
public class HealthcareServiceTest {

	private static Logger log = Logger.getLogger(HealthcareServiceTest.class
			.getName());

	@Autowired
	protected DoctorService doctorService;

	@Autowired
	protected UserService userService;

	@Autowired
	protected DoctorGradeService doctorGradeService;

	@Autowired
	protected HealthCareStaffTypeService healthCareStaffTypeService;

	@Autowired
	protected MaleNurseService maleNurseService;

	@Autowired
	protected BlocService blocService;

	@Autowired
	protected PatientService patientService;

	@Autowired
	protected HospitalServices hospitalServices;

	@Autowired
	protected MeasureService measureService;

	@Autowired
	protected HealthcareTypeService healthTypeService;

	@Autowired
	protected PerformanceReportService performanceReportService;

	@Autowired
	protected HealthCareStaffService healthCareStaffService;

	@Autowired
	protected PeriodService periodService;

	// @Autowired
	// protected PatientReportService patientReportService;

	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void insertPatient() {
	// Measure measure = measureService.findOne(14L);
	// System.out.println(measure.getDate());
	// }

	@Test
	@Rollback(value = false)
	@Transactional
	public void savaAndFind() {

		Doctor doctor = new Doctor();
		doctor.setFirstName("sadam");
		doctor.setLastName("semioni");
		doctor.setAddress("iraq");
		doctor.setEmail("sadam.simioni@gamil.com");
		doctor.setCountry("falouja");

		doctor = doctorService.saveAndFlush(doctor);

		AbstractHealthCareStaff healthCareStaff = healthCareStaffService
				.findOne(doctor.getId());

		log.info(healthCareStaff.getFirstName());

		Assert.assertEquals(healthCareStaff instanceof Doctor, true);

		Period p = new Period();
		p.setStartDate(new Date(System.currentTimeMillis()));
		p.setEndDate(new Date(System.currentTimeMillis() + 36000));

		p = periodService.save(p);

		healthCareStaff.getPeriods().add(p);

		healthCareStaffService.save(doctor);

		log.info("Add association with success!!");
	}

	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void searchPhoneNumber() {
	// Doctor doctor = patientService.searchMobileNumber(1L);
	// System.out.println(doctor.getMobilePhoneNumber());
	//
	// }

	/*************************************** save Patient report *************************************************/

	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void saveReportPatient() {
	// Doctor doctor = doctorService.findOne(1L);
	// PatientReport report = new PatientReport();
	// report.setTitle("suivie n°5");
	// report.setDescription("etat sante en mauvaise");
	// report.setDoctor(doctor);
	// this.patientReportService.saveAndFlush(report);
	// }
	/******************* searchbloc *********/

	@Test
	public void searchbloc() {

		Patient maleNurse = patientService.searchByIdentityCardNumber(14332112);
		System.out.println(maleNurse.getEmail());

	}

	/****************** add perforamance report ***********/
	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void addPerformanceReport() {
	//
	// PerformanceReport pr = new PerformanceReport();
	// // ReportType type = new ReportType();
	// // type.setName("trimestrielle");
	// pr.setTitle("dd");
	// pr.setDescription("ffezfe");
	// pr.setNotice("fdffrfbb");
	// String s = "12/09/2001";
	//
	// String stringDateFormat = "14/09/2011";
	// DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	// Date convertedDate = null;
	// try {
	// convertedDate = (Date) formatter.parse(stringDateFormat);
	// System.out.println("Date from dd/MM/yyyy String in Java : "
	// + convertedDate);
	//
	// } catch (ParseException e) {
	// System.out.println(e.getMessage());
	// e.printStackTrace();
	// }
	// pr.setDate(convertedDate);
	//
	// this.performanceReportService.saveAndFlush(pr);
	//
	// }
	/***************** insert a patient *************************/
	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void insertPatient() {
	// HealthcareType healthType = new HealthcareType();
	// healthType.setName("cardiologie");
	// this.healthTypeService.save(healthType);
	// HospitalService service1 = new HospitalService();
	// service1.setName("service cadriolgie");
	//
	// this.hospitalServices.save(service1);
	// Bloc bloc = new Bloc();
	// bloc.setName("B");
	// bloc.setType(healthType);
	// bloc.setService(service1);
	// this.blocService.save(bloc);
	// Patient patient = new Patient();
	// patient.setFirstName("marwen");
	// patient.setLastName("ben ali");
	// patient.setIdentityCardNumber(23422232);
	// patient.setBedNumber(15);
	// patient.setAddress("TUNIS");
	// patient.setCountry("ariana");
	// patient.setEmail("marwen@yahoo.fr");
	// System.out.println("succesful");
	//
	// }

	// patient.setBloc(bloc);
	// Patient patient1 = patientService.findOne(5L);
	// System.out.println(patient1.getFirstName());
	// Measure measure1 = measureService.findOne(4L);
	// System.out.println(measure1.getGlucoseValue());
	// // Measure measure2 = measureService.findOne(6L);
	// List<Measure> measuress = new ArrayList<Measure>();
	// measuress.add(measure1);
	// // measures.add(measure2);
	// patient1.setMeasures(measuress);
	// // patient.setState(true);
	// this.patientService.saveAndFlush(patient1);
	// // this.patientService.save(patient);
	// }

	/*********************************************** fin insert patient **********************************************/

	/********** search and affect staff ****************/
	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void searchAndAffect() {
	// Patient patient1 = patientService.findOne(1L);
	// System.out.println(patient1.getLastName());
	//
	// Patient patient2 = patientService.findOne(2L);
	// System.out.println(patient1.getLastName());
	// Patient patient3 = patientService.findOne(4L);
	// System.out.println(patient2.getLastName());
	// MaleNurse maleNurse = maleNurseService.findOne(3L);
	// // Doctor doctor = doctorService.findOne(1L);
	// List<Patient> patients = new ArrayList<Patient>();
	// patients.add(patient1);
	// patients.add(patient2);
	// patients.add(patient3);
	// maleNurse.setPatients(patients);
	// }

	/***************************************************************/
	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void searchAndAffectDoctor() {
	// Patient patient1 = patientService.findOne((long) 3);
	// System.out.println(patient1.getLastName());
	// Patient patient2 = patientService.findOne((long) 4);
	// System.out.println(patient2.getLastName());
	// Doctor doctor = doctorService.findOne((long) 1);
	// ArrayList<Patient> patients = new ArrayList<>();
	// patients.add(patient1);
	// patients.add(patient2);
	// doctor.setPatients(patients);
	// }
	/********************** save a measure ***********************************/
	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void insertMeasure() {
	// Measure measure = new Measure();
	// measure.setGlucoseValue(2);
	// measure.setHeartBeat(76);
	// measure.setPressureValue(15);
	// measure.setPulseValue(74);
	// measure.setTemperatureValue(37);
	// Date date = new Date(System.currentTimeMillis());
	// measure.setDate(date);
	// this.measureService.save(measure);
	//
	// }
	/***************************************************************/
	// @Test
	// @Rollback(value = false)
	// public void searchPatient() {
	// // // List<Patient> patients = patientService.findAll();
	// // // for (int i = 0; i < patients.size(); i++) {
	// // // Patient element = patients.get(i);
	// // // System.out.print(element.getFirstName());
	// // //
	// // // System.out.print(element.getLastName());
	// // // System.out.println();
	// // // System.out.print(element.getBedNumber());
	// // // System.out.println();
	// // // System.out.print(element.getIdentityCardNumber());
	// List<Patient> patients = patientService.searchById(3, "A");
	// for (int i = 0; i < patients.size(); i++) {
	// Patient element = patients.get(i);
	// System.out.print(element.getFirstName());
	// System.out.print(element.getLastName());
	// }
	//
	// }

	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void saveMeasure() {
	// measureService.saveMeasure(1L, null, 1, 2, 13, 4, 5);
	// }
	// /************ search measure for each Patient *************/
	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void searchMeasure() {
	//
	// List<Measure> measures = measureService.searchMeasure("chef");
	// for (int i = 0; i < measures.size(); i++) {
	// Measure element = measures.get(i);
	// System.out.println(element.getGlucoseValue());
	// System.out.println(element.getHeartBeat());
	// System.out.println(element.getPressureValue());
	// System.out.println(element.getPulseValue());
	//
	// }
	// }

	/*********************************************************/

	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void insertDoctor() {
	// User user = new User();
	// user.setFirstName("sedki");
	// user.setLastName("foulen");
	// user.setIdentityCardNumber(12345345);
	// user.setEmail("sodkith@gmail.com");
	// user.setLogin("aaa");
	// user.setPassword("fff");
	//
	// this.userService.save(user);
	//
	// }

	// @Test
	// @Rollback(value = false)
	// public void searchAll() {
	// User user = userService.findOne((long) 1);
	// System.out.println(user.getEmail());
	// }
	/****************************************** insert staff medical *******************************************/
	// @Test
	// @Rollback(value = false)
	// @Transactional
	// public void insertDoctor() {
	// HealthCareStaffType type = new HealthCareStaffType();
	// type.setType("hyrologie");
	// this.healthCareStaffTypeService.save(type);
	// MaleNurse maleNurse = new MaleNurse();
	// maleNurse.setFirstName("Imed");
	// maleNurse.setLastName("rahali");
	// maleNurse.setHealthCareStaffType(type);
	// maleNurse.setIdentityCardNumber(12333321);
	// maleNurse.setEmail("Imed.rahali@hotmail.fr");
	// maleNurse.setLogin("mll");
	// maleNurse.setPassword("ff");
	// this.maleNurseService.save(maleNurse);
	// // DoctorGrade grade = new DoctorGrade();
	// // grade.setGrade("general");
	// // this.doctorGradeService.save(grade);
	// //
	// // HealthCareStaffType type1 = new HealthCareStaffType();
	// // type1.setType("gastro");
	// // this.healthCareStaffTypeService.save(type1);
	// // Doctor doctor = new Doctor();
	// // doctor.setFirstName("salem");
	// // doctor.setLastName("lachheb");
	// // doctor.setGrade(grade);
	// // doctor.setHealthCareStaffType(type1);
	// // doctor.setAddress("sousse");
	// // doctor.setEmail("salem.lashheb@yahoo.fr");
	// //
	// // doctor.setLogin("sdk");
	// // doctor.setPassword("f");
	// // this.doctorService.saveAndFlush(doctor);
	// }
	// @Test
	// public void findUsers() {
	// List<User> users = userService.findAll();
	//
	// for (User user : users) {
	// log.info("-> user : " + user.getFirstName() + " "
	// + user.getLastName());
	// if (user instanceof Doctor) {
	// log.info("he is a doctor");
	// }
	// }

	// }

}
