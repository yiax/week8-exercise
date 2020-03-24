package com.covid;

import com.fasterxml.jackson.annotation.JsonProperty;

public class USDailyCount{

	@JsonProperty("date")
	private int date;

	@JsonProperty("hospitalized")
	private int hospitalized;

	@JsonProperty("negative")
	private int negative;

	@JsonProperty("total")
	private int total;

	@JsonProperty("death")
	private int death;

	@JsonProperty("pending")
	private int pending;

	@JsonProperty("positive")
	private int positive;

	@JsonProperty("posNeg")
	private int posNeg;

	@JsonProperty("states")
	private int states;

	public void setDate(int date){
		this.date = date;
	}

	public int getDate(){
		return date;
	}

	public void setHospitalized(int hospitalized){
		this.hospitalized = hospitalized;
	}

	public int getHospitalized(){
		return hospitalized;
	}

	public void setNegative(int negative){
		this.negative = negative;
	}

	public int getNegative(){
		return negative;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setDeath(int death){
		this.death = death;
	}

	public int getDeath(){
		return death;
	}

	public void setPending(int pending){
		this.pending = pending;
	}

	public int getPending(){
		return pending;
	}

	public void setPositive(int positive){
		this.positive = positive;
	}

	public int getPositive(){
		return positive;
	}

	public void setPosNeg(int posNeg){
		this.posNeg = posNeg;
	}

	public int getPosNeg(){
		return posNeg;
	}

	public void setStates(int states){
		this.states = states;
	}

	public int getStates(){
		return states;
	}

	@Override
 	public String toString(){
		return 
			"USDailyCount{" + 
			"date = '" + date + '\'' + 
			",hospitalized = '" + hospitalized + '\'' + 
			",negative = '" + negative + '\'' + 
			",total = '" + total + '\'' + 
			",death = '" + death + '\'' + 
			",pending = '" + pending + '\'' + 
			",positive = '" + positive + '\'' + 
			",posNeg = '" + posNeg + '\'' + 
			",states = '" + states + '\'' + 
			"}";
		}
}