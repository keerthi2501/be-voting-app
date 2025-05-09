package com.Voting.votingapp.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class OptionVote {
  private String VoteOption;

  public Long getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(Long voteCount) {
    this.voteCount = voteCount;
  }

  public String getVoteOption() {
    return VoteOption;
  }

  public void setVoteOption(String voteOption) {
    VoteOption = voteOption;
  }

  private Long voteCount = 0L;
}
