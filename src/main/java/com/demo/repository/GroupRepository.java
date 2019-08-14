package com.demo.repository;

import com.demo.model.TGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yuan
 */
@Repository
public interface GroupRepository extends JpaRepository<TGroup,Long> {
}
