package com.bridgelabz.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaImpl {
	public static void main(String[] args) {
		int a = 10;
		
		FuncIntrfc d=()->{System.out.println("value of a is: "+a);
		};
		d.myMethod();
		
		FuncIntrfcArgs n=(x)->{System.out.println("hello "+x);
		};
		n.myFuncSinglArgs("jeevan");
		
		
		MultipleArgsFunc add=(x,y)->{return(x+y);};
		System.out.println(add.add(15, 20));
		
		
		
		List<String> sList = new ArrayList<String>();
		sList.add("jeevan");
		sList.add("rohit");
		sList.add("hardik");
		sList.add("sachin");
		sList.add("virat");
		
		sList.forEach(
				(var)->System.out.println(var)
				);
		
		
		FuncIntrfcArgs m =(name)->{
			String s1 = "My name is ";
			String s2 = s1 + name;
			System.out.println(s2);
		};
		m.myFuncSinglArgs("jeevan");
	}
	

}
