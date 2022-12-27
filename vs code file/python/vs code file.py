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
    print(num1,"+",num2,"=",add(num1,num2))

elif function ==2 :
    print(num1,"-",num2,"=",subtract(num1, num2))

elif function ==3 :
    print(num1,"*",num2,"=", multiply(num1,num2)) 
elif function ==4 :
    print(num1,"+",num2,"=",divide(num1,num2))
else:
	print("Sahi dala kar time waste kar diya error=invalid input number choices char diye the chose kare le  rahe hai char se jyada pagal itna code likha phir ye sab karte ho sharam nahi ati english padhna nahi ata kya be kuch padh likh hi nahi pate he bail budhi agli kita to dekh")
