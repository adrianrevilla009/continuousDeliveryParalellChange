package es.urjc.code.daw.library.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = null;
	
	private String title;

	private String preface;
	
	private int price;

	private Float price_float;

	public Book() {}

	public Book(String nombre, String preface, int price) {
		super();
		this.title = nombre;
		this.preface = preface;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPreface() {
		return preface;
	}

	public void setPreface(String preface) {
		this.preface = preface;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Float getPrice_float() {
		return this.price_float != null ? this.price_float : Float.valueOf(this.price);
	}

	public void setPrice_float(Float price_float) {
		this.price = price_float.intValue();
		this.price_float = price_float;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", title='" + title + '\'' +
				", preface='" + preface + '\'' +
				'}';
	}
}
