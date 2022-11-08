package hello.hellospring;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;


import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class JdbcTemplateMemberRepository implements MemberRepository {
    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public JdbcTemplateMemberRepository(DataSource dataSource) {
//        jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//
//    @Override
//    public Member save(Member member) {
//        return null;
//    }
//
//    @Override
//    public Optional<Member> findById(Long id) {
//        return jdbcTemplate.query("select * from member where id = ?", );
//    }
//
//    @Override
//    public Optional<Member> findByName(String name) {
//        return Optional.empty();
//    }
//
//    @Override
//    public List<Member> findAll() {
//        return null;
//    }
//
//    private
}
