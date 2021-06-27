package pagefactory.dml;

 class MethodsConcept {
	
	//Ratna5256@gmail.com   ratna personal number : +91 9000160099
		//Ratanithelp@gmail.com	
	/*
	Java Methods :
	

		*) Inside the class,  it is not possible to write the business logics directly, so inside the class declare the method in that method write the logic.

		Access instance method data using objects.

		Instance methods overriding is possible

		Static methods overriding is not possible.

		Static  instance method data using Classes.	
		
method_name : mandatory
arguments 	: Optional
return type : mandatory
default modifier in java is default
method name and arguments list is called method signature

case 1 : inside the class morethan one method with same signature not allowed.

case 2 : Java doesNOT inner methods but Java supports Inner classes.

*) local varaible and instance variable having same name, then priority  goes to local variable.
                    

		
		
		
		
		
		
		
		
		
		
		*/	
	void add(int num1,int num2)
	{
		System.out.print(num1+num2);	
	}	
	
	static void disp(int a,char ch,float f,boolean b) {
		
		System.out.print(a+ " " + ch + "  "  +  f + "   " + b );
		
	}
	
	void loginStatus(String username, String password) {
		
		if(username.equalsIgnoreCase("ratn") && password.equalsIgnoreCase("anu")) {
			System.out.print("login success................"+ username);
		}else {
			System.out.print("login fail.......................... try with correct details");
			
		}
	}

 }

class Another {
	

	public static void main(String[] args) {
		
		
		MethodsConcept m = new MethodsConcept();
		//m.add(1,2);
		//MethodsConcept.disp(2,'x',2.4f,true);
		m.loginStatus("ratan", "anu");
	}
}
	
	Class Test{
		
		
		
		
	}
