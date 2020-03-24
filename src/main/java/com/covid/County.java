package com.covid;

import com.fasterxml.jackson.annotation.JsonProperty;

public class County{

	@JsonProperty("covid19Site")
	private String covid19Site;

	@JsonProperty("twitter")
	private Object twitter;

	@JsonProperty("dataSite")
	private Object dataSite;

	@JsonProperty("pui")
	private String pui;

	@JsonProperty("county")
	private String county;

	@JsonProperty("state")
	private String state;

	@JsonProperty("mainSite")
	private Object mainSite;

	public void setCovid19Site(String covid19Site){
		this.covid19Site = covid19Site;
	}

	public String getCovid19Site(){
		return covid19Site;
	}

	public void setTwitter(Object twitter){
		this.twitter = twitter;
	}

	public Object getTwitter(){
		return twitter;
	}

	public void setDataSite(Object dataSite){
		this.dataSite = dataSite;
	}

	public Object getDataSite(){
		return dataSite;
	}

	public void setPui(String pui){
		this.pui = pui;
	}

	public String getPui(){
		return pui;
	}

	public void setCounty(String county){
		this.county = county;
	}

	public String getCounty(){
		return county;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setMainSite(Object mainSite){
		this.mainSite = mainSite;
	}

	public Object getMainSite(){
		return mainSite;
	}

	@Override
 	public String toString(){
		return 
			"County{" + 
			"covid19Site = '" + covid19Site + '\'' + 
			",twitter = '" + twitter + '\'' + 
			",dataSite = '" + dataSite + '\'' + 
			",pui = '" + pui + '\'' + 
			",county = '" + county + '\'' + 
			",state = '" + state + '\'' + 
			",mainSite = '" + mainSite + '\'' + 
			"}";
		}
}