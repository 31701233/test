package cn.edu.gzhu;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateUtilTest {
	@Test
	//测试负数
	public void testIsLeapYearNagetive() {
		assertEquals(false,DateUtil.isLeapYear(-4));
	}
	@Test
	//测试0
	public void testIsLeapYearZero() {
		assertEquals(true,DateUtil.isLeapYear(0));
	}
	@Test
	//测试正常年
	public void testIsLeapYearNormal() {
		assertEquals(false,DateUtil.isLeapYear(1885));
	}
	@Test
	//测试特殊闰年
	public void testIsLeapYearLeap() {
		assertEquals(true,DateUtil.isLeapYear(2000));
	}
	@Test
	//测试int最大值
	public void testIsLeapYearMAX() {
		assertEquals(false,DateUtil.isLeapYear(Integer.MAX_VALUE));
	}
	@Test
	//测试int最小值
	public void testIsLeapYearMIN() {
		assertEquals(false,DateUtil.isLeapYear(Integer.MIN_VALUE));
	}
	
	//测试输入的日期的天数是当年的第几天
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
