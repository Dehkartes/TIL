while True:
	name, age, weight = input().split()
	if name == '#' and age == '0' and weight == '0':
		break

	age = int(age)
	weight = int(weight)

	print(name, 'Junior' if (age < 18 and weight < 80) else 'Senior')