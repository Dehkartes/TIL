R, C, CCTV = map(int, input().split())
r_temp = R // CCTV
r_count = r_temp + 1 if R % CCTV != 0 else r_temp
c_temp = C // CCTV
c_count = c_temp + 1 if C % CCTV != 0 else c_temp
print(r_count * c_count)