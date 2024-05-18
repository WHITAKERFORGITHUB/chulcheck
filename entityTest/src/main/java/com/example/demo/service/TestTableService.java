package com.example.demo.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.example.demo.entity.TestTable;
import com.example.demo.entity.TestTableRepository;
import com.example.demo.entity.TestTableRequestDto;

//import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // 초기화 되지 않은 final 필드에 대해 생성자 생성
@Service
public class TestTableService {
	
	private final TestTableRepository testTableRepository; // @RequiredArgsConstructor가 선언 되어 있찌 않다면, 필드생성시나 생성자를 통해 초기화 해주어야 한다. 
	
	public TestTable createTestTable(TestTableRequestDto requestDto) {
		
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//String formattedNow = LocalDateTime.now().format(formatter);
		
		requestDto.setRegTime(LocalDateTime.now());
		TestTable testTable = new TestTable(requestDto);
		return testTableRepository.save(testTable);
	}

}
