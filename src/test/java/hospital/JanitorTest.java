package hospital;

import org.junit.Test;

import org.junit.Assert;

public class JanitorTest {
 @Test
 public void shouldNotBeSweeping() {
	 Janitor underTest = new Janitor("", "", 100);
	 boolean isSweeping = underTest.isSweeping();
	 Assert.assertEquals(false, isSweeping);
 }
 
 @Test
 public void shouldBeSweeping() {
	 Janitor underTest = new Janitor("", "", 100);
	 underTest.toggleSweeping();
	 boolean isSweeping = underTest.isSweeping();
	 Assert.assertEquals(true, isSweeping);
 }
 
}
