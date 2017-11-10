package com.tractiondemo.app.soccerlive.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.tractiondemo.app.soccerlive.model.Fixtures;
import com.tractiondemo.app.soccerlive.model.Team;

public class Application {
	
	public static final String SOCCER_LEAGUE_SERVICE_URI = "http://api.football-data.org/v1/competitions/438/leagueTable";
	public static final String TEAM_SERVICE_URI = "http://api.football-data.org/v1/teams/";

	
	@SuppressWarnings("unchecked")
	public List<Team> getLeagueTable(){
		List<Team> teams= new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		teams = restTemplate.getForObject(SOCCER_LEAGUE_SERVICE_URI, List.class);
		return teams;
		
	}
	
	public Team getTeam(int teamId){
		Team team = new Team();
		RestTemplate restTemplate = new RestTemplate();
		team = restTemplate.getForObject(TEAM_SERVICE_URI+String.valueOf(teamId), Team.class);
		return team;
	}
	
	public Fixtures getFixtures(int teamId){
		Fixtures fixtures = new Fixtures();
		RestTemplate restTemplate = new RestTemplate();
		fixtures = restTemplate.getForObject(TEAM_SERVICE_URI+String.valueOf(teamId)+"/fixtures", Fixtures.class);
		return fixtures;
	}

}
