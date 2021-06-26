package packA;
 class Maths {
  int numMarks=100;
   Maths()
   {
	   System.out.println("Sceinece Straeam number is :::"+numMarks);
	   
   }
   Maths(int numMarks)
   {
	   this.numMarks=numMarks;
   }
	public static void main(String[] args) {
		Science sc  = new Science();
       sc.getScore();
	}

}
