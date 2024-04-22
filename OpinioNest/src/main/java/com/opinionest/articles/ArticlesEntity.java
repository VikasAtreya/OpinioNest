package com.opinionest.articles;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import com.opinionest.users.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name= "User")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class ArticlesEntity {
	
	@Id
	@Column(nullable=false)
	private long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false,unique = true)
	private String slug;
	
	@Column(nullable = false)
	private String subtitle;
	
	@Column(nullable = false)
	private String body;
	
	@CreatedDate
	@Column(nullable = false)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "autherId", nullable =false)
	private UserEntity userentity;
	
}
