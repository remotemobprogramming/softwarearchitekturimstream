package org.remotemobprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

	@Test
	void toRoman1() {
		assertEquals("I", RomanNumerals.toRoman(1));
	}

	@Test
	void toRoman2() {
		assertEquals("II", RomanNumerals.toRoman(2));
	}

	@Test
	void toRoman4() {
		assertEquals("IV", RomanNumerals.toRoman(4));
	}

	@Test
	void toRoman5() {
		assertEquals("V", RomanNumerals.toRoman(5));
	}

	@Test
	void toRoman6() {
		assertEquals("VI", RomanNumerals.toRoman(6));
	}
}