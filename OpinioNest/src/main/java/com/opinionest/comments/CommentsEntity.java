package com.opinionest.comments;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import com.opinionest.articles.ArticlesEntity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name="Comments")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class CommentsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	@NonNull
	private String id; 
	
	@CreatedDate
	private Date date;
	
	@NonNull
	private String comment;
	
	@ManyToOne
	@JoinColumn(name="authorId")
	@NonNull
	private ArticlesEntity articleEntity;

}
