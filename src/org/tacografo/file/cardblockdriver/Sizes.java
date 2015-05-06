/**
 * 
 */
package org.tacografo.file.cardblockdriver;

/**
 * Tama�os en bytes de los diferentes datos de la estructura de los ficheros 
 * seg�n REGLAMENTO (CE) No 1360/2002 DE LA COMISI�N de 13 de junio de 2002
 * hoja "l 207/119"
 * @author Andr�s Carmona Gil	
 * @version 0.0.1
 *
 */
public enum Sizes {

	//(tama�o(byte) min,tama�o(byte) max, valor por defecto)
	MF (11411,24959,0),
		EF_IC(25,25,0), // EF Archivo elemental
			CARDICCIDENTIFICATION(25,25,0),
				CLOCKSTOP(1,1,0),
				CARDEXTENDEDSERIALNUMBER(8,8,0),
				CARDAPPROVALNUMBER(8,8,20),
				CARDPERSONALISERID(1,1,0),
				EMBEDDERICASSEMBLERID(5,5,0),
				ICIDENTIFIER(2,2,0),
		EF_ICC(8,8,0),
			CARDCHIPIDENTIFICATION(8,8,0),
				ICSERIALNUMBER(4,4,0),
				ICMANUFACTURINGREFENCES(4,4,0),
		DF_TACHOGRAPF(11378,24926,0),  //DF Archivo dedicado. Un DF puede contener otros archivos (EF o DF)
			EF_APPLICATION_IDENTIFICATION(10,10,0),
				DRIVERCARDAPPLICATIONIDENTIFICATION(10,10,0),
					TYPEOFTACHOGRAPHCARDID(1,1,0),
					CARDSTRUCTUREVERSION(2,2,0),
					NOOFEVENTSPERTYPE(1,1,0),
					NOOFFAULTSPERTYPE(1,1,0),
					ACTIVITYSTRUCTURELENGTH(2,2,0),
					NOOFCARDVEHICLERECORDS(2,2,0),
					NOOFCARDPLACERECORDS(1,1,0),
			EF_CARD_CERTIFICATE(194,194,0),
				CARDCERTIFICATE(194,194,0),
			EF_CA_CERTIFICATE(194,194,0),
				MEMBERSTATECERTIFICATE(194,194,0),
			EF_IDENTIFICATION(143,143,0),
				CARDIDENTIFICATION(65,65,0),
					CARDISSUINGMEMBERSTATE(1,1,0),
					CARDNUMBER(16,16,20),
					CARDISSUINGAUTORITYNAME(36,36,20),
					CARDISSUEDATE(4,4,0),
					CARDVALIDITYBEGIN(4,4,0),
					CARDEXPIRYDATE(4,4,0),
					DRIVERCARDHOLDERIDENTIFICATION(78,78,0),
					CARDHOLDERNAME(72,72,0),
						HOLDERSURNAME(36,36,200),
						HOLDERFIRTSNAMES(36,36,200),
					CARDHOLDERBIRTHDATE(4,4,0),
					CARDHOLDERPREFERREDLANGUAGE(2,2,20),
			EF_CARD_DOWNLOAD(4,4,0),
				LASTCARDDOWNLOAD(4,4,0),
			EF_DRIVING_LICENSE_INFO(53,53,0),
				CARDDRIVINGLICENCEINFORMATION(53,53,0),
					DRIVINGLICENCEISSUINGAUTHORITY(36,36,200),
					DRIVINGLICENCEISSUINGNATION(1,1,0),
					DRIVINGLICENCENUMBER(16,16,20),
			EF_EVENTS_DATA(864,1728,0),
				CARDEVENTDATA(864,1728,0),
					CARDEVENTRECORDS(144,288,0),
						CARDEVENTRECORD(24,24,0),
							EVENTTYPE(1,1,0),
							EVENTBEGINTIME(4,4,0),
							EVENTENDTIME(4,4,0),
							EVENTVEHICLEREGISTRATION(15,15,0),
								VEHICLEREGISTRATIONNATION_CARDEVENTDATA(1,1,0),
								VEHICLEREGISTRATIONNUMBER_CARDEVENTDATA(14,14,0),
			EF_FAULTS_DATA(576,1152,0),
				CARDFAULTDATA(576,1152,0),
					CARDFAULTRECORD(24,24,0),
						FAULTTYPE(1,1,0),
						FAULTBEGINTIME(4,4,0),
						FAULTENDTIME(4,4,0),
						FAULTVEHICLEREGISTRATION(15,15,0),
							VEHICLEREGISTRATIONNATION_CARDFAULTDATA(1,1,0),
							VEHICLEREGISTRATIONNUMBER_CARDFAULTDATA(14,14,0),
			EF_DRIVER_ACTIVITY_DATA(5548,13780,0),
				CARDDRIVERACTIVITY(5548,13780,0),
					ACTIVITYPOINTEROLDESTADAYRECORD(2,2,0),
					ACTIVITYPOINTERNEWESTRECORD(2,2,0),
					ACTIVITYDAILYRECORDS(5544,13776,0),
						ACTIVITYPREVIUSRECORDLENGTH(2,2,0),
						ACTIVITYRECORDLENGTH(2,2,0),
						ACTIVITYRECORDDATE(4,4,0),
						ACTIVITYDAILYPRESENCECOUNTER(2,2,0),
						ACTIVITYDAYDISTANCE(2,2,0),
						ACTIVITYCHANGEINFO(2,1440,0),												
			EF_VEHICLES_USED(2606,6202,0),
				CARDVEHICLEUSED(2606,6202,0),
					VEHICLEPOINTERNEWESTRECORD(2,2,0),
					CARDVEHICLERECORDS(2604,6200,0),
						CARDVEHICLERECORD(31,31,0),
							VEHICLEODOMETERBEGIN(3,3,0),
							VEHICLEODOMETEREND(3,3,0),
							VEHICLEFIRSTUSE(4,4,0),
							VEHICLELASTUSE(4,4,0),
							VEHICLEREGISTRATION(15,15,0),
								VEHICLEREGISTRATIONNATION(1,1,0),
								VEHICLEREGISTRATIONNUMBER(14,14,0),
							VUDATABLOCKCOUNTER(2,2,0),	
			EF_PLACES(841,1121,0),
				CARDPLACEDAILYWORKPERIOD(841,1121,0),
					PLACEPOINTERNEWESTRECORD(1,1,0),
					PLACERECORDS(840,1120,0),
						PLACERECORD(10,10,0),
							ENTRYTIME(4,4,0),
							ENTRYTYPEDAILYWORKPERIOD(1,1,0),
							DAILYWORKPERIODCOUNTRY(1,1,0),							
							DAILYWORKPERIODREGION(1,1,0),
							VEHICLEODOMETERVALUE(3,3,0),							
			EF_CURRENT_USAGE(19,19,0),
				CARDCURRENTUSE(19,19,0),
					SESSIONOPENTIME(4,4,0),
					SESSIONOPENVEHICLE(15,15,0),
						VEHICLEREGISTRATIONNATION_CARDCURRENTUSE(1,1,0),
						VEHICLEREGISTRATIONNUMBER_CARDCURRENTUSE(14,14,0),
			EF_CONTROL_ACTIVITY_DATA(46,46,0),
				CARDCONTROLACTIVITYDATARECORD(46,46,0),
					CONTROLTYPE(1,1,0),
					CONTROLTIME(4,4,0),
					CONTROLCARDNUMBER(18,18,0),
						CARDTYPE(1,1,0),
						CARDISSUINGMEMBERSTATE_CONTROL(1,1,0),
						CARDNUMBER_CONTROL(16,16,0),
					CONTROLVEHICLEREGISTRATION(15,15,0),
						VEHICLEREGISTRATIONNATION_CONTROL(1,1,0),
						VEHICLEREGISTRATIONNUMBER_CONTROL(14,14,0),
					CONTROLDOWNLOADPERIODBEGIN(4,4,0),
					CONTROLDOWNLOADPERIODEND(4,4,0),
			EF_SPECIFIC_CONDITIONS(280,280,0),
				SPECIFICCONDITIONRECORD(5,5,0),
					ENTRYTIME_SPECIFIC(4,4,0),
					SPECIFICCIONDITIONTYPE(1,1,0);
		
	
	private int min;
	private int max;
	private int defecto;
	
	Sizes(int min, int max, int defecto){
		
		this.min=min;
		this.max=max;
		this.defecto=defecto;
	}
	
	

	/**
	 * Obtiene bytes minimos que debe contener el dato
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * Obtiene bytes maximos que debe contener el dato
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * Obtiene el valor por defecto que tiene que tener el dato
	 * @return the defecto
	 */
	public int getDefecto() {
		return defecto;
	}
	
}
