age=input ("enter your age")
food=["e","h","f","g"]
if age > 21:
    print ("bear for you")

else:
    print ("no bear for you")

print ("this is the orignal list",food)

for f in food[:2]:
    print ("opening the first two element and finding out there len")
    print(f)
    print(len(f))

#REMANING ONE:finding out to make the list like this operning first element "e" len "1"

food.append("i")
print ("appending 'i' in food",food)
food[:2] = ["m","y"]
print (food)

input ("enter to exit")
