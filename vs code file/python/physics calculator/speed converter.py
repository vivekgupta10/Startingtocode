print ("Hello This is a kilometer per hour to meter per second calculator")
print("How to use this calculator?")
print("Select Which type of conversion you want")
print("If you select 1st opiton enter the km/h value and you get your answer in m/s")
print ("If you select 2nd option enter the m/s value and your get your answer in km/h")
print ("  ")
print("Select the function from the following options")
print("1.kilometer per hour to meter per second")
print("2.meter per second to kilometer per hour")
F = input("which function do you want >>> ")
a = input("Enter the value:")
if F ==1:
    print ((a*5)/18.0)

if F== 2:
    print ((a*18)/5.0)

else:
    print ("invalid selection")


input('press enter to exit from this python file')
exit()
