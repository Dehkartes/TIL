def solution(s):
	if len(s) == 1:
		return 1

	strList = []
	mn = 1000
	for i in range(1, len(s)//2 + 1):
		start = 0
		while start < len(s):
			strList.append(s[start : start + i])
			start = start + i

		text = ""
		cur = 0
		cnt = 1
		for j in range(1, len(strList)):
			if strList[cur] == strList[j]:
				cnt += 1
			else:
				tmp = cnt if cnt > 1 else ""
				text += f"{tmp}{strList[cur]}"
				cur = cur + cnt
				cnt = 1
		tmp = cnt if cnt > 1 else ""
		text += f"{tmp}{strList[cur]}"
		if len(text) < mn:
			mn = len(text)
		strList = []
	return mn