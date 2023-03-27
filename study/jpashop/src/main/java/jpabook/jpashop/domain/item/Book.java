package jpabook.jpashop.domain.item;

import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
 public class Book extends Item {
    private String author;
    private String isbn;
}
