package com.example.laweasy.repository;

import com.example.laweasy.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findMemberByEmail(String email);
    Member findMemberById(Long memberId);
}
