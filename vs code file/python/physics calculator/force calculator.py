print("Welcome to force calculator python pogram ")
print("How to use this progarm?")
print("First select which values do you have")
print("Then fill the information in each box respectively")
print("After you fill all the required information you will get your answer")
print("After you finish press enter to exit from the calculator")

print("Which values do you have")
print("1. mass and accelaration")
print ("2. mass,initial velocity, final velocity and accelaration")
a = int(input("input the value>>> "))

if a==1:
    m = int(input("enter the mass in >>> "))
    a = int(input("enter the accelaration>>> "))
    print(m*a , "N")

elif a==2:
    u = int(input("Enter initial velocity in m/s>>> "))
    v = int(input("Enter final velocity in m/s>>> "))
    t = float(int(input("Enter the time in s>>> ")))
    M = int(input("Enter the mass in kg>>> "))
    print (M*(v-u)/t)

else:
    print ('wrong selection')

input("Enter to exit")
exit()



