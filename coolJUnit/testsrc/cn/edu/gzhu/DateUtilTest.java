package cn.edu.gzhu;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateUtilTest {
	@Test
	//���Ը���
	public void testIsLeapYearNagetive() {
		assertEquals(false,DateUtil.isLeapYear(-4));
	}
	@Test
	//����0
	public void testIsLeapYearZero() {
		assertEquals(true,DateUtil.isLeapYear(0));
	}
	@Test
	//����������
	public void testIsLeapYearNormal() {
		assertEquals(false,DateUtil.isLeapYear(1885));
	}
	@Test
	//������������
	public void testIsLeapYearLeap() {
		assertEquals(true,DateUtil.isLeapYear(2000));
	}
	@Test
	//����int���ֵ
	public void testIsLeapYearMAX() {
		assertEquals(false,DateUtil.isLeapYear(Integer.MAX_VALUE));
	}
	@Test
	//����int��Сֵ
	public void testIsLeapYearMIN() {
		assertEquals(false,DateUtil.isLeapYear(Integer.MIN_VALUE));
	}
	
	//������������ڵ������ǵ���ĵڼ���
	@Test
	public void testGetDayofYear10101() {
		assertEquals(1,DateUtil.getDayofYear(new Date(1,1,1)));
	}
	@Test
	public void testGetDayofYear40301() {
		assertEquals(61,DateUtil.getDayofYear(new Date(4,3,1)));
	}
	@Test
	public void testGetDayofYear20000301() {
		assertEquals(61,DateUtil.getDayofYear(new Date(2000,3,1)));
	}
	@Test
	public void testGetDayofYear31231() {
		assertEquals(365,DateUtil.getDayofYear(new Date(3,12,31)));
	}
	@Test
	public void testGetDayofYear011() {
		assertEquals(1,DateUtil.getDayofYear(new Date(0,1,1)));
	}
}
