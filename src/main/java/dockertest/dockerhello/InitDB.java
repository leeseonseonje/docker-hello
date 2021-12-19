package dockertest.dockerhello;

import dockertest.dockerhello.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Component
@RequiredArgsConstructor
public class InitDB {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.initData();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void initData() {
            for (int i = 0; i < 1000; i++) {
                Member member = Member.builder()
                        .username("member" + i)
                        .age(i)
                        .build();
                em.persist(member);
            }
        }
    }

}
