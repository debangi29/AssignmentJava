package javapro;
      abstract  class person  //abstract class implementation hiding unimportant details of person class
		{
		 private String name;
		 protected char sex;
		 public int age;
		 person() //non parametric constuctor of person class
		 {
		 name = null;
		 sex = 'U';
		 age = 0;
		 }
		 person(String name, char sex, int age) // parametric constructor of person class
		 {
		 this.name = name;
		 this.sex = sex;
		 this.age = age;
		 }
		 String getName()//function to return name
		 {
		 return name;
		 }
		 void Display()//displays basic person information
		 {
		 System.out.println("Name = "+name);
		 System.out.println("Sex = "+sex);
		 System.out.println("Age = "+age);
		 }
		}
	class student extends person  //student class is a subclass of abstract class person
	{
	 public int RollNo;
	 String branch;
	 student(String name, char sex, int age, int RollNo, String branch)
	 {
	 super(name, sex, age); // calls parent class's constructor with 3 arguments
	 this.RollNo = RollNo;
	 this.branch = branch;
	 }
	 void Display() // Method Overriding
	 {
	 System.out.println("Roll No = "+RollNo);
	 System.out.println("Name = "+getName());// calling getname() function to return name
	 System.out.println("Sex = "+sex);
	 System.out.println("Age = "+age);
	 System.out.println("Branch = "+branch);
	 }
	 void TestMethod() // test what is valid to access it is not called
	 {
	 // name = "Mark"; Error: name is private
	 sex = 'M';
	 RollNo = 20;
	 }
	}
	class professor extends person  //professor subclass of person super class
	{
		 private int Empno;
		private String branch;
		 professor(String name, char sex, int age, int Empno, String branch)
		 {
		 super(name, sex, age); // calls parent class's constructor with 3 arguments
		 this.Empno = Empno;
		 this.branch=branch;
		 }
		 void Display() // Method Overriding
		 {
		 System.out.println("Employee Number = "+Empno);
		 System.out.println("Name = "+getName());// calling getname() function to return name
		 System.out.println("Sex = "+sex);
		 System.out.println("Age = "+age);
		 System.out.println("Branch Taught= "+ branch);
		 }
		 void TestMethod() // test what is valid to access 
		 {
		 // name = "Mark"; Error: name is private
		 sex = 'M';
		 Empno = 25;
		 }
		
	}
	class marks extends student //marks inherited from student class which is itself a subclass of person class
	{
		marks(String name, char sex, int age, int RollNo, String branch, int MA104, int CSO102, int PHY102) {
			super(name, sex, age, RollNo, branch);
			// TODO Auto-generated constructor stub
			this.MA104=MA104;
			this.CSO102=CSO102;
			this.PHY102=PHY102;
		}
		public int MA104;
		public int CSO102;
		public int PHY102,sum,av,p;
		void total()// method to calculate total marks
		{
			sum=MA104+CSO102+PHY102;
		}
		void average()// method to calculate average of 3 subjects
		{
			av=(MA104+CSO102+PHY102)/3;
		}
		void per()// method to calculate percentage of 3 subjects
		{
			p=(sum*100)/300;
		}
		int percent()
		{
			return (sum*100)/300;
		}
		void Display()// Method overriding
		{
			System.out.println("Roll No = "+RollNo);
			 System.out.println("Name = "+getName());
			 System.out.println("Sex = "+sex);
			 System.out.println("Age = "+age);
			 System.out.println("Branch = "+branch);
			 System.out.println("Total = "+sum);
			 System.out.println("Average = "+av);
			 System.out.println("Percentage = "+p);
			
		}
	}
	class grade extends marks //grade is a subclass of marks class
	{ grade(String name, char sex, int age, int RollNo, String branch, int MA104, int CSO102, int PHY102) {
			super(name, sex, age, RollNo, branch, MA104, CSO102, PHY102);
			// TODO Auto-generated constructor stub

		}
	String g;
		void g1() //a method of grade class to determine grade
		{
			if (p>=90 && p<=100)
				g="A+";
			else if(p>=80 && p<90)
				g="A";
			else if(p>=70 && p<80)
				g="B+";
			else if(p>=60 && p<90)
				g="B";
			else if(p>=50 && p<60)
				g="C";
			else g="D";
		}
		void Display() //a method to display all details (METHOD OVERRIDING)
		{

			System.out.println("Roll No = "+RollNo);
			 System.out.println("Name = "+getName());
			 System.out.println("Sex = "+sex);
			 System.out.println("Age = "+age);
			 System.out.println("Branch = "+branch);
			 System.out.println("Total = "+sum);
			 System.out.println("Average = "+av);
			 System.out.println("Percentage = "+p);
			 System.out.println("Grade = "+g);
			
		}
	}
	interface students1 //a students interface for attendance criteria
	{
		public void attendance();
	}
	class attend implements students1 //a class attend to implement interface
	{
		private int a;
		attend(int a) //constructor of attend class
		{
			this.a=a;
		}
		public void attendance() //method of class attend for printing attendance status
		{if(a>=75)
			System.out.println("CONGRATS, ATTENDANCE ABOVE 75%");
		else System.out.println("OH NO! YOUR ATTENDANCE BELOW 75%");
			
		}
	}
	public class Mytest1
	{
	 public static void main(String args[] )// Main function calls all function
	 {// Create object of student grade, Professor and attend class and pass values
	 grade s1 = new grade("Anshika", 'F', 19, 1, "Computer Science",87,54,78);
	 grade s2 = new grade("Aastha Kandwal", 'F', 19, 2, "Software Engineering",76,98,67);
	 grade s3 = new grade("Debangi Ghosh", 'F', 19, 3, "Mathematics and Computing",76,98,99);
	 grade s4 = new grade("Shashank Shekhar Singh", 'M', 20, 4, "Mechanical Engineering",76,99,99);
	 professor p1 = new professor("Devika S Menon", 'F', 39, 55210, "Computer Science");
	 professor p2 = new professor("Tanisha Jamod", 'F', 28, 87765, "Mathematics and Computing");
	 professor p3 = new professor("Abhishek Kumar", 'M', 30, 94091, "Software Engineering");
	 professor p4 = new professor("Harsh Sinha", 'M', 27, 93409, "Mechanical engineering");
	 attend at1=new attend(76);// calling attendance interface and passing values
	 attend at2=new attend(54);
	 attend at3=new attend(89);
	 attend at4=new attend(87);
	
	 
	 System.out.println("STUDENT 1 DETAILS...");
	 s1.total();
	 s1.average();
	 s1.per();
	 s1.g1();
	 s1.Display();
	 at1.attendance();
	 System.out.println();
	 System.out.println("STUDENT 2 DETAILS...");
	 s2.total();
	 s2.average();
	 s2.per();
	 s2.g1();
	 s2.Display();
	 at2.attendance();
	 System.out.println();
	 System.out.println("STUDENT 3 DETAILS...");
	 s3.total();
	 s3.average();
	 s3.per();
	 s3.g1();
	 s3.Display();
	 at3.attendance();
	 System.out.println();
	 System.out.println("STUDENT 4 DETAILS...");
	 s4.total();
	 s4.average();
	 s4.per();
	 s4.g1();
	 s4.Display();
	 at4.attendance();
	 System.out.println();
	 int arr[]=new int[4];// an array to store percentage of all students
	 arr[0]=s1.percent();
	 arr[1]=s2.percent();
	 arr[2]=s3.percent();
	 arr[3]=s4.percent();
	 int l=0;int c=0;String n1;
	 for(int i=0;i<4;i++)
	 {
		 if(arr[i]>l)
		 {
			 l=arr[i];// to store max marks among all
			 c=i;
		 }
	 }
	 if(c==0)  //n1 to store the name of the topper
		 n1=s1.getName();
	 else if(c==1)
		 n1=s2.getName();
	 else if(c==2)
		 n1=s3.getName();
	 else
		 n1=s4.getName();
	 System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________");
	 System.out.println();
	 System.out.println("TOPPER AMONG ALL THE STUDENTS");
	 System .out.println("Name: "+n1+"   "+"Percentage is: "+l); //Display topper name
	 System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________");
	 System.out.println();
	 System.out.println("PROFFESSORS EMPLOYED IN OUR INSTITUTION");// Professor Details in our institution
	 p1.Display();
	 System.out.println();
	 p2.Display();
	 System.out.println();
	 p3.Display();
	 System.out.println();
	 p4.Display();
	 }
	}

	
