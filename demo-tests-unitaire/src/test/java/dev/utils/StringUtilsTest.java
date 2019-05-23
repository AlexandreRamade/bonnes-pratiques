package dev.utils;

import org.junit.Assert;
import org.junit.Test;



public class StringUtilsTest {
	
	@Test
	public void testLevenshteinDistance() {
		StringUtils strUtils = new StringUtils();
		
		String[] values1 = {"chat", "chat", "machins", "aviron", "distance", "Chien", "chien", "valeur", "espace ", null};
		String[] values2 = {"chat", "chats", "machine", "avion", "instance", "Chine", "Chien", "value", "espace", "null"};
		int[] resultsExpected = {0, 1, 1, 1, 2, 2, 1, 2, 1, -1};
		
		for(int i = 0, lim = resultsExpected.length; i < lim; i++) {
			int result = StringUtils.levenshteinDistance(values1[i], values2[i]);
			Assert.assertEquals("Erreur à la valeur : " + i + " du tableau !", resultsExpected[i], result);
		}
		
		
		
	}
}
