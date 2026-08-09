def isSorted(arr,n):
    for i in range(1,n):
        if arr[i]<arr[i-1]:
            return False
    return True

arr=list(map(int,input("Enter array elements:").split()))
n=len(arr)
print("The array is sorted:", isSorted(arr, n))