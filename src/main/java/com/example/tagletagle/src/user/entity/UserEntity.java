package com.example.tagletagle.src.user.entity;

import java.time.LocalDate;

import org.hibernate.annotations.DynamicInsert;

import com.example.tagletagle.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
@NoArgsConstructor
@DynamicInsert
public class UserEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	//사용자의 고유 아이디: 소셜 이름 + _ + 고유 토큰 ex)google_19201999
	@Column(nullable = false)
	private String username;

	//기본 정보 입력 시 적는 닉네임
	@Column(nullable = true)
	private String nickname;

	//기본 정보 입력 시 적는 자기소개
	@Column(nullable = true)
	private String description;

	//기본 정보 입력 시 적는 생년월일
	@Column(name = "birth_date", nullable = true)
	private LocalDate birthDate;

	//기본 정보 입력 시 적는 성별
	@Column(nullable = true)
	private Character gender;

	@Column
	private String role;

	@Column
	private String profileImgUrl;

	@Column(name = "follower_count", nullable = false)
	private Long followerCount;

	@Column(name = "following_count", nullable = false)
	private Long followingCount;


	/**비즈니스 로직 **/
	public UserEntity(String username, String role){
		this.username = username;
		this.role = role;
		this.followerCount = 0L;
		this.followingCount = 0L;
	}


}
