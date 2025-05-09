package com.Voting.votingapp.services;

import com.Voting.votingapp.model.Poll;
import com.Voting.votingapp.repositories.PollRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PollService {
  private static PollRepository pollRepository;

  public PollService(PollRepository pollRepository) {
    this.pollRepository = pollRepository;
  }

  public Poll createPoll(Poll poll){
    Poll record = pollRepository.save(poll);
    return record;
  }

  public List<Poll> gettAllPolls(){
    return pollRepository.findAll();
  }

}
