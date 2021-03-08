package com.rvlstudio.inara.river;

import javax.ejb.Stateless;

import nz.sodium.StreamSink;
import nz.sodium.Stream;

@Stateless
public class Hello {
	private final StreamSink<String> s;
	public final Stream<String> sworld;

	public Hello() {
		s = new StreamSink<String>();
		sworld = s.map(n -> String.format("Hello, %s", n));
	}

	public Stream<String> world() {
		s.send("World");
		return sworld;
	}

	public Stream<String> world(String name) {
		s.send(name);
		return sworld;
	}
}