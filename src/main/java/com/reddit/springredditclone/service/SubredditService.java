package com.reddit.springredditclone.service;

import com.reddit.springredditclone.dto.SubredditDto;
import com.reddit.springredditclone.model.Subreddit;
import com.reddit.springredditclone.repository.SubredditRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class SubredditService {

    private final SubredditRepository subredditRepository;


    public SubredditDto save(SubredditDto subredditDto) {
        Subreddit save = subredditRepository.save(mapSubredditDto(subredditDto));
        subredditDto.setId(save.getId());
        return subredditDto;
    }

    private Subreddit mapSubredditDto(SubredditDto subredditDto) {
        return Subreddit.builder().name(subredditDto.getName()).description(subredditDto.getDescription()).build();
    }
}
