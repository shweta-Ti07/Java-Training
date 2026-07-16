package com.coforge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.entities.Account;

import jakarta.annotation.PostConstruct;

@Controller
//@ResponseBody

public class AccountController {

	private static final ArrayList<Account> accountList = new ArrayList<Account>();

	@PostConstruct
	public void init() {

		accountList.add(new Account(100001L, "Rahul Sharma", "SBI", "Hyderabad", 50000.00));

		accountList.add(new Account(100002L, "Priya Reddy", "HDFC Bank", "Bengaluru", 75000.50));

		accountList.add(new Account(100003L, "Amit Kumar", "ICICI Bank", "Chennai", 32000.75));

		accountList.add(new Account(100004L, "Sneha Patil", "Axis Bank", "Pune", 89000.00));

		accountList.add(new Account(100005L, "Kiran Rao", "Canara Bank", "Vijayawada", 45000.25));

		accountList.add(new Account(100006L, "Anjali Verma", "Punjab National Bank", "Delhi", 61000.00));

		accountList.add(new Account(100007L, "Rohit Gupta", "Bank of Baroda", "Mumbai", 98000.90));

		accountList.add(new Account(100008L, "Meena Joshi", "Union Bank", "Nagpur", 27000.60));

		accountList.add(new Account(100009L, "Vikram Singh", "Indian Bank", "Kolkata", 150000.00));

		accountList.add(new Account(100010L, "Pooja Nair", "Kotak Mahindra Bank", "Kochi", 68000.80));

	}

	@RequestMapping("/accounts")

	public ModelAndView getAllAccounts() {

		ModelAndView mv = new ModelAndView();

		mv.addObject("accountList", accountList);

		mv.setViewName("list");// (/WEB-INF/views/list.jsp)

		return mv;
	}

	@RequestMapping("/accounts/add")
	public String addAccountForm(Model model) {
		model.addAttribute("account", new Account());
		return "add-account";

	}

	@RequestMapping(value = "/accounts/create", method = RequestMethod.POST)
	public String createAccount(@ModelAttribute("account") Account account, Model model) {
		accountList.add(account);
		return "redirect:/accounts";

	}
	
	@RequestMapping("/accounts/update/{accNo}")
	public String updateAccountForm(@PathVariable("accNo") long accNo,Model model) {
		
		Account acc=null;
		for(Account account:accountList) {
			if(account.getAccNo()==accNo) {
				acc=account;
				break;
			}
		}
		model.addAttribute("account",acc);
		return "update-account";
		
	}
	
	@RequestMapping(value="/accounts/modify",method=RequestMethod.POST)
	public String updateAccount(@ModelAttribute("account") Account account) {
		
		for(Account acc:accountList) {
			
			if(acc.getAccNo()==account.getAccNo()) {
				acc.setAccHolderName(account.getAccHolderName());
				acc.setBankName(account.getBankName());
				acc.setAddress(account.getAddress());
				acc.setBalance(account.getBalance());
				break;
			}
		}
		
		return "redirect:/accounts";
		
	}
	
	@RequestMapping("/accounts/info/{accNo}")
	public String getAccountInfo(@PathVariable("accNo") long accNo,Model model) {
		
		Account account=null;
		for(Account acc:accountList)
		{
			if(accNo==acc.getAccNo())
			{
				account=acc;
				break;
			}
				
		}
		
		model.addAttribute("account",account);
		return "info-account";
		
	}
	
	@RequestMapping(value="/accounts/delete/{accNo}")
	public String deleteAccount(@PathVariable("accNo")long accNo) {
		
		Account account=null;
		for(Account acc:accountList)
		{
			if(accNo==acc.getAccNo())
			{
				account=acc;
				break;
			}
				
		}
		
		accountList.remove(account);
		
		return "redirect:/accounts";
				
		
	}
	
	
	

}
