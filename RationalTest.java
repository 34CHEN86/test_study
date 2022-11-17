package 有理数类;
import java.util.Scanner;
class Rational{
	double molecule;//定义分子变量
	double denominator;//定义分母变量
	Rational()
	{
		molecule=1;
		denominator=1;
	}
	Rational(double molecule,double denominator)
	{
		this.molecule=molecule;
		this.denominator=denominator;
	}
	double getMolecule() //获取分子的方法
	{
		return molecule;
	}
	double getDenominator()//获取分母的方法
	{
		return denominator;
	}
	void setMolecule(double molecule)//更改分子的方法
	{
		this.molecule=molecule;
	}
	void setDenominator(double denominator)//更改分母的方法
	{
		this.denominator=denominator;
	}
	double add(Rational r)//有理数的加法
	{
		double add=(r.molecule/r.denominator)+(this.molecule/this.denominator);
		return add;
	}
	double minus(Rational r)//有理数的减法
	{
		double m=(this.molecule/this.denominator)-(r.molecule/r.denominator);
		return m;
	}
	double multiply(Rational r)//有理数的乘法
	{
		double c=(this.molecule/this.denominator)*(r.molecule/r.denominator);
		return c;
	}
    double divide(Rational r)//有理数的除法
	{
		double d=(this.molecule/this.denominator)/(r.molecule/r.denominator);
		return d;
	}
}
public class RationalTest {

	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("输入第一个有理数的分子");
    double num1=in.nextDouble();
    System.out.println("输入第一个有理数的分母");
    double num2=in.nextDouble();
	Rational a=new Rational(num1,num2);
	System.out.println("输入第二个有理数的分子");
	double num3=in.nextDouble();
	System.out.println("输入第二个有理数的分母");
    double num4=in.nextDouble();
	Rational b=new Rational(num3,num4);
	System.out.println(a.molecule);
	System.out.println(a.denominator);
	System.out.println(b.molecule);
	System.out.println(b.denominator);
	System.out.println("两个有理数相加的结果为:"+a.add(b));
	System.out.println("两个有理数相减的结果为:"+a.minus(b));
	System.out.println("两个有理数相乘的结果为:"+a.multiply(b));
	System.out.println("两个有理数相除的结果为:"+a.divide(b));
	in.close();
	}

}
