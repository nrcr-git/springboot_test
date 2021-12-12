package com.ally.unicorns.dto;

import java.util.List;

import com.ally.unicorns.entity.IdentifibleMarks;
import com.ally.unicorns.entity.Unicorns;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UnicornsReq {
	
	
	private Unicorns unicorns;

	public Unicorns getUnicorns() {
		return unicorns;
	}

	public void setUnicorns(Unicorns unicorns) {
		this.unicorns = unicorns;
	}

	public UnicornsReq(Unicorns unicorns) {
		super();
		this.unicorns = unicorns;
	}

	public UnicornsReq()
	{
		
	}
	@Override
	public String toString() {
		return "UnicornsReq [unicorns=" + unicorns + "]";
	}
	
	
	
	

}
