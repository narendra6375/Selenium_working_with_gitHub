package com.shopperstack_GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {

	public int random() {
		Random r = new Random();
		int value = r.nextInt(1000);
		return value;
	}

	public String Current_Date() {
		String dateString = LocalDate.now().toString().replace("-", "/");
		return dateString;
	}

	public String Current_Date_Time() {
		String dateString = LocalDateTime.now().toString().replace("-", "")
				.replace(":", "").replace(".", "");
		return dateString;
	}

}
