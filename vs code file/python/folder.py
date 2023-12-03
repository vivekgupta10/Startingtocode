import subprocess

subprocess.run("rm -r output/*") #to clear the folder

a = int(input("Enter how many folder you want to create "))
b = int(input("Enter how many files you want to create "))

print("Starting creation of file")

for m in range(a):

    x = "output/"+str(m)
    subprocess.run(["mkdir",x], check=True)

    for i in range(b):
        y = "output/"+str(m)+('/')+str(i)+".txt"
        subprocess.run(["touch",y],check=True)

print("operation completed successfully")
