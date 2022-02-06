package com.n11.methods;

import com.n11.pages.StoresPageElementElement;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Keys;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import static com.n11.pages.BasePageElement.searchText;
import static com.n11.pages.StoresPageElementElement.sellerName;
import static com.n11.pages.StoresPageElementElement.storeComments;
import static com.n11.utilities.BrowserUtils.hover;

public class ExportExcelNames {



        ArrayList<String[]> storeNameList = new ArrayList<>();

        String excelFileName = "n11StoreName.xls";//name of excel file
        String sheetName;
        HSSFSheet sheet;
        HSSFWorkbook wb = new HSSFWorkbook();
        String storeName;


        public void getAllStoreNames() throws IOException, InterruptedException {
            for (int i = 0; i < StoresPageElementElement.storeList.size(); i++) {
                sheetName = StoresPageElementElement.getStoreCharacter(i + 1).getText().toLowerCase(Locale.ROOT);
                sheet = wb.createSheet(sheetName);
                StoresPageElementElement.getStoreCharacter(i + 1).click();
                Thread.sleep(750);
                storeNameList.add(StoresPageElementElement.getStoreListNames().get(0).getText().split("\n"));

                for (int j = 0; j < storeNameList.get(i).length; j++) {
                    sheet.createRow(j).createCell(0).setCellValue(storeNameList.get(i)[j]);

                }

            }
            FileOutputStream fos = new FileOutputStream(excelFileName);

            //Write this workbook to a stream
            wb.write(fos);
            fos.flush();
            fos.close();

        }

        public void getStoreNameToExcel() throws IOException {

            FileInputStream fis = new FileInputStream(excelFileName);
            storeName = wb.getSheet("s").getRow(1).getCell(0).toString();

            fis.close();

    }
        public void goToStorePage(){
            hover(searchText);
            searchText.sendKeys(storeName);
            searchText.sendKeys(Keys.ENTER);
            sellerName.click();
            storeComments.click(); //Mağaza yorumları

        }
}
