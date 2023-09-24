package oop_homework_2;

import java.util.ArrayList;
import java.util.List;

public class Present {

	
	public List<Sweet> sweets = new ArrayList<Sweet>();
	
	
	public void addSweet(Sweet sweet) {
		this.sweets.add(sweet);
	}
	
	
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		List<Sweet> finalList = new ArrayList<Sweet>() ;
		
		for (Sweet sweet: this.sweets) {
			
			if(sweet.sugarWeight >= minSugarWeight && sweet.sugarWeight <= maxSugarWeight) {
				
				finalList.add(sweet);
				
			}
			
		}
		Sweet[] finalArray = new Sweet[finalList.size()];
		finalList.toArray(finalArray);
		return finalArray;
	}

	// the method calculates total weight of the present
	public double calculateTotalWeight() {
		double sum=0;
		for(Sweet sweet: this.sweets) {
			sum+=sweet.weight;
			
			
		}
		return sum;
	}

	// the method that adds sweet to the present


	// the method returns copy of the Sweet[] array so that nobody could 
	// modify state of the present without addSweet() method. 
	// Also array shouldn’t contain null values.
	
	public Sweet[] getSweets() {
		
		Sweet[] sweetArray = new Sweet[this.sweets.size()];
		this.sweets.toArray(sweetArray);
		return sweetArray;
		
	}

}
