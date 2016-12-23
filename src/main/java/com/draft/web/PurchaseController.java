package com.draft.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.draft.domain.Employee;
import com.draft.domain.PurchaseOrder;

@RooJavaBean
@RooToString
@RequestMapping("/purchase")
@Controller
public class PurchaseController {
	 @RequestMapping(value = "/all", produces = "text/html")
	    public String viewall(Model uiModel) {
	     	List<PurchaseOrder> listOrder = PurchaseOrder.findAllPurchaseOrders();
	     	uiModel.addAttribute("listOrder",listOrder);
	        return "purchase/all";
	    }
	 @RequestMapping(value = "/add", produces = "text/html")
	    public String viewadd(Model uiModel) {
		 	List<Employee> listEmployee = Employee.findAllEmployees();
	     	uiModel.addAttribute("listEmployee",listEmployee);
	     	List<PurchaseOrder> listOrder = PurchaseOrder.findAllPurchaseOrders();
	     	uiModel.addAttribute("listOrder",listOrder);
	        //return "purchase/all";
	        return "purchase/add";
	    }
	 
	 @RequestMapping(value = "/add",method = RequestMethod.POST,produces = "text/html")
	    public String createPurchase(@Valid PurchaseOrder purchaseOrder, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletReques){
		 PurchaseOrder ct = new PurchaseOrder();
		 
	        System.out.println(httpServletReques.getParameterMap());
		 
		 	ct.setEmployeeName(purchaseOrder.getEmployeeName());
	        ct.setProductName(purchaseOrder.getProductName());
	        ct.setProductAmount(purchaseOrder.getProductAmount());
	        ct.setPrice(purchaseOrder.getPrice());
	        
	        if(purchaseOrder.getStatus()!=null)
	        	ct.setStatus(purchaseOrder.getStatus());
	        else
	        	ct.setStatus(false);
	        
	        ct.setStringDate(purchaseOrder.getStringDate());
	        
	        ct.persist();
	        System.out.println("=====> createPus <=====");
	        System.out.println("Employee Name : " + purchaseOrder.getEmployeeName());
	        System.out.println("Product Name : " + purchaseOrder.getProductName());
	        System.out.println("Product Amount : " + purchaseOrder.getProductAmount());
	        System.out.println("Price : " + purchaseOrder.getPrice());
	        System.out.println("Status : " + purchaseOrder.getStatus());
	        
	        return viewadd(uiModel);
	    }
	 
	 @RequestMapping(value = "/changePurchase",method = RequestMethod.GET,produces = "text/html")
	 public String deleteCustomer(Model uiModel, @RequestParam(value = "idOrder", required = false) String idOrder){
	        System.out.println(PurchaseOrder.findPurchaseOrder(Long.valueOf(idOrder)));
	        PurchaseOrder po = PurchaseOrder.findPurchaseOrder(Long.valueOf(idOrder));
	        po.setStatus(true);
	        po.persist();
	        List<PurchaseOrder> listOrder = PurchaseOrder.findAllPurchaseOrders();
	        uiModel.addAttribute("listOrder",listOrder);
	        return "purchase/add";
	 }
	 
}

