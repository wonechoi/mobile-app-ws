package com.appsdeveloperblog.app.ws.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.appsdeveloperblog.app.ws.io.entity.UserEntity;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> { //CrudRepository<UserEntity, Long> {
	// no need to create insert, update, delete ..
	// need to only customized method.
	
	// find: we have to use it to select the record we use find
	// find + By + property
	UserEntity findByEmail(String email);
	UserEntity findByUserId(String userId);
}
