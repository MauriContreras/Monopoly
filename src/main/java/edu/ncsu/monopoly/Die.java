package edu.ncsu.monopoly;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Die {

	public static final int SIX = 6;
	private Random rand;

	public int getRoll() throws NoSuchAlgorithmException {
		getRand();
		return (this.rand.nextInt() * SIX) + 1;
	}

	public void getRand() throws NoSuchAlgorithmException {
		try {
			this.rand = SecureRandom.getInstanceStrong();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new NoSuchAlgorithmException(e);
		}
	}
}