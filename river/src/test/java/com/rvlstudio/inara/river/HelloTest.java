package com.rvlstudio.inara.river;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class HelloTest {
	@Test
	public void world() {
		Hello hello = new Hello();
		System.out.println("Testing");
		hello.sworld.listen(w -> System.out.println(w));
		hello.world();
		hello.world("Jupiter");
		assertTrue(hello != null);
	}
}
