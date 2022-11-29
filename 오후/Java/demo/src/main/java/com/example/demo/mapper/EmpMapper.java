package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;

@Mapper
public interface EmpMapper {
 
	/**
	 * @Since : 2022. 11. 28.
	 * @Author : Imflower
	 * @Return : List<EmpVO>
	 * @Comment : EMP테이블 전체조회
	 */
	List<EmpVO> selectEmp();//메소드정의
	
	
	/**
	 * @Since : 2022. 11. 29.
	 * @Author : Imflower
	 * @Return : List<DeptVO>
	 * @Comment : Dept테이블 전체조회
	 */
	List<DeptVO>selectDept();
	
	int insertEmp(EmpVO vo);
}



/*
 * 추상클래스와 인터페이스의 차이점
 	* 추상클래스 : 
 	
 	* 인터페이스 : 메소드 정의만 가능
*/

