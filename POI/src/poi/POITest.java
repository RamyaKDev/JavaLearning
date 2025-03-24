package poi;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POITest {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        System.out.println("Apache POI is configured correctly!");
    }
}