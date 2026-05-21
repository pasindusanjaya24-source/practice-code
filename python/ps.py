'''root = tk.Tk()
root.title("Tkinter App එකක්")


button = tk.Button(root, text="මාව Click කරන්න")
button.pack()

root.mainloop()'''

with open("shop_items.txt","w")as f:
  f.write(f"soap:{100}\n")
  f.write(f"toothpaste:{130}\n")
  f.write(f"biscut:{254}\n")
total=0

try:
  with open("shop_items.txt","r")as e:
    for i in e:
     part=i.split(":")
     try: 
      price=float(part[1])
      item=str(part[0])
      total+=price
      print(f"{item} : {price}")
     except ValueError:
      print("value error!")

except FileNotFoundError:
  print("can't find file!")

print(f"total prize is: {total}")  

#new question anwser
with open("student_time.txt","w")as d:
  d.write(f"amal,10:00AM\n")
  d.write(f"nimal,10:15AM\n")
  d.write(f"amal,11:35AM\n")
  d.write(f"sunil,12:00PM\n")
  d.write(f"nimal,12:23PM\n")
  d.write(f"amal,01:00PM\n")
total_count=0

try:
  with open("student_time.txt","r")as o:
    for y in o:
      p=y.split(",")
      name=str(p[0])
      if (name=="amal"):
        total_count+=1
except FileNotFoundError:
  print("can't found file!\n")        
print(f"amal is entered {total_count} time")  

#next question 

with open("grades.txt","w")as d:
  d.write("kasun:45\n")
  d.write("nimal:42\n")
  d.write("ruwan:78\n")
  d.write("kamani:60\n")
def  check_grades():
  try:
    with open("grades.txt","r")as g:
      for i in g:
        part1=i.split(":")
        try:
          names=str (part1[0])
          values=int (part1[1])
          if(values>=75):
            print(f"{names} is passed!")
          else:
            print(f"{names} is not passed!")
        except ValueError:
          print("value error!")
  except FileNotFoundError:
    print("file is not founded!")              
  return()
check_grades()
import tkinter as tk

