# Helper Function for Sorting
def takeSecond(elem):
    return elem[1]

# Read File
with open("Data_Stars.txt") as f:
    rawContent = f.readlines()
rawContent = [x.strip() for x in rawContent]

# Create List of (StarName,Distance)-Pairs
stars 	= []
for line in rawContent:
	parts = line.split(":")
	element = [parts[0], float(parts[1])]
	stars.append(element)

# Print out results
print("Before Sorting")
for i in range(0,9):
		print(stars[i])

# Sort via the second item in the List
stars.sort(key=takeSecond)

# Print out results
print("After Sorting")
for i in range(0,9):
	print(stars[i])
