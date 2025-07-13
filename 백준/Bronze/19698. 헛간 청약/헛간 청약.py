n, w, h, l = map(int, input().split())
ww = w // l
hh = h // l
print(min(n, ww * hh))