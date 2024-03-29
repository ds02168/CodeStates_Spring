package com.codestates.section4week1.repository;

import com.codestates.section4week1.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface MemberRepository extends JpaRepository<Member,Long> {
    public Member findByUsername(String username);
}
