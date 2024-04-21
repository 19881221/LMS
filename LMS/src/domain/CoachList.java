package domain;

import java.util.ArrayList;
import java.util.List;

public class CoachList {
	private List<Coach> coaches;
	
	public CoachList() {
		this.coaches = new ArrayList<>();
	}

	public List<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}
	
	public void addCoach(int id, String name) {
		this.coaches.add(new Coach(id, name));
	}
	
	public Coach getCoachById(int id) {
		for(Coach coach : coaches) {
			if(coach.getId() == id) {
				return coach;
			}
		}
		return null;
	}
	
	public void printCoachList() {
		for(Coach coach : coaches) {
			System.out.println(coach.toString());
		}
	}
}
