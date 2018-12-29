#!/usr/bin/python

number_list = [2,3,5,1,4]

max_num = number_list[0]
min_num = number_list[0]

for num in number_list:
    ## Find Max Number
    if max_num < num:
        max_num = num

    ## Find Min Number
    if min_num > num:
        min_num = num

print("Max Number: ",max_num)
print("min Number: ",min_num)
