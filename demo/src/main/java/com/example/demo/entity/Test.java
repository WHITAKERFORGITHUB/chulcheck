package com.example.demo.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
	public static void main(String[] args) {
		
        // 원하는 형식으로 포맷터 생성 (년-월-일 시:분:초)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // LocalDateTime 객체를 포맷팅된 문자열로 변환
        String formattedNow = LocalDateTime.now().format(formatter);

        // 결과 출력
        System.out.println(formattedNow);

	}

}
