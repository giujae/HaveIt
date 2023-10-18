package com.meta.game.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name = "MEMBER-SERVICE", url = "http://localhost:8011/member")
@FeignClient(name = "MEMBER-SERVICE", url = "http:///**/:8011/member")
public interface MemberServiceClient {
    @PostMapping("/get/nickName")
    String getNickname(@RequestParam Long memberId);
}
