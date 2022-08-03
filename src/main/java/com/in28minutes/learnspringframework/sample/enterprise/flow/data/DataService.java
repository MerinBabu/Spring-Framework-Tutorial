//getting data
package com.in28minutes.learnspringframework.sample.enterprise.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService{
	
	public List<Integer> retrieveData(){
		
		return Arrays.asList(1,2,3,4);
	}
}