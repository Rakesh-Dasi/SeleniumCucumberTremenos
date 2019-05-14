package runners;

import org.junit.Test;

import utility.Constant;
import utility.ExcelUtils;

public class TestDataChecker {
	
	@Test
	public void mainTest() throws Exception{
		ExcelUtils.setExcelFile(Constant.Path_TestData, Constant.Sheet_Name);	
		int rowNumb = ExcelUtils.findRow("Which number goes with your address on [STREET]? (factual, older addresses)");
		String value = ExcelUtils.getCellData(rowNumb, Constant.Answer_Col);
		System.out.println("The value is : " + value);
	}
}
