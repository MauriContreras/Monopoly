package edu.ncsu.monopoly;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Die {

	private Random rand;
	public static final int someInt = 6;

	public int getRoll() {
		getRand();
		return (this.rand.nextInt() * someInt) + 1;
	}

	public void getRand() {
		try {
			this.rand = SecureRandom.getInstanceStrong();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}