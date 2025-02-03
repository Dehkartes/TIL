def solution(my_string):
	d = [0 for _ in range(52)]
	
	for i in my_string:
		x = ord("A") if ord(i) < ord("a") else ord("a") - 26
		print(i, ord(i) - x)
		d[ord(i) - x] += 1
		
	return d