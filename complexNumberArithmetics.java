import java.util.*; //Importing all members from java.util package.
class complex
{
	float real;
	float img;

	complex() //Default constructor.
	{
		this.real = 0;
		this.img = 0;
	}

	complex(float i, float j) //Parameterized constructor.
	{
		this.real = i;
		this.img = j;
	}

	void add(complex c1, complex c2) //Addition.
	{
		complex c3 = new complex();
		c3.real = (c1.real + c2.real);
		c3.img = (c1.img + c2.img);
		System.out.println("Addition of the complex numbers is: " + c3.real + "+" + c3.img + "i");
	}

	void sub(complex c1, complex c2) //Subtraction.
	{
		complex c3 = new complex();
		c3.real = (c1.real - c2.real);
		c3.img = (c1.img - c2.img);
		System.out.println("Subtraction of the complex numbers is: " + c3.real + "+" + c3.img + "i");
	}

	void mult(complex c1, complex c2) //Mltiplication.
	{
		complex c3 = new complex();
		c3.real= ((c1.real * c2.real) - (c1.img * c2.img));
		c3.img = ((c1.real * c2.img) + (c2.real * c1.img));
		System.out.println("Multiplication of the complex numbers is: " + c3.real + "+" + c3.img + "i");
	}

	void div(complex c1, complex c2) //Division.
	{
		complex c3 = new complex();
		c3.real = (((c1.real * c2.real) - (c1.img * c2.img))/((c2.real* c2.real) + (c2.img * c2.img)));
		c3.img = (((c2.real * c1.img) + (c1.real * c2.img))/((c2.real * c2.real) + (c2.img * c2.img)));
		System.out.println("Division of the complex numbers is: " + c3.real + "+" + c3.img + "i");
	}
}

class MainComplex //Main class.
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	complex c1 = new complex();
	System.out.println("Enter 1st REAL number here: \n");
	c1.real = sc.nextFloat();
	System.out.println("Enter 1st IMAGINARY number here: \n");
	c1.img = sc.nextFloat();

	System.out.println("Enter 2nd REAL number here: \n");
	float num1 = sc.nextFloat();
	System.out.println("Enter 2nd IMAGINARY number here: \n");
	float num2 = sc.nextFloat();
	complex c2 = new complex(num1, num2);
	complex c3 = new complex();
	System.out.println("Your 1st COMPLEX number is: " + c1.real + "+"+ c1.img + "i \n");
	System.out.println("Your 2nd COMPLEX number is: " + c2.real + "+"+ c2.img + "i \n");

	int ch;
	do //Do-while loop for repeating the menu options.
	{
	System.out.println("\nMenu: \n");
	System.out.println("1.Type 1 for Addition. \n2.Type 2 for Subtraction. \n3.Type 3 for Multiplication. \n4.Type 4 for Division. \n");
	ch = sc.nextInt();

	switch(ch) //Switch case for performing different operations.
	{
		case 1: c3.add(c1,c2);
		break;

		case 2: c3.sub(c1,c2);
		break;

		case 3: c3.mult(c1,c2);
		break;

		case 4: c3.div(c1,c2);
		break;
		
		default:
		System.out.println("Invalid operation.");
	}
	}while (ch != 5);
	}
} //Code ends here.