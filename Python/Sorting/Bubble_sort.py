def Bubble_sort(arr):
    n= len(arr) # find length of arr

    for i in range(n-1,-1,-1): #starts from last index , stop before index -1, move backwards by 1
        for j in range (i):
            if arr[j] >arr[j+1]: # compare adjacent elements of arr
                arr[j], arr[j+1] = arr[j+1],arr[j] # swap the value of arr[j] with arr[j+1]
    print("Sorted array is: ", arr) 

arr = list(map(int,input("Enter the numbers separated by space: ").split()))  # split
Bubble_sort(arr)             