package com.brainfucker;

public class Main{
    public static void main(String[] args){
	BrainfuckRunner bfr = new BrainfuckRunner();
	String pluses = "";
	for(int i = 0; i < 65; i++){
	    pluses += '+';
	}
	pluses += '.';
	System.out.println(bfr.run(pluses));
	System.out.println(bfr.run(">++++++[<++++++++++>-]<+++++>>+[<+>-]<<[>>>+<<[<->->+<]>[<+>-]<<]>>>."));

	try{
	    System.out.println(bfr.findOtherBracket("[][[[fdfasdf]]]",2));
	}catch(Exception e){
	    System.out.println(e.getMessage());
	}
    }
}
