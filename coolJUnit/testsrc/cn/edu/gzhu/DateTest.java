package cn.edu.gzhu;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void testIsDayValid() {
		Date d = new Date();
		assertEquals(true,d.isDayValid(1,1,1));
	}
	@Test
	public void testIsDayValidZero() {
		Date d = new Date();
		assertEquals(false,d.isDayValid(0,0,0));
	}
	@Test
	public void testIsDayValidleap() {
		Date d = new Date();
		assertEquals(true,d.isDayValid(4,2,29));
	}
	@Test
	public void testIsDayValidMAX() {
		Date d = new Date();
		assertEquals(true,d.isDayValid(Integer.MAX_VALUE,1,1));
	}
	@Test
	public void testIsDayValid2() {
		Date d = new Date();
		assertEquals(false,d.isDayValid(1,2,29));
	}
	@Test
	public void testIsMonthValid() {
		Date d = new Date();
		assertEquals(false,d.isMonthValid(-1));
	}
	@Test
	public void testIsMonthValidZero() {
		Date d = new Date();
		assertEquals(false,d.isMonthValid(0));
	}
	@Test
	public void testIsMonthValidNormal() {
		Date d = new Date();
		assertEquals(true,d.isMonthValid(2));
	}
	@Test
	public void testIsMonthValidNormalOver() {
		Date d = new Date();
		assertEquals(false,d.isMonthValid(13));
	}

	@Test
	public void testIsYearValid() {
		Date d = new Date();
		assertEquals(false, d.isYearValid(-1));
	}
	@Test
	public void testIsYearValidZero() {
		Date d = new Date();
		assertEquals(false, d.isYearValid(0));
	}
	@Test
	public void testIsYearVaildNormal() {
		Date d = new Date();
		assertEquals(true, d.isYearValid(10));
	}
	@Test
	public void testIsYearValidMAX() {
		Date d = new Date();
		assertEquals(true, d.isYearValid(Integer.MAX_VALUE));
	}
}