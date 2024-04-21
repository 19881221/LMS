package domain;

import java.util.ArrayList;
import java.util.List;

import enums.GradeLevel;

public class LessonList {
	private List<Lesson> lessons;
	
	public LessonList() {
		this.lessons = new ArrayList<>();
	}

	public List<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	
	public void addLesson(int id, String lesson, GradeLevel level, Coach coach) {
		this.lessons.add(new Lesson(id, lesson, level, coach));
	}
	
	public Lesson getLessonById(int id) {
		for(Lesson lesson : lessons) {
			if(lesson.getId() == id) {
				return lesson;
			}
		}
		return null;
	}
	
	public void printLessonList() {
		System.out.println("========================= Lessons ===========================");
		for(Lesson lesson : lessons) {
			System.out.println(lesson.toString());
		}
	}
}
