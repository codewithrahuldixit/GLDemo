package com.example.microservice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "mentor-service")
public class MentorController {


	@GetMapping("/mentor")
	public Mentor getMentor() {
		return new Mentor(101, "rahul", 2,
				Arrays.asList(new Course(101, "Java", "rahul"), new Course(102, "Spring", "rahul")));
	}

	@GetMapping("/{mentor}")
	public Mentor getMentorDetails(@PathVariable String mentor) {

		HashMap<String, String> uriVariables = new HashMap<>();
		uriVariables.put("mentor",mentor);
		
		ResponseEntity<List<Course>> courseResponse =
		        new RestTemplate().exchange("http://localhost:8080/course-service/courses/{mentor}",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Course>>() {
		            },uriVariables);
		List<Course> courses = courseResponse.getBody();

		/*ResponseEntity <Course> responseEntity = new RestTemplate()
				.getForEntity("http://localhost:8080/course-service/courses/{mentor}"
						, Course.class, uriVariables);

		List<Course> courses = (List<Course>) responseEntity.getBody();
*/
		return new Mentor(101, mentor, courses.size(), courses);

	}

}
