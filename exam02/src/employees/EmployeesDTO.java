package employees;
// 오라클 데이터베이스에서 날짜 형식의 데이터를 컬럼에 저장했으나 
// 해당 시점의 날짜만 기록되어 있고, 
//
// 현재 시점으로부터 얼마나 오래되었는지 계산해야 합니다.
//
// hr 계정의 employees 테이블에서 first_name, salary, hire_date, 
// 그리고 입사후 몇 년이 지났는지 조회하는 자바 프로그램을 작성하여 프로젝트를 제출하세요

import java.sql.Date;

public class EmployeesDTO {

	String first_name;
	int salary;
	Date hire_date;
	int diff_date;
	
	@Override
	public String toString() {
		String n1 = "";
		n1 = String.format("이름 : %-11s 급여 : %6d 입사일 :%s 연차 : %d", first_name, salary, hire_date, diff_date);
		return n1;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public int getDiff_date() {
		return diff_date;
	}
	public void setDiff_date(int diff_date) {
		this.diff_date = diff_date;
	}
	

	
	
}
