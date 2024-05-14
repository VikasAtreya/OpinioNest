package com.opinionest.users;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Users")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsersEntity {
	
	@Id
	@Column(nullable= false)
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	long id;
	
	@Column(nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String emailId;
	
	@Column(nullable=true)
	private String bio;
	
	@Column(nullable=true)
	private String image;
	

}
