package com.Voting.votingapp.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.ArrayList;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Poll {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String question;

  @ElementCollection
  private List<OptionVote> options = new ArrayList<>();

//  @ElementCollection
//  private List<Long> votes = new ArrayList<>();

  public List<OptionVote> getOptions() {
    return options;
  }

  public void setOptions(List<OptionVote> options) {
    this.options = options;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


//  public List<Long> getVotes() {
//    return votes;
//  }
//
//  public void setVotes(List<Long> votes) {
//    this.votes = votes;
//  }
}
