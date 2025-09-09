package examQuestions;

interface SomeThingIsWorng{
	void aMethod();
}

	class correctionrequred implements SomeThingIsWorng{
		public void aMethod(String str) {
			System.out.println(str);
		}
	}
	public class correction{
		public static void main(String args) {
			correction obj = new correction();
			obj.aMethod("hi,welcome to vit-ap");
		}
		
	}


