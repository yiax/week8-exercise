package com.covid;

public class StateDailyCount{
	private int date;
	private Object hospitalized;
	private int negative;
	private int total;
	private String dateChecked;
	private int death;
	private Object pending;
	private String state;
	private int positive;

	public void setDate(int date){
		this.date = date;
	}

	public int getDate(){
		return date;
	}

	public void setHospitalized(Object hospitalized){
		this.hospitalized = hospitalized;
	}

	public Object getHospitalized(){
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

	public void setDateChecked(String dateChecked){
		this.dateChecked = dateChecked;
	}

	public String getDateChecked(){
		return dateChecked;
	}

	public void setDeath(int death){
		this.death = death;
	}

	public int getDeath(){
		return death;
	}

	public void setPending(Object pending){
		this.pending = pending;
	}

	public Object getPending(){
		return pending;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setPositive(int positive){
		this.positive = positive;
	}

	public int getPositive(){
		return positive;
	}

	@Override
 	public String toString(){
		return 
			"StateDailyCount{" + 
			"date = '" + date + '\'' + 
			",hospitalized = '" + hospitalized + '\'' + 
			",negative = '" + negative + '\'' + 
			",total = '" + total + '\'' + 
			",dateChecked = '" + dateChecked + '\'' + 
			",death = '" + death + '\'' + 
			",pending = '" + pending + '\'' + 
			",state = '" + state + '\'' + 
			",positive = '" + positive + '\'' + 
			"}";
		}
}
