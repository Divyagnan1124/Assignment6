package fs;

import java.util.Scanner;
public class stu {
	 public static void main ( String []  args) {
		Scanner sc = new Scanner(System.in);
		int sid = Integer.parseInt(args[0]);
		String sname =  args[1];
			
		int sub1marks = Integer.parseInt(args[2]);
		int sub2marks = Integer.parseInt(args[3]);
		int sub3marks = Integer.parseInt(args[4]);
		int sub4marks = Integer.parseInt(args[5]);
		int sub5marks = Integer.parseInt(args[6]);
		int sub6marks = Integer.parseInt(args[7]);
			
		System.out.println("studentID:");
		sid = sc.nextInt();
		System.out.println("sname:");
		sname =sc.next(); 
			
		System.out.println("subject1 marks: " );
		sub1marks = sc.nextInt();
		System.out.println(" subject2 marks: ");
		sub2marks = sc.nextInt();
		System.out.println(" subject3 marks: ");
		sub3marks = sc.nextInt();
		System.out.println(" subject4 marks: ");
		sub4marks= sc.nextInt();
		System.out.println(" subject5 marks: ");
		sub5marks = sc.nextInt();
		System.out.println(" subject6 marks: ");
		sub6marks = sc.nextInt();
		System.out.println (" totalmarks=" +(sub1marks + sub2marks + sub3marks + sub4marks + sub5marks + sub6marks));
	    System.out.println("average= " +((sub1marks + sub2marks + sub3marks + sub4marks + sub5marks + sub6marks )/6));
					
			
	 }
	}


