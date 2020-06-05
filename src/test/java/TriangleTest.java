package com.example;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TriangleTest {

	@Test
	public void test1() {
		Triangle t = new Triangle();
		assertEquals("正三角形", t.checkTriangle(3, 3, 3));
	}

	@Test
	public void test2(){
		Triangle t = new Triangle();
		assertEquals("等腰直角三角形", t.checkTriangle(2, 2, Math.sqrt(8)));
		assertEquals("等腰直角三角形", t.checkTriangle(2, Math.sqrt(8), 2));
		assertEquals("等腰直角三角形", t.checkTriangle(Math.sqrt(8), 2, 2));

	}

	@Test
	public void test3(){
		Triangle t = new Triangle();
		assertEquals("等腰三角形", t.checkTriangle(5, 3, 5));
	}

	@Test
	public void test4() {
		Triangle t = new Triangle();
		assertEquals("直角三角形", t.checkTriangle(3, 4, 5));
		assertEquals("直角三角形", t.checkTriangle(13, 12, 5));
		assertEquals("直角三角形", t.checkTriangle(5, 13, 12));

	}

	@Test
	public void test5() {
		Triangle t = new Triangle();
		assertEquals("一般三角形", t.checkTriangle(2, 3, 4));
	}

	@Test
	public void test6(){
		Triangle t = new Triangle();
		assertEquals("不是三角形", t.checkTriangle(1, 2, 3));
		assertEquals("不是三角形", t.checkTriangle(3, 2, 1));
		assertEquals("不是三角形", t.checkTriangle(1, 3, 2));

	}

	@Test
	public void test7(){
		Triangle t = new Triangle();
		assertEquals("不是三角形", t.checkTriangle(-1, 2, 3));
		assertEquals("不是三角形", t.checkTriangle(3, -4, 5));
		assertEquals("不是三角形", t.checkTriangle(5, 12, -13));
	}
}
