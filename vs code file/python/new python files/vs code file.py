def add(num1, num2):
	return num1 + num2
def subtract(num1, num2):
	return num1 - num2
def multiply(num1, num2):
	return num1 * num2
def divide(num1, num2):
	return num1 / num2

print ("lets start the calculater")
print("Select the operation")
print ("1. Add")
print ("2. subtract")
print ("3. multiply")
print ("4. divide")
function = int(input("select input from following options"))
num1 = int(input("input 1st number"))
num2 = int(input("enter second number"))
if function == 1:
    print(add(num1,num2))

elif function ==2 :
    print(subtract(num1, num2))

elif function ==3 :
    print( multiply(num1,num2)) 
elif function ==4 :
    print(divide(num1,num2))
else:
	print("invalid choice")

	
	
