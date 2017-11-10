package com.tractiondemo.app.soccerlive.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
	private String teamName;
	private String code;
	private String shortName;
	private Double marketValue;
	private int playedGames;
	private int wins;
	private int draws;
	private int losses;
	private int goals;
	private int goalsAgainst;
	private int goalDiff;
	private int points;
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the playedGames
	 */
	public int getPlayedGames() {
		return playedGames;
	}
	/**
	 * @param playedGames the playedGames to set
	 */
	public void setPlayedGames(int playedGames) {
		this.playedGames = playedGames;
	}
	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}
	/**
	 * @param wins the wins to set
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}
	/**
	 * @return the draws
	 */
	public int getDraws() {
		return draws;
	}
	/**
	 * @param draws the draws to set
	 */
	public void setDraws(int draws) {
		this.draws = draws;
	}
	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}
	/**
	 * @param losses the losses to set
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}
	/**
	 * @return the goals
	 */
	public int getGoals() {
		return goals;
	}
	/**
	 * @param goals the goals to set
	 */
	public void setGoals(int goals) {
		this.goals = goals;
	}
	/**
	 * @return the goalsAgainst
	 */
	public int getGoalsAgainst() {
		return goalsAgainst;
	}
	/**
	 * @param goalsAgainst the goalsAgainst to set
	 */
	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}
	/**
	 * @return the goalDiff
	 */
	public int getGoalDiff() {
		return goalDiff;
	}
	/**
	 * @param goalDiff the goalDiff to set
	 */
	public void setGoalDiff(int goalDiff) {
		this.goalDiff = goalDiff;
	}
	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}
	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * @return the marketValue
	 */
	public Double getMarketValue() {
		return marketValue;
	}
	/**
	 * @param marketValue the marketValue to set
	 */
	public void setMarketValue(Double marketValue) {
		this.marketValue = marketValue;
	}
}
