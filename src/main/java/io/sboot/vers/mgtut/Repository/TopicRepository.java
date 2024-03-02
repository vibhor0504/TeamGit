package io.sboot.vers.mgtut.Repository;

import org.springframework.data.repository.CrudRepository;

import io.sboot.vers.mgtut.Model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

    //Spring Data JPA is aware of the general crcud operations hence they have 
    //made a class for this implementation, therefore we are extending CrudRepository

    

}
