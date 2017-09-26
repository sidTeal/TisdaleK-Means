import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*
 * ***************************************************
 * Class Name: ExcelWriter 
 * Author: Chris Tisdale
 * **************************************************** 
 * Purpose of the class:
 * This class provides an excel writer to write output data.
 * **************************************************** 
 * September 8, 2017
 * *****************************************************
 */
public class ExcelWriter {

    /*
     * ***************************************************
     * Method Name: setStringArrayListInColumn 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: writes string array list to chosen column in output file.
     * Method parameters: ArrayList<String> data, int column, String outputFile
     * Return value: void
     * ***************************************************** 
     * Date: September 8, 2017
     * ****************************************************
     */
    public void setStringArrayListInColumn(ArrayList<String> data, int column, String outputFile) throws FileNotFoundException, IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("FirstSheet");

        for (int i = 0; i < data.size(); i++) {
            XSSFRow row = sheet.createRow(i);
            XSSFCell cell = row.createCell(column);
            cell.setCellValue(data.get(i));
        }

        workbook.write(new FileOutputStream(outputFile));
        workbook.close();
    }
    
    /*
     * ***************************************************
     * Method Name: setDoubleArrayListInColumn 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: writes double array list to chosen column in output file.
     * Method parameters: ArrayList<Double> data, int column, String outputFile
     * Return value: void
     * ***************************************************** 
     * Date: September 8, 2017
     * ****************************************************
     */
    public void setDoubleArrayListInColumn(ArrayList<Double> data, int column, String outputFile) throws FileNotFoundException, IOException {
        FileInputStream fis= new FileInputStream(new File(outputFile));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
            
        
        for (int i = 0; i < data.size(); i++) {
            XSSFRow row = sheet.getRow(i);
            XSSFCell cell = row.createCell(column);
            cell.setCellValue(data.get(i));
        }
        fis.close();
        workbook.write(new FileOutputStream(outputFile));
        workbook.close();
    }

}
