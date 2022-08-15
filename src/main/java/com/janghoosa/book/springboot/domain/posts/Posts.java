package com.janghoosa.book.springboot.domain.posts;

import com.janghoosa.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // from lombok - 클래스 내의 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor // from lombok - 기본 생성자 자동 추가
@Entity // from JPA
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스의 생성, 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
//    Entity 클래스에는 절대 Setter를 만들지 않는다.
//    생성자 대신 buider를 쓴다.
}