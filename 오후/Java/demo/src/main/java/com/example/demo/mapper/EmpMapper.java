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
	// 넘겨주고 받는 데이터가 많으면 객체 생성해서 넘겨줘야함
	
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Imflower
	 * @Return : int
	 * @Comment : 사원추가
	 */
	int insertEmp(EmpVO vo);
	

	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Imflower
	 * @Return : int
	 * @Comment : 사원삭제
	 */
	int deleteEmp(int empno);
	// delete는 사원번호 한개만 없애는 것이기 때문에 객체 안만들어줘도 됨
	// 대신 아이디랑 이름 똑같아야함
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Imflower
	 * @Return : int
	 * @Comment : 사원정보수정
	 */
	int updateEmp(EmpVO vo);
	
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Imflower
	 * @Return : int
	 * @Comment : 부서추가
	 */
	int insertDept(DeptVO dv);
	

	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Imflower
	 * @Return : int
	 * @Comment : 부서삭제
	 */
	int deleteDept(int deptno);

}



/*
 * 추상클래스와 인터페이스의 차이점
 	* 추상클래스 : 
 	
 	* 인터페이스 : 메소드 정의만 가능
*/

