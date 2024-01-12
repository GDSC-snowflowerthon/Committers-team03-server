package com.committers.snowflowerthon.committersserver.domain.follow.controller;

import com.committers.snowflowerthon.committersserver.common.response.ApiResponse;
import com.committers.snowflowerthon.committersserver.domain.follow.dto.FollowPatchedDto;
import com.committers.snowflowerthon.committersserver.domain.follow.service.FollowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class FollowController {

    private final FollowService followService;

    @PatchMapping("/buddy/update")
    public ResponseEntity<?> patchFollow(@RequestParam String nickname, @RequestParam Boolean isFollowed) {
        FollowPatchedDto followPatchedDto = followService.changeFollowStatus(nickname, isFollowed);
        return ResponseEntity.ok().body(ApiResponse.success(followPatchedDto));
    }
}