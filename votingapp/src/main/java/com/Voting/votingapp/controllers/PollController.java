package com.Voting.votingapp.controllers;

import com.Voting.votingapp.model.Poll;
import com.Voting.votingapp.services.PollService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polls")
public class PollController {
  private PollService pollService;

  public PollController(PollService pollService) {
    this.pollService = pollService;
  }

  @PostMapping
  public Poll createPoll(@RequestBody Poll poll){
    return pollService.createPoll(poll);
  }

  @GetMapping
  public List<Poll> getAllPolls(){
    return pollService.gettAllPolls();
  }
}
