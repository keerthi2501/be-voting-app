package com.Voting.votingapp.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class OptionVote {
  private String optionText;
  private Long voteCount = 0L;

  //Now the getters and setts are not required as the lambok is properly configured now.


//
//  public Long getVoteCount() {
//    return voteCount;
//  }
//
//  public void setVoteCount(Long voteCount) {
//    this.voteCount = voteCount;
//  }
//
//  public String getVoteOption() {
//    return VoteOption;
//  }
//
//  public void setVoteOption(String voteOption) {
//    VoteOption = voteOption;
//  }

}
