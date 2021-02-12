/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.controller;



import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peoplecert.entity.Orders;
import peoplecert.service.CustomerService;
import peoplecert.service.IngredientService;
import peoplecert.service.PaymentService;
import peoplecert.service.PizzaService;
import peoplecert.service.Size1Service;

/**
 *
 * @author tzortziskapellas
 */
@Controller
@RequestMapping("/orderpizza")
public class OrderController {
    
    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private IngredientService ingredientsService;
    @Autowired
    private Size1Service size1Servise;
    @Autowired
    private PaymentService paymentService;
   
    
    @GetMapping()
    public String showForm(Model model, @ModelAttribute("paragelia") Orders order){
        model.addAttribute("sizes", size1Servise.getSize1s());
        model.addAttribute("ingredients", ingredientsService.getIngredients());
        model.addAttribute("payments", paymentService.getPayments());
        return "customiseYourPizza";
    }
    
    
    @PostMapping("/create")
   public String processOrder(@ModelAttribute("paragelia") @Valid Orders order,
            BindingResult result){//Binding result must come after the @Valid object
        
        if(result.hasErrors()){
            return "customiseYourPizza";
        }
        //save object in DB
        return "orderdetails";
    }
}