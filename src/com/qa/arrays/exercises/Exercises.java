package com.qa.arrays.exercises;

public class Exercises {

	int number;
	
	public Exercises(int number) {
		this.number = number;
	}
		
	
	
	public void exOne() {
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (10 * i);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		
	}
	
	public void extwo() {
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		for(int i = 0; i < array.length; i++) {
			array[i] = (array[i] * 10);
			System.out.println(array[i]);
		}
	}
	
	public void numOne() {
		if (this.number < 9 || number < 100) {
			
			int tens = number / 10;
			int ones = (number % 10);
			int digitSum = tens + ones;
			System.out.println(digitSum);	
			
		} else { System.out.println("Number isn't between 10 and 99");}
	
	}
	
	public void numTwo() {
		String[][][][] multiArray = new String[10][11][11][11];
		
		if(number < 1 || number > 9999) {
			System.out.println("Your number isn't between 1 and 9999");
			return;
		}
		int j = 0;
		int k = 0;
		int i = 0;
		int l = 0;
		
		for (l = 0; l < multiArray.length; l++) {
			if(number / 1000 == 0) {	
				multiArray[l][k][j][i] = " ";
			} else if(number / 1000 == 1) {
				multiArray[l][k][j][i] = "one thousand ";
			} else if(number / 1000 == 2) {
				multiArray[l][k][j][i] = "two thousand ";
			} else if(number / 1000 == 3) {
				multiArray[l][k][j][i] = "three hundred ";
			} else if(number / 1000 == 4) {
				multiArray[l][k][j][i] = "four hundred ";
			} else if(number / 1000 == 5) {
				multiArray[l][k][j][i] = "five hundred ";
			} else if(number / 1000 == 6) {
				multiArray[l][k][j][i] = "six hundred ";
			} else if(number / 1000 == 7) {
				multiArray[l][k][j][i] = "seven hundred ";
			} else if(number / 1000 == 8) {
				multiArray[l][k][j][i] = "eight hundred ";
			} else if(number / 1000 == 9) {
				multiArray[l][k][j][i] = "nine hundred ";
			} else { multiArray[l][k][j][i] = " "; }
		
			for (k = 0; k < multiArray[l].length - 1; k++) {
				if((number % 1000)/100 == 0) {					
				} else if((number % 1000)/100 == 1) {
					multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "one hundred ");
				} else if((number % 1000)/100 == 2) {
					multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "two hundred ");
				} else if((number % 1000)/100 == 3) {
					multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "three hundred ");
				} else if((number % 1000)/100 == 4) {
					multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "four hundred ");
				} else if((number % 1000)/100 == 5) {
					multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "five hundred ");
				} else if((number % 1000)/100 == 6) {
					multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "six hundred ");
				} else if((number % 1000)/100 == 7) {
					multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "seven hundred ");
				} else if((number % 1000)/100 == 8) {
					multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "eight hundred ");
				} else if((number % 1000)/100 == 9) {
					multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "nine hundred ");
				} else { multiArray[l][k][j][i] = (multiArray[l][k][j][i] +" "); }
			
				for (j = 0; j < multiArray[l][k].length - 1; j++) {
					if(((number % 1000) % 100)/10 == 0) {					
					} else if(((number % 1000) % 100)/10 == 1) {
						multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "ten ");
					} else if(((number % 1000) % 100)/10 == 2) {
						multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "twenty ");
					} else if(((number % 1000) % 100)/10 == 3) {
						multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "thirty ");
					} else if(((number % 1000) % 100)/10 == 4) {
						multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "fourty ");
					} else if(((number % 1000) % 100)/10 == 5) {
						multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "fifty ");
					} else if(((number % 1000) % 100)/10 == 6) {
						multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "sixty ");
					} else if(((number % 1000) % 100)/10 == 7) {
						multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "seventy ");
					} else if(((number % 1000) % 100)/10 == 8) {
						multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "eighty ");
					} else if(((number % 1000) % 100)/10 == 9) {
						multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "ninety ");
					} else { multiArray[l][k][j][i] = (multiArray[l][k][j][i] +" "); }
				
					for (i = 0; i < 10; i++) {
							if((((number % 1000) % 100) % 10) == 0) {					
						} else if((((number % 1000) % 100) % 10) == 1) {
							multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "one ");
						} else if((((number % 1000) % 100) % 10) == 2) {
							multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "two ");
						} else if((((number % 1000) % 100) % 10) == 3) {
							multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "three ");
						} else if((((number % 1000) % 100) % 10) == 4) {
							multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "four ");
						} else if((((number % 1000) % 100) % 10) == 5) {
							multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "five ");
						} else if((((number % 1000) % 100) % 10) == 6) {
							multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "six ");
						} else if((((number % 1000) % 100) % 10) == 7) {
							multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "seven ");
						} else if((((number % 1000) % 100) % 10) == 8) {
							multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "eight ");
						} else if((((number % 1000) % 100) % 10) == 9) {
							multiArray[l][k][j][i] = (multiArray[l][k][j][i] + "nine ");
						} else { multiArray[l][k][j][i] = (multiArray[l][k][j][i] +" "); }
					}
				}
			}		
		}
		// Type more here,method level
		int thousands = number / 1000;
		int hundreds = (number % 1000)/100;
		int tens = ((number % 1000) % 100)/10;
		int ones= ((number % 1000) % 100) % 10;
		System.out.println(thousands);
		System.out.println(hundreds);
		System.out.println(tens);
		System.out.println(ones);
		System.out.println(multiArray[thousands][hundreds][tens][ones]);
		
		int m = 0;
		int n = 0;
		int o = 0;
		int p = 0;
		
		for (m = 0; m < 10; m++) {
			for (n = 0; n < 10; n++) {
				for (o = 0; o < 10; o++) {
					for (p = 0; p < 10; p++) {
						i = p;
						j = o;
						k = n;
						l = m;
						System.out.println(multiArray[i][j][k][l]);
					}
				}
			}			
		}
	}
	
}
