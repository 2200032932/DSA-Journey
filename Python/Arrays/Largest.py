def Largest(arr,n):
    max=arr[0]
    for i in range(1,n):
       if max<arr[i]:
        max=arr[i]
    return max

arr=list(map(int,input("Enter array elements:").split()))
n=len(arr)  
print("Largest element in the array is:",Largest(arr,n))