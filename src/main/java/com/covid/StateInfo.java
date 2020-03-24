package com.covid;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateInfo{

	@JsonProperty("covid19Site")
	private String covid19Site;

	@JsonProperty("twitter")
	private String twitter;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("covid19SiteSecondary")
	private String covid19SiteSecondary;

	@JsonProperty("pui")
	private String pui;

	@JsonProperty("covid19SiteOld")
	private String covid19SiteOld;

	@JsonProperty("name")
	private String name;

	@JsonProperty("pum")
	private boolean pum;

	@JsonProperty("state")
	private String state;

	public void setCovid19Site(String covid19Site){
		this.covid19Site = covid19Site;
	}

	public String getCovid19Site(){
		return covid19Site;
	}

	public void setTwitter(String twitter){
		this.twitter = twitter;
	}

	public String getTwitter(){
		return twitter;
	}

	public void setNotes(String notes){
		this.notes = notes;
	}

	public String getNotes(){
		return notes;
	}

	public void setCovid19SiteSecondary(String covid19SiteSecondary){
		this.covid19SiteSecondary = covid19SiteSecondary;
	}

	public String getCovid19SiteSecondary(){
		return covid19SiteSecondary;
	}

	public void setPui(String pui){
		this.pui = pui;
	}

	public String getPui(){
		return pui;
	}

	public void setCovid19SiteOld(String covid19SiteOld){
		this.covid19SiteOld = covid19SiteOld;
	}

	public String getCovid19SiteOld(){
		return covid19SiteOld;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPum(boolean pum){
		this.pum = pum;
	}

	public boolean isPum(){
		return pum;
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
			"StateInfo{" + 
			"covid19Site = '" + covid19Site + '\'' + 
			",twitter = '" + twitter + '\'' + 
			",notes = '" + notes + '\'' + 
			",covid19SiteSecondary = '" + covid19SiteSecondary + '\'' + 
			",pui = '" + pui + '\'' + 
			",covid19SiteOld = '" + covid19SiteOld + '\'' + 
			",name = '" + name + '\'' + 
			",pum = '" + pum + '\'' + 
			",state = '" + state + '\'' + 
			"}";
		}
}