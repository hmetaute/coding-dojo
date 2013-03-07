package com.develogical;

import org.junit.Test;

import com.develogical.QueryProcessor;

import java.util.Map;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class QueryProcessorTest {

    @Test
    public void largestNumber() {
        String result = new QueryProcessor().process("1223234: which of the following numbers is the largest: 46, 31");
        assertNotNull(result);
        assertThat(result, is("46"));
    }
    
    @Test
    public void canSumTwoNumbers() {
        String result = new QueryProcessor().process("what is 20 plus 15");
        assertNotNull(result);
        assertThat(result, is("35"));
    }
    
    @Test
    public void canGreetYou(){
    	String result = new QueryProcessor().process("what is your name");
        assertNotNull(result);
        assertThat(result, is("mingas"));
    }
    
    
    @Test
    public void squareQube(){
    	String result = new QueryProcessor().process("0: which of the following numbers is both a square and a cube: 995, 324");
        assertNotNull(result);
        assertThat(result, is(""));
    }
    
    
    @Test
    public void multiply(){
    	String result = new QueryProcessor().process("what is 19 multiplied by 8");
        assertNotNull(result);
        assertThat(result, is("152"));
    }
//"493b1a40: which of the following numbers is the largest: 721, 60, 34, 181";
//0 bytes=4    what is 19 multiplied by 8


}



