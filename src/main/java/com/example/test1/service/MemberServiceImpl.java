package com.example.test1.service;

import com.example.test1.controller.dto.JoinRequestDto;
import com.example.test1.repository.MemberRepository;
import com.example.test1.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public String join(JoinRequestDto dto) {
        Member member = Member.builder()
                .id(dto.getId())
                .name(dto.getName())
                .phoneNumber(dto.getPhoneNumber())
                .build();

        memberRepository.save(member);
        return "success";
    }
}
