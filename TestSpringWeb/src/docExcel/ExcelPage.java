package docExcel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

public class ExcelPage extends AbstractXlsxView {

	protected void buildExcelDocument(Map model, HSSFWorkbook wb, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {

		HSSFSheet sheet;
		HSSFRow sheetRow;
		HSSFCell cell;

		// Go to the first sheet
		// getSheetAt: only if wb is created from an existing document
		// sheet = wb.getSheetAt(0);
		sheet = wb.createSheet("Spring");
		sheet.setDefaultColumnWidth((short) 12);

		// write a text at A1
		cell = getCell(sheet, 0, 0);
		setText(cell, "Spring-Excel test");

		List words = (List) model.get("wordList");
		for (int i = 0; i < words.size(); i++) {
			cell = getCell(sheet, 2 + i, 0);
			setText(cell, (String) words.get(i));
		}
	}

	private void setText(HSSFCell cell, String string) {
		// TODO Auto-generated method stub

	}

	private HSSFCell getCell(HSSFSheet sheet, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void buildExcelDocument(java.util.Map<String, Object> model, Workbook workbook,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}

}