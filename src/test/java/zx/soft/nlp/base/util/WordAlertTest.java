package zx.soft.nlp.base.util;

import org.junit.Test;

public class WordAlertTest {

	@Test
	public void test() {
		String str = "ａｚ ＡＺ AZ az ０９•";
		char[] result = WordAlert.alertStr(str);
		System.out.println(new String(result));//az az az az 09·
	}

}
