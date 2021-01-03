package com.mcnz;

import static org.junit.Assert.fail;
import org.junit.Assert;
import org.junit.Test;

public class FailMeMaybeTest {
	
	@Test
	public void testMyTrueAssertion() {
		//change true to false to fail the build
		Assert.assertTrue(true);
	}
	
	@Test
	public void demoTest3() {
		Assert.assertEquals( 8, 4+4);
	}
	
	@Test
	public void demoTest4() {
		Assert.assertEquals( 2, 2*1);
	}
}
