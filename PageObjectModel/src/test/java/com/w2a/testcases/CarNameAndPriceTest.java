package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.utilities.DataUtil;

public class CarNameAndPriceTest extends BaseTest
{

	@Test(dataProviderClass = DataUtil.class,dataProvider="dpi")
	public void carNameAndPrice(String browserName,String carBrand,String carType)
	{
		
	}
}
