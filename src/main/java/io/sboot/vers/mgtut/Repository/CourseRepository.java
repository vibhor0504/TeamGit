package io.sboot.vers.mgtut.Repository;
import java.util.*;
import org.springframework.data.repository.CrudRepository;

import io.sboot.vers.mgtut.Model.Course;

public interface CourseRepository extends CrudRepository<Course, String>{

    /*
    * CourseRepository has only basic CRUD mapping
    * Lets say I have to map courses to topics, 
    * "topic java wil have many courses"
    * for this we need to provide method declaration in the repository class
    */
    
    //public List<Course> getCoursesByTopic(String topicId); 
    //if we provide a method like this we will have to write its implementation as well
    
    //In the way described below we can add custom methods without making any implementations
    //We need to take care about the naming of the method, if its filtering we need in the format "findBy"
    public List<Course> findByName(String name);
    public List<Course> findByDescription(String desc);

    //Since Topic is a separate class in itself and we just need to filter by its id 
    //what we did here is "findBy" "className - topic" "filter - Id"
    public List<Course> findByTopicId(String topicId);
}
