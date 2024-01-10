package com.committers.snowflowerthon.committersserver.domain.follow.entity;

import com.committers.snowflowerthon.committersserver.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FollowRepository extends JpaRepository<Follow, Long> {
    List<Follow> findAllByMember(Member member);
    Optional<Follow> findByBuddyId(Long id);
}
