//U10416008 丁杰
import java.util.*;
import java.math.BigDecimal;

public class NumberTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String oneMore = "Y";
		double dividend;
		double divisor;
		int scale;
		Number result = new Number();
		
		
		
		while(oneMore.equals("Y")){
			System.out.println("Input Dividend Your Want");
			dividend = input.nextDouble();
			System.out.println("Input Divisor Your Want");
			divisor = input.nextDouble();
			System.out.println("Input Scale Your Want To Test");
			scale = input.nextInt();
			
			//set div dvs scale
			result.setTestNumber(dividend , divisor , scale);
			//show result
			result.result();
			
			System.out.println("Test One More Time?Y/N");
			oneMore = input.next();
			if(!(oneMore.equals("N")||oneMore.equals("Y"))){
				System.out.println("Wrong Input,Test One More Time?Y/N");
				oneMore = input.next();
			}
		}
	} 
}
class Number{
	BigDecimal dividend ;
	BigDecimal divisor ;
	int scale;
	Number(){
		dividend = new BigDecimal(1);
		divisor = new BigDecimal(3);
		scale = 1000;
	}
	Number(double div , double dvs , int wantScale){
		dividend = new BigDecimal(div);
		divisor = new BigDecimal(dvs);
		scale = wantScale;
	}
	public void result(){
		System.out.println(dividend.divide(divisor , scale , 4 ).toString());
	} 
	public void setTestNumber(double div , double dvs , int wantScale){
		dividend = new BigDecimal(div);
		divisor = new BigDecimal(dvs);
		scale = wantScale;
	}
}