package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.contains("name")) {
            return "Los Mingas 2";
        }
        return "";
    }

}
