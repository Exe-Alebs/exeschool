package com.exe.exeschool.common;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseEntityRepository<T extends EntityData> extends
                CrudRepository<T, Long>,
                QuerydslPredicateExecutor<T> {

}