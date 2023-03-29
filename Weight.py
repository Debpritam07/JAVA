weight_pounds = float(input("Enter weight in pounds: "))
height_inches = float(input("Enter height in inches: "))

weight_kg = weight_pounds * 0.4536
height_m = height_inches / 39.37

bmi = weight_kg / (height_m * height_m)

print("Your BMI is: {:.2f}".format(bmi))
