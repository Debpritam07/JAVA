T = int(input("Enter the total number of nuts and bolts: "))
N = int(input("Enter the number of nuts: "))
x = int(input("Enter the percentage of defective nuts: "))
y = int(input("Enter the percentage of defective bolts: "))

# Calculating the number of non-defective nuts and bolts
non_defective_nuts = int((100-x)/100 * N)
non_defective_bolts = int((100-y)/100 * (T-N))

# Calculating the percentage of non-defective items
percentage_non_defective = round(((non_defective_nuts + non_defective_bolts)/T) * 100, 2)

# Printing the result
print("The percentage of non-defective items in the bag is: {}%".format(percentage_non_defective))
