package org.hawknetwork.hawkrota.domain;

import java.awt.Color;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hawknetwork.hawkrota.domain.base.BaseDomainClass;

public class Organisation extends BaseDomainClass implements Serializable {
	private static final long serialVersionUID = -1945590206856714150L;
	private String appTitle;
	private Color headerColour;
	private Color oddRowColour;
	private Color evenRowColour;
	private List<HeadedInfo> headedInfoList;
	private String teamDayTitle;
	private String teamDayDescription;
	private List<Date> teamDays;
	private Color importantTaskColour;
	
	public String getAppTitle() {
		return appTitle;
	}
	public void setAppTitle(String appTitle) {
		this.appTitle = appTitle;
	}
	public Color getHeaderColour() {
		return headerColour;
	}
	public void setHeaderColour(Color headerColour) {
		this.headerColour = headerColour;
	}
	public Color getOddRowColour() {
		return oddRowColour;
	}
	public void setOddRowColour(Color oddRowColour) {
		this.oddRowColour = oddRowColour;
	}
	public Color getEvenRowColour() {
		return evenRowColour;
	}
	public void setEvenRowColour(Color evenRowColour) {
		this.evenRowColour = evenRowColour;
	}
	public List<HeadedInfo> getHeadedInfoList() {
		return headedInfoList;
	}
	public void setHeadedInfoList(List<HeadedInfo> headedInfo) {
		this.headedInfoList = headedInfo;
	}
	public String getTeamDayTitle() {
		return teamDayTitle;
	}
	public void setTeamDayTitle(String teamDayTitle) {
		this.teamDayTitle = teamDayTitle;
	}
	public String getTeamDayDescription() {
		return teamDayDescription;
	}
	public void setTeamDayDescription(String teamDayDescription) {
		this.teamDayDescription = teamDayDescription;
	}
	public List<Date> getTeamDays() {
		return teamDays;
	}
	public void setTeamDays(List<Date> teamDays) {
		this.teamDays = teamDays;
	}
	public Color getImportantTaskColour() {
		return importantTaskColour;
	}
	public void setImportantTaskColour(Color importantTaskColour) {
		this.importantTaskColour = importantTaskColour;
	}
}
