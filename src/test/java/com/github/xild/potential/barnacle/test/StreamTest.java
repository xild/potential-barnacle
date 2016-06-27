package com.github.xild.potential.barnacle.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.github.xild.potential.barnacle.App;
import com.github.xild.potential.barnacle.Stream;
import com.github.xild.potential.barnacle.StreamImpl;

public class StreamTest {

	static List<Stream> streams;

	@Before
	public void setUp() {
		streams = Arrays.asList(gerarStreamInput("aabbcc"), gerarStreamInput("AabCCaDd"),
				gerarStreamInput("abCCDDEEFFGG"));
	}

	@Test
	public void verificaTodosRepetem() {
		Assert.assertEquals(App.firstChar(streams.get(0)), 0);
	}

	@Test
	public void verificaUmaSemRepeticao() {
		Assert.assertEquals(App.firstChar(streams.get(1)), 'A');
	}

	@Test
	public void verificaDoisRepetidos() {
		Assert.assertEquals(App.firstChar(streams.get(2)), 'a');
	}

	@Test(expected = IllegalArgumentException.class)
	public void verificaCriacaoComNulo() {
		Stream s = new StreamImpl(null);
	}

	private Stream gerarStreamInput(String input) {
		return new StreamImpl(input);
	}

}
