package exam;

class Aa{
	public void m1(String x) {
		System.out.println("one");
	}}

class Bb extends Aa{
	public void m1(String x) {
		System.out.println("two");
		super.m1(null);
	}}

public class test {
	public static void main(String[] args) {
	Aa a = new Bb();
	a.m1(null);
	a.m1(null);
	a.m1(null);
	a.m1(null);
	a.m1(null);
}}
