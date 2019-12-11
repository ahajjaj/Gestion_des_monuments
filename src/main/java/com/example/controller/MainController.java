package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.Dao.IprojetDao;
import com.example.Dao.ProjetDaoImpl;
import com.example.entity.Celebrite;
import com.example.entity.Departement;
import com.example.entity.Monument;
import com.example.entity.User;
import com.example.services.Iprojetservice;
import com.example.services.ProjetServiceImpl;

import java.util.List;

@Controller
public class MainController  {
	@Autowired
	private IprojetDao IprojetDao ;
	
////////////////////////LISTER//////////////////////:
	@RequestMapping(value="/celebrites",method = RequestMethod.GET)
	public String index(Model model){
		List<Celebrite> celebrite=IprojetDao.getCelebrite();
		model.addAttribute("ListCelebrite",celebrite);
		return "celebrites";
	
	}
	
	@RequestMapping(value="/monuments",method = RequestMethod.GET)
	public String indexX(Model model){
		List<Monument> monument=IprojetDao.getListMonuments();
		model.addAttribute("ListMonuments",monument);
		return "monuments";
	
	}
	
	@RequestMapping(value="/monumentsUser",method = RequestMethod.GET)
	public String index2(Model model){
		List<Monument> monument=IprojetDao.getListMonuments();
		model.addAttribute("ListMonuments",monument);
		return "monumentsUser";
	
	}
	
	@RequestMapping(value="/touriste",method = RequestMethod.GET)
	public String index1(Model model){
		List<Celebrite> celebrite=IprojetDao.getCelebrite();
		model.addAttribute("ListCelebrite",celebrite);
		return "touriste";
	
	}
////////////////////////AJOUTER //////////////////////:
	
	@RequestMapping(value="/addcelebrite",method = RequestMethod.GET)
	public String addCelebrite(Model model){
		Celebrite celebrite = new Celebrite();
		model.addAttribute("Ajoutcelebrite",celebrite);
		return "addcelebrite";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveCeleb(@ModelAttribute("addcelebrite") Celebrite celebrite) {
		if (celebrite != null) {
			IprojetDao.addCelebrite(celebrite);
		}
		return ("redirect:/celebrites");
	}
////////////////////////SUPPRIMER  //////////////////////:
	
	  @RequestMapping( value="/supprimer")
	  public String delete(int numCelebrite) {
	       IprojetDao.deleteCelebrite(numCelebrite); 
	    return("redirect:/celebrites");
	  
	  }
	  
	  @RequestMapping( value="/deleteM")
	  public String delete(String codeM) {
	       IprojetDao.deleteMonument(codeM); 
	    return("redirect:/monuments");
	  
	  } 
////////////////////////MODIFIER //////////////////////:
	  
	  @RequestMapping(value="/edit")
		public String edit(int numCelebrite, Model model) {
			Celebrite celebrite = IprojetDao.getCelebrite(numCelebrite);
			model.addAttribute("editC",celebrite); 
			model.addAttribute("celebrite",celebrite);
			model.addAttribute("celebrites",IprojetDao.getCelebrite());
			return("update");	
		
		}
  
	  @RequestMapping(value="/update", method = RequestMethod.POST)
 	 public String update(@ModelAttribute("edit") Celebrite celebrite, Model model) {
 		 if(celebrite !=null) {
 			IprojetDao.editCelebrite(celebrite);
 		 }
 		 return("redirect:/celebrites");
	  }
	  
	  
	/*  @RequestMapping(value="/editM")
			public String edit(String codeM, Model model) {
		  	Monument monument = (Monument) IprojetDao.getListMonuments(codeM);
				model.addAttribute("editM",monument); 
				model.addAttribute("monument",monument);
				model.addAttribute("monument",IprojetDao.getListMonuments());
				return("editM");	
			
			}
	  
		  @RequestMapping(value="/updateM", method = RequestMethod.POST)
	 	 public String update(@ModelAttribute("edit") Monument monument, Model model) {
	 		 if(monument !=null) {
	 			IprojetDao.editM(monument);
	 		 }
	 		 return("redirect:/monuments");
		  }
		  */
		 
	  ////////////////////////rechercher //////////////////////::
	
	  @RequestMapping(value="/recherche")
		public String rechercheCelebrite()
		{
			return "recherche";
		}
	  @RequestMapping(value="/rechercher", method = RequestMethod.GET)
	  public String rechercheCelebrite(Model model, int numCelebrite) { Celebrite
	  celebrite=IprojetDao.getCelebrite(numCelebrite);
	  model.addAttribute("celebrite", celebrite);
	  return "recherche"; }
	  
	  /////////////////:///////Login/////////////////////////////
	  
	
	  @RequestMapping(value = { "/login" }, method = RequestMethod.GET) 
	  public ModelAndView login() { 
	  ModelAndView modelAndView = new ModelAndView();
	  modelAndView.setViewName("login"); // resources/template/login.html 
	  return modelAndView; }
	  
	  
	  
	  @RequestMapping(value = "/register", method = RequestMethod.GET) 
	  public ModelAndView register() { 
	  ModelAndView modelAndView = new ModelAndView(); 
	  //User user = new User(); 
	  //modelAndView.addObject("user", user);
	  modelAndView.setViewName("register"); 
	  return modelAndView; }
	  
	  
	  
	  @RequestMapping(value = "/home", method = RequestMethod.GET) public
	  ModelAndView home() { 
	  ModelAndView modelAndView = new ModelAndView();
	  modelAndView.setViewName("home"); 
	  return modelAndView; }
	 
	  @RequestMapping(value = "/homeUser", method = RequestMethod.GET) public
	  ModelAndView homeUser() { 
	  ModelAndView modelAndView = new ModelAndView();
	  modelAndView.setViewName("homeUser"); 
	  return modelAndView; }

}






