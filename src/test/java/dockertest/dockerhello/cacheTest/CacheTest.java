//package dockertest.dockerhello.cacheTest;
//
//import dockertest.dockerhello.domain.Member;
//import dockertest.dockerhello.service.MemberService;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class CacheTest {
//
//    @Autowired
//    MemberService memberService;
//
//    @Test
//    public void cacheTest() {
//        List<Member> result = memberService.findAll();
//        Assertions.assertThat(result.size()).isEqualTo(1000);
//    }
//}