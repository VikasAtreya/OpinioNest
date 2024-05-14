package com.opinionest.users;

import org.springframework.stereotype.Service;

@Service
public class UsersService {
	
	private final UsersRepository usersRepository;

	public UsersService(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	public UsersEntity createUsers(String name, String email) {
		 
		 var newUsers = UsersEntity.builder().
				userName(userName).
				email(email).
				build();
		return UsersRepository.save(newUser);
		
	}
	
	public UsersEntity getUser(String username) {
		return usersRepository.findByUsername(username);
	}

}
