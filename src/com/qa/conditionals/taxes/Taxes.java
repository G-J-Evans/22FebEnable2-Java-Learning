package com.qa.conditionals.taxes;

public class Taxes {
	
public String name;	
public int salary;

public static float A_PERC_TAXBAND = 0.0f;
public static float B_PERC_TAXBAND = 0.1f;
public static float C_PERC_TAXBAND = 0.15f;
public static float D_PERC_TAXBAND = 0.2f;
public static float E_PERC_TAXBAND = 0.25f;

public static int A_HIGHER_TAXBAND = 14999;
public static int B_HIGHER_TAXBAND = 19999;
public static int C_HIGHER_TAXBAND = 29999;
public static int D_HIGHER_TAXBAND = 30000;


	public Taxes(String name, int salary) {
		this.name = name;
		this.salary = salary;

	}

	public float percentSalaryTax() {
		int x = salary;
		float a; // Salary in band A
		float b = 0; // Salary in band B
		float c = 0; // Salary in band C
		float d = 0; // Salary in band D
		float e = 0; // Salary in band E
		float tax;   // Total Tax
		float pertax;// Percentage tax on whole salary
		
		if (x <= A_HIGHER_TAXBAND) {
			a = x;
		} else {
			a = A_HIGHER_TAXBAND;
		}
		if (x <= B_HIGHER_TAXBAND && x > A_HIGHER_TAXBAND) {
			b = x - A_HIGHER_TAXBAND;
		} else if(x > B_HIGHER_TAXBAND) {
			b = B_HIGHER_TAXBAND - A_HIGHER_TAXBAND;
		} if(x > B_HIGHER_TAXBAND)
		if (x <= C_HIGHER_TAXBAND && x > B_HIGHER_TAXBAND) {
			c = x - B_HIGHER_TAXBAND;
		} else if(x > C_HIGHER_TAXBAND) {
			c = C_HIGHER_TAXBAND - B_HIGHER_TAXBAND;
		}
		if (x <= D_HIGHER_TAXBAND && x > C_HIGHER_TAXBAND) {
			d = x - C_HIGHER_TAXBAND;
		} else if(x > D_HIGHER_TAXBAND) {
			d = D_HIGHER_TAXBAND - C_HIGHER_TAXBAND;
		}
		if (x > D_HIGHER_TAXBAND) {
			e = x - D_HIGHER_TAXBAND;
		}
		tax = (a * A_PERC_TAXBAND) + (b * B_PERC_TAXBAND) + 
				(c * C_PERC_TAXBAND) + (d * D_PERC_TAXBAND) + (e * E_PERC_TAXBAND);
		
		pertax = 100 * tax / salary;
		return pertax;
	}
	
	public float SalaryTax() {
		int x = salary;
		float a; // Salary in band A
		float b = 0; // Salary in band B
		float c = 0; // Salary in band C
		float d = 0; // Salary in band D
		float e = 0; // Salary in band E
		float tax;   // Total Tax
		
		if (x <= A_HIGHER_TAXBAND) {
			a = x;
		} else {
			a = A_HIGHER_TAXBAND;
		}
		if (x <= B_HIGHER_TAXBAND && x > A_HIGHER_TAXBAND) {
			b = x - A_HIGHER_TAXBAND;
		} else if(x > B_HIGHER_TAXBAND) {
			b = B_HIGHER_TAXBAND - A_HIGHER_TAXBAND;
		} if(x > B_HIGHER_TAXBAND)
		if (x <= C_HIGHER_TAXBAND && x > B_HIGHER_TAXBAND) {
			c = x - B_HIGHER_TAXBAND;
		} else if(x > C_HIGHER_TAXBAND) {
			c = C_HIGHER_TAXBAND - B_HIGHER_TAXBAND;
		}
		if (x <= D_HIGHER_TAXBAND && x > C_HIGHER_TAXBAND) {
			d = x - C_HIGHER_TAXBAND;
		} else if(x > D_HIGHER_TAXBAND) {
			d = D_HIGHER_TAXBAND - C_HIGHER_TAXBAND;
		}
		if (x > D_HIGHER_TAXBAND) {
			e = x - D_HIGHER_TAXBAND;
		}
		tax = (a * A_PERC_TAXBAND) + (b * B_PERC_TAXBAND) + 
				(c * C_PERC_TAXBAND) + (d * D_PERC_TAXBAND) + (e * E_PERC_TAXBAND);
	
		return tax;
	}	
	
}
