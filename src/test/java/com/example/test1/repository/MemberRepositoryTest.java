package com.example.test1.repository;

import com.example.test1.repository.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void crudTest() {
        Member member = Member.builder()
                .id("flature")
                .name("플래쳐")
                .phoneNumber("010")
                .build();

        memberRepository.save(member);

        Member findMember = memberRepository.findById(1L).get();
        
    }
}