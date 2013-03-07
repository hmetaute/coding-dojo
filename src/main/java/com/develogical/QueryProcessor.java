package com.develogical;

public class QueryProcessor {

    public String process(String query) {
    	System.out.println("query:" + query);
        if (query.contains("which of the following numbers is the largest:")) {
        	String partido[] = query.split(": ");
        	String numeros[] = partido[2].split(", ");
        	Integer max = Integer.parseInt(numeros[0]);
        	for(int i = 0; i < numeros.length; i++){
        		max = Math.max(max, Integer.parseInt(numeros[i]));
        	}
        	        	
        	return max + "";
            
        }else if(query.contains("plus")){
        	String partido[] = query.split("what is ");
        	String numeros[] = partido[1].split(" plus ");
        	Integer primerNumero = Integer.parseInt(numeros[0]);
        	Integer segundoNumero = Integer.parseInt(numeros[1]);
        	return (primerNumero + segundoNumero) + "";
        }else if(query.contains("what is your name")){
        	return "mingas";
        }else if(query.contains("which of the following numbers is both a square and a cube")){
        	String partido[] = query.split(": ");
        	String numeros[] = partido[2].split(", ");
        	Integer result = Integer.parseInt(numeros[0]);
//        	Integer max = Integer.parseInt(numeros[0]);
        	for(int i = 0; i < numeros.length; i++){
        		Integer p = Integer.parseInt(numeros[i]);
        		int entero = (int) Math.sqrt(p);
        		int cuadrado = entero * entero;
        		int enteroCubo = (int) Math.pow(p, 1/3);
        		int cubo = enteroCubo * enteroCubo * enteroCubo;
        		if(cuadrado == p && enteroCubo == p){
        			return p + "";
        		}
        	}        	        	
        }else if(query.contains("multiplied")){
        	String partido[] = query.split("what is ");
        	String numeros[] = partido[1].split(" multiplied by ");
        	Integer primerNumero = Integer.parseInt(numeros[0]);
        	Integer segundoNumero = Integer.parseInt(numeros[1]);
        	return (primerNumero * segundoNumero) + "";
        }
        
        return ""; //buque
        
    }

}
