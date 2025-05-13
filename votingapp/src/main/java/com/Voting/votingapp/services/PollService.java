package com.Voting.votingapp.services;

import com.Voting.votingapp.model.OptionVote;
import com.Voting.votingapp.model.Poll;
import com.Voting.votingapp.repositories.PollRepository;
import java.util.List;
import java.util.Optional;
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

  public Optional<Poll> getPollById(Long id){
    return pollRepository.findById(id);
  }

  public void vote(Long pollId, int optionIndex){
    //Get Poll from DB
    Poll poll = pollRepository.findById(pollId).orElseThrow(()-> new RuntimeException("Poll not found"));

    //Get all Options
    List<OptionVote> options = poll.getOptions();

    //If index for vote is not valid, throw error
    if(optionIndex<0 || optionIndex >= options.size()){
      throw  new IllegalArgumentException("Invalid option index");
    }
      //Get Selected Option
      OptionVote selectedOption = options.get(optionIndex);

      //Increment vote for selected option
      selectedOption.setVoteCount(selectedOption.getVoteCount() + 1);

      //Save incremented option index
      pollRepository.save(poll);
    }

  }
