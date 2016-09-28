package java_session2Assingment2;

public class resultExpression {
	int a=20,b=10;
	public void expressionsolve()
	{
		int c,d,e;
		b = a-- - --a;
		System.out.println("value of b is:\t"+b);
		c = a--;
		System.out.println("value of c is:\t"+c);
	    d = a>>2;
	    System.out.println("value of d is:\t"+d);
	    e = a&b;
	    System.out.println("value of e is:\t"+e);
		
	}

	public static void main(String[] args) {
		 resultExpression obj1 = new  resultExpression();
		 obj1.expressionsolve();
		
		// TODO Auto-generated method stub

	}

}
