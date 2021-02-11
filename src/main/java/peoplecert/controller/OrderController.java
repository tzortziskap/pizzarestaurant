/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoplecert.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import peoplecert.entity.Customer;
import peoplecert.entity.Ingredient;
import peoplecert.entity.Pizza;
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
   
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(Model model){
        model.addAttribute("sizes", size1Servise.getSize1s());
        model.addAttribute("ingredients", ingredientsService.getIngredients());
        model.addAttribute("payments", paymentService.getPayments());
        return "customiseYourPizza";
    }
    
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Pizza pizza,Ingredient ingredients,Customer customer , RedirectAttributes attributes){
        pizzaService.addPizza(pizza);
        customerService.addCustomer(customer);
        ingredientsService.addIngredient(ingredients);
       return "orderdetails";//Redirect instructs client to sent a new GET request to /customer
    }
}
