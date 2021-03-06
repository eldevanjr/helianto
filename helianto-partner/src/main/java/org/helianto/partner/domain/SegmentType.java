package org.helianto.partner.domain;

/**
 * Segment type definition.
 * 
 * According to ISIC, rev. 4, International Standard Industrial 
 * Classification of All Economic Activities.
 * 
 * @author mauriciofernandesdecastro
 */
public enum SegmentType {
	
	Z("Not yet classified (not ISIC!)"),
	A("Agriculture, forestry and fishing"),
	B("Mining and quarrying"),
	C("Manufacturing"),
	D("Electricity, gas, steam and air conditioning supply"),
	E("Water supply; sewerage, waste management and remediation activities"),
	F("Construction"),
	G("Wholesale and retail trade; repair of motor vehicles and motorcycles"),
	H("Transportation and storage"),
	I("Accommodation and food service activities"),
	J("Information and communication"),
	K("Financial and insurance activities"),
	L("Real estate activities"),
	M("Professional, scientific and technical activities"),
	N("Administrative and support service activities"),
	O("Public administration and defence; compulsory social security"),
	P("Education"),
	Q("Human health and social work activities"),
	R("Arts, entertainment and recreation"),
	S("Other service activities"),
	T("Activities of households as employers; undifferentiated goods- and services-producing activities of households for own use"),
	U("Activities of extraterritorial organizations and bodies");
	
	private SegmentType(String description) {
		this.description = description;
	}
	
	private String description;
	
	/**
	 * Description.
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Char value.
	 */
	public char getValue() {
		return toString().charAt(0);
	}

}

