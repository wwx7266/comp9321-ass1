package com.mkyong;

import org.springframework.context.annotation.Bean;


public class SearchParam {
	private String agency;
	private String headline;
	private String date;
	private String city;
	private String content;
	
	@Override
	public String toString() {
		return "search_param [agency=" + agency + ", headline=" + headline + ", date=" + date + ", city=" + city
				+ ", content=" + content + "]";
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
