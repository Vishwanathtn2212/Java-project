package org.vishwanath.java_spring_application.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * TopicsController
 *
 * @author vishwanath
 *
 */
@RestController
@RequestMapping("/api/example")
public class TopicsController {

    @Autowired
    private TopicService topicService;

    @GetMapping("topics")
    private List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @GetMapping("topics/{id}")
    private Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping(path = "topics", consumes="application/json", produces="application/json")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @PutMapping(path = "topics/{id}", consumes="application/json", produces="application/json")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.updateTopic(id,topic);
    }

    @DeleteMapping("topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
