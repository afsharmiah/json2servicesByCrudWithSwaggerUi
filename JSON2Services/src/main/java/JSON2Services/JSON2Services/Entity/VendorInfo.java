package JSON2Services.JSON2Services.Entity;

public class VendorInfo {
	private String vendorName;
	private String vendorContact;
	private String venContName;
	private String venContPhone;

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorContact() {
		return vendorContact;
	}

	public void setVendorContact(String vendorContact) {
		this.vendorContact = vendorContact;
	}

	public String getVenContName() {
		return venContName;
	}

	public void setVenContName(String venContName) {
		this.venContName = venContName;
	}

	public String getVenContPhone() {
		return venContPhone;
	}

	public void setVenContPhone(String venContPhone) {
		this.venContPhone = venContPhone;
	}

	public VendorInfo(String vendorName, String vendorContact, String venContName, String venContPhone) {
		super();
		this.vendorName = vendorName;
		this.vendorContact = vendorContact;
		this.venContName = venContName;
		this.venContPhone = venContPhone;
	}

	public VendorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VendorInfo [vendorName=" + vendorName + ", vendorContact=" + vendorContact + ", venContName="
				+ venContName + ", venContPhone=" + venContPhone + ", getVendorName()=" + getVendorName()
				+ ", getVendorContact()=" + getVendorContact() + ", getVenContName()=" + getVenContName()
				+ ", getVenContPhone()=" + getVenContPhone() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
