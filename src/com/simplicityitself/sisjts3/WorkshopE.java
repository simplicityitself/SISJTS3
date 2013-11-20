package com.simplicityitself.sisjts3;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class WorkshopE {
	
	int getAnswerForA() {
		return 15 + 2 * 18;
	}
	
	@Test
	public void task1A() {

		int answer = 0;
		
		answer = getAnswerForA();
		
		assertEquals(answer, 51);
	}
	
	@Test
	public void task1B() {

		int answer = 0;
		
		answer = getAnswerForA();
		
		assertEquals(answer, 50);
	}
	
	@Test
	public void task2() {

		int answer = 0;
		
		answer = getAnswerForA();
		
		assertEquals(answer, 50);
	}

	
}