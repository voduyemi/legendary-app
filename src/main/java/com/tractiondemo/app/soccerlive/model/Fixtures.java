package com.tractiondemo.app.soccerlive.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fixtures {
	private String homeTeamName;
	private String awayTeamName;
	private String matchStatus;
	/**
	 * @return the homeTeamName
	 */
	public String getHomeTeamName() {
		return homeTeamName;
	}
	/**
	 * @param homeTeamName the homeTeamName to set
	 */
	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}
	/**
	 * @return the awayTeamName
	 */
	public String getAwayTeamName() {
		return awayTeamName;
	}
	/**
	 * @param awayTeamName the awayTeamName to set
	 */
	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}
	/**
	 * @return the matchStatus
	 */
	public String getMatchStatus() {
		return matchStatus;
	}
	/**
	 * @param matchStatus the matchStatus to set
	 */
	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}
}
