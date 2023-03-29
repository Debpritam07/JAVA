m1 = int(input("Enter the initial reading of the jug in ml: "))
m2 = int(input("Enter the level of water needed to drink in ml: "))
x = int(input("Enter the amount of ml the small pebble can raise the water level: "))
y = int(input("Enter the amount of ml the big pebble can raise the water level: "))
n = int(input("Enter the number of small pebbles: "))

water_level = m1
num_pebbles = 0

while water_level < m2 and n > 0:
    water_level += x
    n -= 1
    num_pebbles += 1

while water_level < m2:
    water_level += y
    num_pebbles += 1

print(f"The number of pebbles required to raise the water level to {m2} ml is {num_pebbles}.")
