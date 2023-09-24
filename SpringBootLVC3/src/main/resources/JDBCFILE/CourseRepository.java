package com.example.database.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	private String insert_query = 
			"""			
				insert into course(id,name,author) values (?,?,?);
			""";
	private String delete_query = 
			"""			
				delete from course where id = ?;
			""";

	private String select_By_Id = 
			"""			
				select * from course where id = ?;
			""";
	
	private String select_All = 
			"""			
				select * from course;
			""";
	
	
	public void save(Course course) {
		jdbcTemplate.update(insert_query,course.getId(),course.getName(),course.getAuthor());
	}
	
	public Course findById(int id) {
		return jdbcTemplate.queryForObject(select_By_Id, new BeanPropertyRowMapper<>(Course.class),id);
	}
	public void deleteById(int id) {
		 jdbcTemplate.update(delete_query,id);
	}
	public List<Course> findAll() {
		return jdbcTemplate.query(select_All, new BeanPropertyRowMapper(Course.class));
	}
}
