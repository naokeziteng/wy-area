package com.wenyu7980.area.repository;

import com.wenyu7980.area.entity.AreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wenyu
 */
@Repository
public interface AreaRepo extends JpaRepository<AreaEntity, Integer>, JpaSpecificationExecutor<AreaEntity> {
}
