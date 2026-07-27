package SeleniumPhase1;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Test35_DataDriven_Reading {
    public static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(projectPath+"\\TestData\\TestDataFile.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int totalRows = sheet.getLastRowNum();
        int totalCellsinaRow= sheet.getRow(1).getLastCellNum();
        System.out.println(totalRows+"TotalRows");
        System.out.println(totalCellsinaRow+"TotalCells");


        // rows Counting from 0
        // Cells counting from 1

        for(int i = 0 ; i<=totalRows; i++){
            XSSFRow row = sheet.getRow(i);
            for(int c =0; c<totalCellsinaRow; c++){
                XSSFCell cell = row.getCell(c);
                System.out.println(cell.toString());
            }
        }

        workbook.close();



    }
}
