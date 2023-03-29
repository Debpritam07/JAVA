# Initialize an empty list to store the scores of ten colleges
college_scores = []

# Loop through the ten colleges to get their scores for each parameter
for i in range(1, 11):
    # Read the scores for facilities, academics, and infrastructure
    facilities_score = int(input(f"Read the scores for facilities for College {i}: "))
    academics_score = int(input(f"Read the scores for academics for College {i}: "))
    infrastructure_score = int(input(f"Read the scores for infrastructure for College {i}: "))

    # Calculate the total score for each college
    total_score = facilities_score + academics_score + infrastructure_score

    # Add the scores to the list of college scores
    college_scores.append([facilities_score, academics_score, infrastructure_score, total_score])

# Sort the college scores based on the total score in descending order
sorted_scores = sorted(college_scores, key=lambda x: x[3], reverse=True)

# Print the sorted scores
print("Total scores in descending order:")
for i in range(len(sorted_scores)):
    print(f"College {i+1}: {sorted_scores[i][3]}")
