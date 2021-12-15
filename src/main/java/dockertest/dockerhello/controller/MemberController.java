package dockertest.dockerhello.controller;

import dockertest.dockerhello.domain.Member;
import dockertest.dockerhello.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member")
    public Member join(Member member) {
        return memberService.join(member);
    }

    @GetMapping("/member/{memberId}")
    public Member findById(@PathVariable Long memberId) {
        return memberService.findById(memberId);
    }

    @GetMapping("/members")
    public List<Member> findAll() {
        return memberService.findAll();
    }
}
