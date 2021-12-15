package dockertest.dockerhello.service;

import dockertest.dockerhello.domain.Member;
import dockertest.dockerhello.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member join(Member member) {
        return memberRepository.save(member);
    }

    public Member findById(Long memberId) {
        return memberRepository.findById(memberId).orElseGet(Member::new);
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
