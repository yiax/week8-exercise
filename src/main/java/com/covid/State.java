package com.covid;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class State{

	@JsonProperty("checkTimeEt")
	private String checkTimeEt;

	@JsonProperty("dateChecked")
	private String dateChecked;

	@JsonProperty("death")
	private int death;

	@JsonProperty("negativeRegularScore")
	private int negativeRegularScore;

	@JsonProperty("pending")
	private Object pending;

	@JsonProperty("lastUpdateEt")
	private String lastUpdateEt;

	@JsonProperty("dateModified")
	private String dateModified;

	@JsonProperty("positive")
	private int positive;

	@JsonProperty("negativeScore")
	private int negativeScore;

	@JsonProperty("hospitalized")
	private Object hospitalized;

	@JsonProperty("score")
	private int score;

	@JsonProperty("negative")
	private int negative;

	@JsonProperty("total")
	private int total;

	@JsonProperty("commercialScore")
	private int commercialScore;

	@JsonProperty("positiveScore")
	private int positiveScore;

	@JsonProperty("grade")
	private String grade;

	@JsonProperty("state")
	private String state;

	public void setCheckTimeEt(String checkTimeEt){
		this.checkTimeEt = checkTimeEt;
	}

	public String getCheckTimeEt(){
		return checkTimeEt;
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

	public void setNegativeRegularScore(int negativeRegularScore){
		this.negativeRegularScore = negativeRegularScore;
	}

	public int getNegativeRegularScore(){
		return negativeRegularScore;
	}

	public void setPending(Object pending){
		this.pending = pending;
	}

	public Object getPending(){
		return pending;
	}

	public void setLastUpdateEt(String lastUpdateEt){
		this.lastUpdateEt = lastUpdateEt;
	}

	public String getLastUpdateEt(){
		return lastUpdateEt;
	}

	public void setDateModified(String dateModified){
		this.dateModified = dateModified;
	}

	public String getDateModified(){
		return dateModified;
	}

	public void setPositive(int positive){
		this.positive = positive;
	}

	public int getPositive(){
		return positive;
	}

	public void setNegativeScore(int negativeScore){
		this.negativeScore = negativeScore;
	}

	public int getNegativeScore(){
		return negativeScore;
	}

	public void setHospitalized(Object hospitalized){
		this.hospitalized = hospitalized;
	}

	public Object getHospitalized(){
		return hospitalized;
	}

	public void setScore(int score){
		this.score = score;
	}

	public int getScore(){
		return score;
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

	public void setCommercialScore(int commercialScore){
		this.commercialScore = commercialScore;
	}

	public int getCommercialScore(){
		return commercialScore;
	}

	public void setPositiveScore(int positiveScore){
		this.positiveScore = positiveScore;
	}

	public int getPositiveScore(){
		return positiveScore;
	}

	public void setGrade(String grade){
		this.grade = grade;
	}

	public String getGrade(){
		return grade;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	@Override
 	public String toString(){
		return 
			"State{" + 
			"checkTimeEt = '" + checkTimeEt + '\'' + 
			",dateChecked = '" + dateChecked + '\'' + 
			",death = '" + death + '\'' + 
			",negativeRegularScore = '" + negativeRegularScore + '\'' + 
			",pending = '" + pending + '\'' + 
			",lastUpdateEt = '" + lastUpdateEt + '\'' + 
			",dateModified = '" + dateModified + '\'' + 
			",positive = '" + positive + '\'' + 
			",negativeScore = '" + negativeScore + '\'' + 
			",hospitalized = '" + hospitalized + '\'' + 
			",score = '" + score + '\'' + 
			",negative = '" + negative + '\'' + 
			",total = '" + total + '\'' + 
			",commercialScore = '" + commercialScore + '\'' + 
			",positiveScore = '" + positiveScore + '\'' + 
			",grade = '" + grade + '\'' + 
			",state = '" + state + '\'' + 
			"}";
		}
}