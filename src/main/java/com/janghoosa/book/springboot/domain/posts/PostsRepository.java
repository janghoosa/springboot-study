package com.janghoosa.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}

//  Entity클래스와 기본 Entity Repository는 함께 위치해야한다.
//  기본 Repository 없이 Entity클래스는 제 역할을 할 수가 없다.
//  규모가 커지면 도메인 별로 나누어 도메인 패키지에서 관리함.