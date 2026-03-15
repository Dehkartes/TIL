n, m, k = map(int, input().split())

f_group =  n // 2
team = min(f_group, m)

f_remain = n - (team * 2)
m_remain = m - team

intern = max(k - f_remain - m_remain, 0)

team = team - (intern // 3) - (1 if intern % 3 != 0 else 0)

print(team)