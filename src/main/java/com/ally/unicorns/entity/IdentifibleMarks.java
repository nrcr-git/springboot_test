package com.ally.unicorns.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IdentifibleMarks {
	
	@Id
	private Long id;
	private String side;
	private String location;
	private String mark;
	private String color;
	
	public IdentifibleMarks() {
		
	}
	public IdentifibleMarks(Long id, String side, String location, String mark, String color) {
		super();
		this.id = id;
		this.side = side;
		this.location = location;
		this.mark = mark;
		this.color = color;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "IdentifibleMarks [id=" + id + ", side=" + side + ", location=" + location + ", mark=" + mark
				+ ", color=" + color + "]";
	}
	
	
}
