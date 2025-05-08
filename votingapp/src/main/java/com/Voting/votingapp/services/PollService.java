package com.Voting.votingapp.services;

import com.Voting.votingapp.model.Poll;
import com.Voting.votingapp.repositories.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService {
  private static PollRepository pollRepository;

  public PollService(PollRepository pollRepository) {
    this.pollRepository = pollRepository;
  }

  public static Poll createPoll(Poll poll){
    return pollRepository.save(poll);
  }

}
