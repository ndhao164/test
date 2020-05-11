package com.ndhao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ndhao.dto.TestDto;
import com.ndhao.entity.Test;
import com.ndhao.mapper.TestMapper;
import com.ndhao.repository.TestRepository;

@Service
@Transactional
public class TestService {
	
	@Autowired TestRepository testRepository;

	public void test(TestDto test) {
		Test tests = TestMapper.INSTANCE.toEntity(test);
		testRepository.save(tests);
	}
}
