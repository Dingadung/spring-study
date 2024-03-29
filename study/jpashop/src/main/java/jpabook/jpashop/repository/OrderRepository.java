package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public Order findOne(Long id) {
       return em.find(Order.class, id);
    }

    public List<Order> findAll(OrderSearch orderSearch) {
        String jpql = "select o from Order o join o.member m";
        return em.createQuery(jpql)
//                " where o.status =: status" +
//                " and m.name like :name", Order.class)
//                .setParameter("status", orderSeach.getOrderStatus())
//                .setParameter("name", orderSeach.getMemberName())
                .setMaxResults(1000) // 최대 1000건
                .getResultList();
    }

    /**
     *
     * JPA Criteria
     */
//    public List<Order> findAllByCriteria(OrderSeach orderSeach) {
//
//    }
}
