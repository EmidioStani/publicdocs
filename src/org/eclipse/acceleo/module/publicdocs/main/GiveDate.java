package org.eclipse.acceleo.module.publicdocs.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GiveDate {
	public String getDate(String pattern)
	{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String actual=simpleDateFormat.format(new Date());
		return actual;
	}


}