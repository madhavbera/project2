package Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="newcourses")
public class NewC {
	@Id
	private int id;
	private String cour_name;
	@ManyToMany
	@JoinTable(
			name="news_newc",
			joinColumns = @JoinColumn(name="course_id"),
			inverseJoinColumns = @JoinColumn(name="news_id")
			)
	private List<NewS> news;
	public NewC(int id, String cour_name, List<NewS> news) {
		super();
		this.id = id;
		this.cour_name = cour_name;
		this.news = news;
	}
	public NewC() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCour_name() {
		return cour_name;
	}
	public void setCour_name(String cour_name) {
		this.cour_name = cour_name;
	}
	public List<NewS> getNews() {
		return news;
	}
	public void setNews(List<NewS> news) {
		this.news = news;
	}
	

}
