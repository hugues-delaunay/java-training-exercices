package io.robusta.java.classic;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {


    int[] buildArray(int a, int b, int c){
    	
	int[] buildArray = {a,b,c};
        return buildArray;
    }


    boolean equality(int[] array1, int[] array2){
 
    	if(Arrays.equals(array1,array2)){
    		return true;
    	}
        return false;
    }

    String asString (int [] numbers){
    	
    	String result = "";

    	for (int i = 0; i < numbers.length; i++) {
    		result += numbers[i] +":";
    	}
    		return result; 
		
    }

    String asStringJoin (int [] numbers){
    	
    	String result = "";

    	for (int i = 0; i < numbers.length-1; i++) {
    		
    		result += numbers[i] +":";
    	}
    	result += numbers[numbers.length-1]+"";
    	
    		return result; 
    }

    String asString (String [] strings){
    	String result = "";

    	for (int i = 0; i < strings.length-1; i++) {
    		
    		result += strings[i] +" ";
    	}
    	result += strings[strings.length-1]+"";

    	
    		return result; 
    }

    String asString (Card [] cards){
    	
    	
        return null;
    }

}
