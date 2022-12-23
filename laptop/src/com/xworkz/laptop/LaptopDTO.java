package com.xworkz.laptop;

public class LaptopDTO {
	private String name;
	private int price;
	private String screenSize;
	private String ram;
	private String processor;
	private String version;
	private String productId;
	private String systemType;
	private String edition;
	private String deviceId;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getSystemType() {
		return systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public LaptopDTO(String name, int price, String screenSize, String ram, String processor, String version,
			String productId, String systemType, String edition, String deviceId) {
		super();
		this.name = name;
		this.price = price;
		this.screenSize = screenSize;
		this.ram = ram;
		this.processor = processor;
		this.version = version;
		this.productId = productId;
		this.systemType = systemType;
		this.edition = edition;
		this.deviceId = deviceId;
	}
	@Override
	public String toString() {
		return "LaptopDTO [name=" + name + ", price=" + price + ", screenSize=" + screenSize + ", ram=" + ram
				+ ", processor=" + processor + ", version=" + version + ", productId=" + productId + ", systemType="
				+ systemType + ", edition=" + edition + ", deviceId=" + deviceId + "]";
	}
	
	
	
	
	
	

}
