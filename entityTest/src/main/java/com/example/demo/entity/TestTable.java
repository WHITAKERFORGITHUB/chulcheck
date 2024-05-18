package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class TestTable {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false)
    private String username;

    // 작성시간
    private LocalDateTime regTime;
    
    public TestTable(TestTableRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.regTime = requestDto.getRegTime();
    }

}
