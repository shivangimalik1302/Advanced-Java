package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService 
{
	int count=0;
	int count1=0;
	int count2=0;
	
	public int findNumberOfNullObjects(Student data[]) 
	{
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==null)
			{
				count2++;
			}
		}
		return count2;
	}

	public int findNumberOfNullMarks(Student data[]) 
	{
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=null && data[i].getMarks()==null)
				count++;
		}
		return count;
	}
	public int findNumberOfNullNames(Student data[]) 
	{  
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=null && data[i].getName()==null)
			{
				count1++;
			}
		}
		return count1;
	}
	
}
