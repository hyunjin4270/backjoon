array: list = []
grade: float = 0.0
majoravg: float = 0.0
total_credits: float = 0.0

dictionary = {
    'A+': 4.5, 'A0': 4.0,
    'B+': 3.5, 'B0': 3.0,
    'C+': 2.5, 'C0': 2.0,
    'D+': 1.5, 'D0': 1.0,
    'F':0.0
}

# 입력을 2차원 배열로 교체
for i in range(20):       
    addarray = list(input().split())
    addarray[1] = float(addarray[1])
    array.append(addarray)
    
for i in range(len(array)):
    if array[i][-1] == 'P':
        continue
    elif array[i][-1] in dictionary:
        majoravg = dictionary[array[i][-1]]
        credit = array[i][1]
        grade += majoravg * credit
        total_credits += credit

if total_credits != 0:
    result = grade / total_credits
else:
    result = 0
    
print(f'{result:.6f}',)