package main.java.com.xworkz.buscuit.dto;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity


@Table(name = "Biscuit_detail")
public class BuscuitDto {
    @Id
	private int id;
	private String name;
	private int price;
	private String type;
	private String flavour;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public BuscuitDto(int id, String name, int price, String type, String flavour) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.flavour = flavour;
	}
	public BuscuitDto() {
		super();
		
	}
	@Override
	public String toString() {
		return "BuscuitDto [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", flavour="
				+ flavour + "]";
	}

}
