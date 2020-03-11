package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import java.util.*;
public class StudentMain 
{

	 
//
//	static {
//		for (int i = 0; i < data.length; i++) 
//			data [i]= new Student();
//		data [0] = new Student ("A1", new int [ ] {72, 73, 74}); 
//		 data [1] = new Student ("B1", new int [ ] {75, 76, 77}); 
//		 data [2] = new Student ("C1", new int[ ] {99, 99, 99}); 
//		 data [3] = new Student ("C3", new int[ ] {100, 100, 99}); 
//		 data [4] = new Student ("B2", new int[ ] {13, 88, 13}); 
//		 data [5] = new Student ("C3", null); 
//		 data [6] = new Student (null, new int[ ] {77, 55, 12}); 
//		 data [7] = null; 
//		 
//		 
//	}
	public static void main(String args[]) throws NullStudentException, NullNameException, NullMarksArrayException
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student data[] = new Student[n];
		for(int i=0;i<data.length;i++)
			data [i]= new Student();
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			int arr[]=new int[3];
			for(int j=0;j<3;j++)
				arr[j]=sc.nextInt();
			data[i]=new Student(name,arr);
		}
			
		StudentReport str=new StudentReport();
		StudentService ser = new StudentService ();

		String x="";
		for(int i=0;i<data.length;i++)
		{
			try {
				x=str.validate(data[i]);
			}
			catch (NullNameException e) 
			{
				x="NullNameException occurred"; 
			}  
			catch (NullMarksArrayException e) 
			{
				x="NullMarksArrayException occurred";
			}  
			catch (NullStudentException e) 
			{
				x="NullStudentException occurred";
			} 

			System.out.println ("GRADE="+x); 

		}
			System.out.println ("Number of Objects with Marks array as null ="    
					+ ser.findNumberOfNullMarks(data)); 
			System.out.println ("Number of Objects with Name as null="  
					+ ser.findNumberOfNullNames(data));  
			System.out.println ("Number of Objects that are entirely null=" 
					+ ser.findNumberOfNullObjects(data)); 
		
	}
}
