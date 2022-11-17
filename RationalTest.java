package ��������;
import java.util.Scanner;
class Rational{
	double molecule;//������ӱ���
	double denominator;//�����ĸ����
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
	double getMolecule() //��ȡ���ӵķ���
	{
		return molecule;
	}
	double getDenominator()//��ȡ��ĸ�ķ���
	{
		return denominator;
	}
	void setMolecule(double molecule)//���ķ��ӵķ���
	{
		this.molecule=molecule;
	}
	void setDenominator(double denominator)//���ķ�ĸ�ķ���
	{
		this.denominator=denominator;
	}
	double add(Rational r)//�������ļӷ�
	{
		double add=(r.molecule/r.denominator)+(this.molecule/this.denominator);
		return add;
	}
	double minus(Rational r)//�������ļ���
	{
		double m=(this.molecule/this.denominator)-(r.molecule/r.denominator);
		return m;
	}
	double multiply(Rational r)//�������ĳ˷�
	{
		double c=(this.molecule/this.denominator)*(r.molecule/r.denominator);
		return c;
	}
    double divide(Rational r)//�������ĳ���
	{
		double d=(this.molecule/this.denominator)/(r.molecule/r.denominator);
		return d;
	}
}
public class RationalTest {

	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("�����һ���������ķ���");
    double num1=in.nextDouble();
    System.out.println("�����һ���������ķ�ĸ");
    double num2=in.nextDouble();
	Rational a=new Rational(num1,num2);
	System.out.println("����ڶ����������ķ���");
	double num3=in.nextDouble();
	System.out.println("����ڶ����������ķ�ĸ");
    double num4=in.nextDouble();
	Rational b=new Rational(num3,num4);
	System.out.println(a.molecule);
	System.out.println(a.denominator);
	System.out.println(b.molecule);
	System.out.println(b.denominator);
	System.out.println("������������ӵĽ��Ϊ:"+a.add(b));
	System.out.println("��������������Ľ��Ϊ:"+a.minus(b));
	System.out.println("������������˵Ľ��Ϊ:"+a.multiply(b));
	System.out.println("��������������Ľ��Ϊ:"+a.divide(b));
	in.close();
	}

}
