package com.cru.studentscore;

public class StudentScore {
	
	/* adding 4 integer values.*/
	public int calculateMarks(int physics, int chemistry, int maths) {


	    return physics+chemistry+maths;
	}

	/* adding 3 integer values.*/
	public int calculateMarks(int physics, int chemistry, int maths, int bio) {


	    return physics+chemistry+maths+bio;
	}

	/* adding 4 double values.*/
	public double calculateMarks(double physics, double chemistry, double maths, double bio) {


	    return physics+chemistry+maths+bio;
	}

	/* static method adding 5 float values.*/
	public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {


	    return maths+bio+physics+chemistry+lang;
	}


	/* adding 4 float values with order changed.*/
	public float calculateMarks(float maths, float bio, float physics, float chemistry) {



	    return maths+bio+physics+chemistry;
	}


	public static void main(String[] args) {
		System.out.println("Float Static method "+calculateMarks(78f,88f,83f,89f,96f));
		StudentScore sum=new StudentScore();
		System.out.println("Float NonStatic Method "+sum.calculateMarks(96f,94f,94f,99f));
		System.out.println("Double NonStatic Method "+sum.calculateMarks(62, 69, 78, 72));
		System.out.println("Integer Method with 4 values " +sum.calculateMarks(65, 78, 69, 59));
		System.out.println("Integer Method with 3 values " +sum.calculateMarks(79, 82, 71));


	}

}
