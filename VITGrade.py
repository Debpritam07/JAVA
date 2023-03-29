# function to calculate grade based on deviation from class average
def calculateGrade(mark, class_avg):
    deviation = mark - class_avg
    if deviation >= 20:
        return 'S'
    elif deviation >= 10:
        return 'A'
    elif deviation >= -5 and deviation <= 5:
        return 'B'
    elif deviation <= 10:
        return 'C'
    elif deviation <= 15:
        return 'D'
    else:
        return 'F'

# main program
mark = int(input("Enter the marks secured by the student: "))
class_avg = int(input("Enter the average marks of the class: "))
grade = calculateGrade(mark, class_avg)
print("The grade secured by the student is:", grade)
