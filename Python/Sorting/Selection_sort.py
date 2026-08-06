def Selection_sort(arr):
     
    n = len(arr)   # find length of arr
    for i in range(n): # iterate and find the min in the array
        min_index = i  # i = 0
        for j in range(i+1, n): # i+1 = 1 iterate from 1 to n
            if arr[j] <arr[min_index]:  # compare the value of arr[j] with arr[min_index]
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]  # swap the value of arr[i] with arr[min_index]

    print("Sorted array is: ", arr)   

arr =list(map(int ,input("Enter the numbers separated by space: ").split()))
Selection_sort(arr)            