package com.Google.qa.utilities;


	import java.io.File;

	import java.io.FileInputStream;

	import java.io.IOException;
	import java.util.HashMap;
	import java.util.Map;
	
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.Row;

	import org.apache.poi.ss.usermodel.Sheet;

	import org.apache.poi.ss.usermodel.Workbook;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class GlobalTestDataRead {

	    public static  Map<String, Object> readExcel(String filePath,String sheetName,String ScriptTestData) throws IOException{

	    Map<String, Object> map = null;
	    //Create an object of File class to open xlsx file

	    File file =    new File(filePath);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook ObjWorkbook = null;

	    //If it is xlsx file then create object of XSSFWorkbook class
	    ObjWorkbook = new XSSFWorkbook(inputStream);
	    
	    //Read sheet inside the workbook by its name
	    Sheet getSheet = ObjWorkbook.getSheet(sheetName);

	    //Create a loop over all the rows of excel file to read it
	    for (int i = 0; i < getSheet.getLastRowNum(); i++) {
	    	
	        Row row = getSheet.getRow(i);

	        String scriptName= row.getCell(0).getStringCellValue();
	       
	        if(scriptName.equalsIgnoreCase(ScriptTestData)) {
	        	
	        	
	         map=new HashMap<String, Object>();
	        		        	
	        	for(int j=1;j<=row.getLastCellNum()-1;j++) {
	        		Cell cellValue = getSheet.getRow(i).getCell(j);
	        		CellType getCellType= cellValue.getCellType();
	        			        		
	        		if(getCellType==getCellType.STRING) {
	        			
	        			map.put(getSheet.getRow(0).getCell(j).getStringCellValue(), getSheet.getRow(i).getCell(j).getStringCellValue());
	        			        			
	        		}else if(getCellType==getCellType.NUMERIC) {
	        			
	        			map.put(getSheet.getRow(0).getCell(j).getStringCellValue(), getSheet.getRow(i).getCell(j).getNumericCellValue());
	        			
	        		}else if(getCellType==getCellType.FORMULA) {
	        			map.put(getSheet.getRow(0).getCell(j).getStringCellValue(), getSheet.getRow(i).getCell(j).getRichStringCellValue());
	        			
	        			
	        		}
	        		
	        	}
	        	 
	        	
	        }//If statement end
	        
	       	       
	    }//first for loop End
		
	    ObjWorkbook.close();
	    return map;
	    
	    }  //FUnction END
	    
	    
	    
	    //Main function is calling readExcel function to read data from excel file

	    public static void main(String[] args) throws IOException{

	    //Create an object of ReadGuru99ExcelFile class

	    	GlobalTestDataRead objExcelFile = new GlobalTestDataRead();

	  	   Map<String, Object> getMapData= objExcelFile.readExcel("C:\\Users\\utkar\\Desktop\\TestData.xlsx","Sheet1","OUTRIGHT_Deal_Creation");

	  	System.out.println(getMapData.get("Amount")); 
	  	System.out.println(getMapData.get("Instrument")); 
	   	System.out.println(getMapData.get("Spot Book"));
	    }

	}
	
	
	
	
	
	

