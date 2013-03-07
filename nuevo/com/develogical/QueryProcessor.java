package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("which of the following numbers is the largest:")) {
        	String partido[] = query.split(": ");
        	String numeros[] = partido[1].split(" ");
        	Integer primerNumero = Integer.parseInt(numeros[0]);
        	Integer segundoNumero = Integer.parseInt(numeros[1]);
        	
        	return Math.max(primerNumero, segundoNumero) + "";
            
        }
        return "mingas";
    }

}
