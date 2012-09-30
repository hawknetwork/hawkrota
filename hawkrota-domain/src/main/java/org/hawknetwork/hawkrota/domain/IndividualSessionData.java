package org.hawknetwork.hawkrota.domain;

import java.io.Serializable;

// can be either non-finalised scratch (null rota), non-finalised refactor (old rota),
// or finalised (real rota)
// TODO May no longer be required
public class IndividualSessionData implements Serializable {
	private static final long serialVersionUID = 2538677060054716125L;
	private BandRota bandRota;
	private CoveredEvents coveredEvents;
	private HolidayCalendar holidayCalendar;
	private String organisationKey;
	private Rota rota;
	public BandRota getBandRota() {
		return bandRota;
	}
	public void setBandRota(BandRota bandRota) {
		this.bandRota = bandRota;
	}
	public CoveredEvents getCoveredEvents() {
		return coveredEvents;
	}
	public void setCoveredEvents(CoveredEvents coveredEvents) {
		this.coveredEvents = coveredEvents;
	}
	public HolidayCalendar getHolidayCalendar() {
		return holidayCalendar;
	}
	public void setHolidayCalendar(HolidayCalendar holidayCalendar) {
		this.holidayCalendar = holidayCalendar;
	}
	public String getOrganisationKey() {
		return organisationKey;
	}
	public void setOrganisationKey(String organisationKey) {
		this.organisationKey = organisationKey;
	}
	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}
}
