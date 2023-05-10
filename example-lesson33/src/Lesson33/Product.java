package Lesson33;

public class Product {
	public Product() {
		
	}
	public Product(int _id,String name,String description,double price,int stockAmount,String renk) {
		System.out.println("yapıcı blok çalıştı");
		this._id = _id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
				
	}
	
	//defaultta hepsinin başı public'tir
	private int _id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	 
	//getter
	public int getId() {
		return _id;
	}
	
	//setter
	public void setId(int id) {
		//this.id = id; this yerine id ler karışmasın diye isim değiştirdik _ olanlar field lar
		_id = id;	
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}

	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double price) {
		this.price = price;
	}

	
	public int getStockAmount() {
		return stockAmount;
	}

	
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	
	public String getRenk() {
		return renk;
	}

	
	public void setRenk(String renk) {
		this.renk = renk;
	}

	
	public String getKod() {
		return this.name.substring(0, 1) + _id;
	}

	

	
}

