package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport 
{
	public String findGrade(Student obj)
	{
		int marks[]=obj.getMarks();
		int sum=0;
		for(int i=0;i<marks.length;i++)	
		{
			
			if(marks[i]<35)
			{
				return "F";
			}
			sum+=marks[i];
			
			
		}
		if(sum<150)
		{
			return "D";
		}
		else if(sum>150 && sum<=200)
		{
			return "C";
		}
		else if(sum>200 && sum<=250)
		{
			return "B";
		}
		else //if(sum>250 && sum<=300)
		{
			return "A";
		}
	//	return "";
	}
	
	public String validate(Student object) throws NullStudentException,NullNameException,NullMarksArrayException
	{
		if(object==null)
			throw new NullStudentException();
		 if(object.getName()==null)
			throw new NullNameException();
		if(object.getMarks()==null)
			throw new NullMarksArrayException();
		else
			return findGrade(object);
		
	}
	
}
