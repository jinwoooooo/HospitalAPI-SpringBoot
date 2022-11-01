package com.springboot.hello.controller;

import com.springboot.hello.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post API";
    }

    @PostMapping(value = "/member1")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder(); // Builder Pattern
        postData.entrySet().forEach(map->sb.append(map.getKey()+":"+map.getValue()+"\n"));
        return sb.toString();
    }

    @PostMapping(value = "member2")
    public String postDto (@RequestBody User memberDto){
        return memberDto.toString();
    }

}
