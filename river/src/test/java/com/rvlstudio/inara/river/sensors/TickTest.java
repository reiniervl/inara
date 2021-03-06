package com.rvlstudio.inara.river.sensors;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Test;

public class TickTest {
	@Test
	public void run() {
		Tick tick = new Tick();
		tick.s.listen(System.out::println);
		CompletableFuture.runAsync(() -> tick.run());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tick.stop();
	}
}
