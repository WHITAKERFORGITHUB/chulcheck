package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TestTable;
import com.example.demo.entity.TestTableRepository;
import com.example.demo.entity.TestTableRequestDto;
import com.example.demo.service.*;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TestTableController {
	
	private final TestTableRepository testTableRepository;
    private final TestTableService testTableService;
	
	@PostMapping("/api/memos")
	public TestTable createMemo(@RequestBody TestTableRequestDto requestDto) { // 
		return testTableService.createTestTable(requestDto);
	}
	
	@GetMapping("/api/memos")
	public List<TestTable> getMemos() {
	    return testTableRepository.findAllByOrderByRegTimeDesc();
	}
	
	@DeleteMapping("/api/memos/{id}")
	public Long deleteMemo(@PathVariable Long id) {
		testTableRepository.deleteById(id);
	    return id;
	}
	
}
