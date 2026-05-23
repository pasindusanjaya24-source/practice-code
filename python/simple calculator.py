def add(a,b):
    return(a+b)
def substract(a,b):
    return a-b 
def multiply(a,b):
    return a*b 
def divide(a,b):
    try:
        return a/b 
    except ZeroDivisionError as e:
        print(e)
        return None
def power(a,b):
    return a**b
def remainder(a,b):
    try:
        return a%b
    except ZeroDivisionError as e:
        print(e)
        return None


#-------------------------------------
#TODO: Write the select_op(choice) function here
#This function sould cover Task 1 (Section 2) and Task 3
def select_op(choice):
    if '#' in choice:
        return -1
    if '$' in choice:
        return 0
    if choice not in ['+', '-', '*', '/', '^', '%']:
        print("Unrecognized operation")
        return 0
#get 1st input for calculate
    while True:
        num1_str=input("Enter first number: ").strip()
        if '#' in num1_str:
            return -1 
        if '$' in num1_str:
            return 0
        try:
            num1=float(num1_str)
            break
        except ValueError:
            print("Not a valid number,please enter again")  
#get 2nd input for calculate
    while True:
        num2_str=input("Enter second number: ").strip()
        if '#' in num2_str:
            return -1 
        if '$' in num2_str:
            return 0
        try:
            num2=float(num2_str)
            break
        except ValueError:
            print("Not a valid number,please enter again")  
        
    if choice == "+":
        result=add(num1,num2)
    elif choice =="-":
        result=substract(num1,num2)
    elif choice == "*":
        result=multiply(num1,num2)
    elif choice == "/":
        result=divide(num1,num2)
    elif choice == "^":
        result=power(num1,num2)
    elif choice == "%":
        result=remainder(num1,num2)
    print(f"{num1} {choice} {num2} = {result}")
    return 0                        

#End the select_op(choice) function here
#-------------------------------------
#This is the main loop. It covers Task 1 (Section 1)
#YOU DO NOT NEED TO CHANGE ANYTHING BELOW THIS LINE
while True:
  print("Select operation.")
  print("1.Add      : + ")
  print("2.Subtract : - ")
  print("3.Multiply : * ")
  print("4.Divide   : / ")
  print("5.Power    : ^ ")
  print("6.Remainder: % ")
  print("7.Terminate: # ")
  print("8.Reset    : $ ")
  

  # take input from the user
  choice = input("Enter choice(+,-,*,/,^,%,#,$): ")
  print(choice)
  if(select_op(choice) == -1):
    #program ends here
    print("Done. Terminating")
    exit()

