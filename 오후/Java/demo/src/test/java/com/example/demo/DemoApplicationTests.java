package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.vo.UsersVO;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	EmpMapper empMapper;
	
	//작성한 쿼리 테스트하기
	@Test
	void contextLoads() {
		
		UsersVO vo = new UsersVO();
		vo.setId("jjangyoung");
		
		System.out.println("id : "+vo.getId());
		System.out.println("pw : "+vo.getPw());
		
		int rows = empMapper.selectUsersFindById(vo);
		System.out.println("rows => "+rows);
	}
		// 오른쪽에 초록색바로 변하면 오류가 없는것, 빨간색바가 생기면 오류가 있는거
		// 무슨 창이 뜨면 j로 시작하는거 누르고 ok


}
