package com.ally.unicorns.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;





@Entity
public class Unicorns {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long unicornId;
	private String name;
	private String hairColor;
	private Long hornLength;
	private String eyeColor;
	private Long height;
	private String heightUnit;
	private Long weight;
	private String weightUnit;

	@OneToMany(targetEntity = IdentifibleMarks.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "uc_fk", referencedColumnName = "unicornId")
	private List<IdentifibleMarks> identifibleMarks;

	public Unicorns() {
	}

	public Unicorns(Long unicornId, String name, String hairColor, Long hornLength, String eyeColor, Long height,
			String heightUnit, Long weight, String weightUnit, List<IdentifibleMarks> identifibleMarks) {
		super();
		this.unicornId = unicornId;
		this.name = name;
		this.hairColor = hairColor;
		this.hornLength = hornLength;
		this.eyeColor = eyeColor;
		this.height = height;
		this.heightUnit = heightUnit;
		this.weight = weight;
		this.weightUnit = weightUnit;
		this.identifibleMarks = identifibleMarks;
	}

	public Long getUnicornId() {
		return unicornId;
	}

	public void setUnicornId(Long unicornId) {
		this.unicornId = unicornId;
	}

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

	@Override
	public String toString() {
		return "Unicorns [unicornId=" + unicornId + ", name=" + name + ", hairColor=" + hairColor + ", hornLength="
				+ hornLength + ", eyeColor=" + eyeColor + ", height=" + height + ", heightUnit=" + heightUnit
				+ ", weight=" + weight + ", weightUnit=" + weightUnit + ", identifibleMarks=" + identifibleMarks + "]";
	}

}
