package com.ust.oopsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestBanksApp {

	private static Map<String, Bank> bankMap;

	public static void main(String[] args) {
		Branch b1 = new Branch(12, "Gacchibowli", true);
		Branch b2 = new Branch(12, "Cybercity", true);
		Branch b3 = new Branch(12, "Amerpet", false);
		
		ArrayList<Branch> iciciBranches = new ArrayList<>();
		iciciBranches.add(b1); iciciBranches.add(b2); iciciBranches.add(b3);
		System.out.println(iciciBranches);
		
		
		Bank iciciBank = new Bank(1, "ICICI", iciciBranches);
		
		
		Branch b4 = new Branch(12, "Gacchibowli", true);
		Branch b5 = new Branch(12, "Cybercity", false);
		Branch b6 = new Branch(12, "Amerpet", true);
		ArrayList<Branch> hdfcBranches = new ArrayList<>();
		hdfcBranches.add(b4); hdfcBranches.add(b5); hdfcBranches.add(b6);
		Bank hdfcBank = new Bank(2, "HDFC", hdfcBranches);
		
		bankMap = new HashMap<>();
		bankMap.put("ICICI",iciciBank);
		bankMap.put("HDFC",hdfcBank);
		
		System.out.println(bankMap);
		
		List<Branch> foundBranches = findBranchesWithAtms("ICICI");
		System.out.println(foundBranches);
		
		List<Branch> foundBranches2 = findBranchesWithAtms("HDFC");
		System.out.println(foundBranches2);

	}
	
	public static List<Branch> findBranchesWithAtms(String bankName){
		List<Branch> foundBranches = new ArrayList<>();
		Bank bankObj = bankMap.get(bankName);
		if(bankObj != null){
			for(Branch branch : bankObj.branches){
				if(branch.isHasAtm()){
					foundBranches.add(branch);
				}
			}
		}
		
		return foundBranches;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
