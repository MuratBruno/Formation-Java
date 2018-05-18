package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import docPDF.PDFView;
import model.Employee;

@Controller
public class PDFController {

 @RequestMapping(value = "/generate/pdf.htm", method = RequestMethod.GET)
 ModelAndView generatePdf(HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  System.out.println("Appel de la methode :  generatePdf()...");
  
  Employee employee = new Employee();
  employee.setFirstName("Samy");
  employee.setLastName("Chaabi");
  
  ModelAndView modelAndView = new ModelAndView(new PDFView(), "command",employee);
  
  return modelAndView;
 }

}