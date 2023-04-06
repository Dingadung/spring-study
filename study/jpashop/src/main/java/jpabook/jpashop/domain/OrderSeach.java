package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Getter @Setter
public class OrderSeach {
    private String memberName; // 회원이름
    private OrderStatus orderStatus; // 주문상태 [ORDER, CANCEL]

}
