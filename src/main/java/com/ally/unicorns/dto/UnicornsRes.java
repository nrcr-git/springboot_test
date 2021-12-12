package com.ally.unicorns.dto;

import java.util.List;

import com.ally.unicorns.entity.IdentifibleMarks;


public class UnicornsRes {
	
	private String name;
	private String hairColor;
	private Long hornLength;
	private String eyeColor;
	private Long height;
	private String heightUnit;
	private Long weight;
	private String weightUnit;
	private List<IdentifibleMarks> identifibleMarks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public Long getHornLength() {
		return hornLength;
	}
	public void setHornLength(Long hornLength) {
		this.hornLength = hornLength;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public Long getHeight() {
		return height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}
	public String getHeightUnit() {
		return heightUnit;
	}
	public void setHeightUnit(String heightUnit) {
		this.heightUnit = heightUnit;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public String getWeightUnit() {
		return weightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}
	public List<IdentifibleMarks> getIdentifibleMarks() {
		return identifibleMarks;
	}
	public void setIdentifibleMarks(List<IdentifibleMarks> identifibleMarks) {
		this.identifibleMarks = identifibleMarks;
	}
	
	

}
