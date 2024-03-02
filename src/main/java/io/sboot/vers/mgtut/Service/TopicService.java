package io.sboot.vers.mgtut.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sboot.vers.mgtut.Model.Topic;
import io.sboot.vers.mgtut.Repository.TopicRepository;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    /*
     * Topic repository is injected when spring creates and instance of Topic Service
     *  which is made possible because of the annotation Autowired
     * 
     */

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        //topicRepository updates the entity if it already exists 
        //if it does not exist, new will be created, so "save" will do the trick 
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
