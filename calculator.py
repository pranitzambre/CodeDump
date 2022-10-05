def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    return x / y

print("#Menu: ")
print("1. Type 1 for Addition.")
print("2. Type 2 for Subtraction.")
print("3. Type 3 for Multiplication.")
print("4. Type 4 for Division.")

#Code by Pranit Zambre.

while 1:
    choice = input("Enter your choice: \n")

    if choice not in ('1', '2', '3', '4'):
        print("Choose a valid input. \n")

    else:
        P = float(input("Enter first number: \n"))
        Z = float(input("Enter second number: \n"))

        if choice == '1':
            print("=", add(P, Z), "\n")

        elif choice == '2':
            print("=", subtract(P, Z), "\n")

        elif choice == '3':
            print("=", multiply(P, Z), "\n")

        elif choice == '4':
            print("=", divide(P, Z), "\n")

        performAgain = input("Would you like do perform another calculation:(Yes/No) \n")
        if performAgain == "No":
            break;
        if performAgain == "no":
            break;