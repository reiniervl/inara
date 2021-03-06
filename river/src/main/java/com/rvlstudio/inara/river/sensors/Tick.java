package com.rvlstudio.inara.river.sensors;

import java.time.LocalDateTime;

import nz.sodium.Stream;
import nz.sodium.StreamSink;

public class Tick {
	private final StreamSink<LocalDateTime> sink = new StreamSink<>();
	public final Stream<String> s = sink.map(LocalDateTime::toString);
	private boolean running = false;

	public void run() {
		running = true;
			while (running) {
				sink.send(LocalDateTime.now());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

	public void stop() {
		running = false;
	}
}
