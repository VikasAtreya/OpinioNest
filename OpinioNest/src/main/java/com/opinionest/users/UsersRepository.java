package com.opinionest.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Long>{
	
	UsersEntity findByUsername(String username);

}
