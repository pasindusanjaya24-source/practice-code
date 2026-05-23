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
        return
def power(a,b):
    return a**b
def remainder(a,b):
    try:
        return a%b
    except ZeroDivisionError as e:
        print(e)
        return
                        

#-------------------------------------
#TODO: Write the select_op(choice) function here
#This function sould cover Task 1 (Section 2) and Task 3

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

