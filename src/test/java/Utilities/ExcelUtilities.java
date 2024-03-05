package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ExcelUtilities 
{

	public String readWeb() throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\CourseSearch.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet Sheet= workbook.getSheetAt(0);
		XSSFRow row=Sheet.getRow(0);
		String value=row.getCell(0).getStringCellValue();
		workbook.close();
		file.close();
		return value;
		
	}
	public String readLang() throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\CourseSearch.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet Sheet= workbook.getSheetAt(0);
		XSSFRow row=Sheet.getRow(1);
		String value1=row.getCell(0).getStringCellValue();
		workbook.close();
		file.close();
		return value1;
		
	}
	public String readfill1() throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\CourseSearch.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet Sheet= workbook.getSheetAt(0);
		XSSFRow row=Sheet.getRow(2);
		String value3=row.getCell(0).getStringCellValue();
		workbook.close();
		file.close();
		return value3;
		
	}
	public String readfill2() throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\CourseSearch.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet Sheet= workbook.getSheetAt(0);
		XSSFRow row=Sheet.getRow(3);
		String value4=row.getCell(0).getStringCellValue();
		workbook.close();
		file.close();
		return value4;
		
	}
	public String readfill3() throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\CourseSearch.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet Sheet= workbook.getSheetAt(0);
		XSSFRow row=Sheet.getRow(4);
		String value5=row.getCell(0).getStringCellValue();
		workbook.close();
		file.close();
		return value5;
		
	}

	public String readfill5() throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\CourseSearch.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet Sheet= workbook.getSheetAt(0);
		XSSFRow row=Sheet.getRow(6);
		String value7=row.getCell(0).getStringCellValue();
		workbook.close();
		file.close();
		return value7;
		
	}

}
