package org.apache.commons.math3.stat.descriptive.summary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSum1 {
	
	Sum1 s=new Sum1();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		s.increment(1);
		assertEquals(1,s.getN());
	}

}
