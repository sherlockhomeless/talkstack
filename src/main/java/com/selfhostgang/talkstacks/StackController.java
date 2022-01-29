package com.selfhostgang.talkstacks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StackController {

    @GetMapping("/stack")
    public List<TalkStack> getAllStacks(){
        return Arrays.asList(new TalkStack(1, "stack description", "author"));
    }

}
