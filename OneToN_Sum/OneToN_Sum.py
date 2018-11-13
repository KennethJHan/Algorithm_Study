def oneToN(num):
    sum_val = 0
    for i in range(1, num+1, 1):
        sum_val += i
    return sum_val

print(oneToN(10))  ## 55
