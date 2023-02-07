package com.example.test1.controller;

import com.example.test1.controller.dto.JoinRequestDto;
import com.example.test1.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @PostMapping("/join")
    public String join(@RequestBody JoinRequestDto joinRequest) {
        String result = memberService.join(joinRequest);
        if ("success".equalsIgnoreCase(result)) {
            return "success";
        } else {
            return "fail";
        }
    }
}
