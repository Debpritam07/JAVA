# Read the number of 'S' grades, attendance, and sports activity participation
num_s_grades = int(input("Enter the number of 'S' grades: "))
attendance = int(input("Enter the attendance percentage: "))
sports_participation = int(input("Enter the number of sports activities participated in: "))

# Check for invalid input
if num_s_grades < 0 or attendance < 0 or attendance > 100 or sports_participation < 0:
    print("Invalid input")
else:
    # Check the appreciation level based on the given conditions
    if num_s_grades >= 3 and attendance >= 90 and sports_participation >= 2:
        print("Excellent")
    elif num_s_grades >= 3 and attendance >= 90:
        print("Very Good")
    elif num_s_grades >= 3 and sports_participation >= 2:
        print("Good")
    else:
        print("No appreciation")
