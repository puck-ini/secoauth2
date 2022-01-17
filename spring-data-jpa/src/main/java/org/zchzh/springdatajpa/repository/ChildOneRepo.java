package org.zchzh.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zchzh.springdatajpa.entity.inherit.ChildOne;

/**
 * @author zengchzh
 * @date 2022/1/13
 */
public interface ChildOneRepo extends JpaRepository<ChildOne, Long> {
}
