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
def get_number(promptmassage):
    while True:
        num_str=input(promptmassage).strip()
        if '#' in num_str:
            return -1 
        if '$' in num_str:
            return 0
        try:
            return float(num_str)
        except ValueError:
            print("Not a valid number,please enter again")          

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
    num1=get_number("Enter First Number: ")
    if num1 == -1: 
        return -1
    if num1 == 0:
        return 0    

#get 2nd input for calculate
    num2=get_number("Enter Second Number: ")
    if num2 == -1: 
        return -1
    if num2 == 0:
        return 0    
    
        
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

#This is the main loop. It covers Task 1 (Section 1)

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
    print("Done. Terminating")   #program ends here
    exit()

