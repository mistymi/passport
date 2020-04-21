package passport.entity;


import java.util.Date;

public class Passport {
	private String id;
	private String name;
	private String carNumber;
	private String address;
	private Date regDate;
	private String audit;
	
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passport(String id, String name, String carNumber, String address, Date regDate, String audit) {
		super();
		this.id = id;
		this.name = name;
		this.carNumber = carNumber;
		this.address = address;
		this.regDate = regDate;
		this.audit = audit;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getAudit() {
		return audit;
	}

	public void setAudit(String audit) {
		this.audit = audit;
	}

	@Override
	public String toString() {
		return "电子通行证编号：" + id + "\t电子通行证姓名：" + name 
				+ "\t电子通行证车牌号：" + carNumber + "\t电子通行证地址：" + address
				+ "\t电子通行证注册时间：" + regDate + "\t电子通行证审核状态：" + audit;

	}
	
	
}
