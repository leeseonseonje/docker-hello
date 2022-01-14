package dockertest.dockerhello.controller;

import dockertest.dockerhello.domain.Member;
import dockertest.dockerhello.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @PostMapping("/member")
    public Member join(@RequestBody Member member) {
        log.info("username={}", member.getUsername());
        log.info("age={}", member.getAge());
        return memberService.join(member);
    }

    @GetMapping("/member/{memberId}")
    public Member findById(@PathVariable Long memberId) {
        return memberService.findById(memberId);
    }

    @Cacheable(value = "members")
    @GetMapping("/members")
    public List<Member> findAll() {
        log.info("call method findAll");
        return memberService.findAll();
    }
}
