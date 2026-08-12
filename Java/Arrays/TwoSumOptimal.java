
import java.util.*;

class TwoSumOptimal {

    // =========================================================
    // OPTIMAL APPROACH - HASHMAP
    // Time  : O(n) average
    // Space : O(n)
    // =========================================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input:
        // Enter the size of the array:
        // 5
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Input:
        // Enter the elements of the array:
        // 2 6 5 8 11
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input:
        // Enter the target:
        // 14
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        // HashMap stores:
        // Key   -> array element
        // Value -> index of that element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < n; i++) {

            // Find the number required to make target
            int required = target - arr[i];

            // Check if required number already exists
            if (map.containsKey(required)) {

                // map.get(required) gives the index
                // of the required number
                System.out.println(
                    "Indices: " + map.get(required) + ", " + i
                );

                return;
            }

            // Store current element and its index
            map.put(arr[i], i);
        }

        System.out.println("No pair found");

        sc.close();
    }
}


/*
===============================================================
                BRUTE FORCE APPROACH
===============================================================

Time  : O(n²)
Space : O(1)

class TwoSumBrute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input:
        // Enter the size of the array:
        // 5
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Input:
        // Enter the elements of the array:
        // 2 6 5 8 11
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input:
        // Enter the target:
        // 14
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        // First loop selects the first element
        for (int left = 0; left < n; left++) {

            // Second loop selects the second element
            // Start from left + 1 so we don't use
            // the same element twice
            for (int right = left + 1; right < n; right++) {

                // Calculate the sum of the two elements
                int sum = arr[left] + arr[right];

                // Check if sum equals target
                if (sum == target) {

                    // Output:
                    // Indices: 1, 3
                    System.out.println(
                        "Indices: " + left + ", " + right
                    );

                    return;
                }
            }
        }

        // Output if no pair exists
        System.out.println("No pair found");

        sc.close();
    }
}


===============================================================
                    SAMPLE INPUT
===============================================================

5
2 6 5 8 11
14


===============================================================
                    SAMPLE OUTPUT
===============================================================

Indices: 1, 3


===============================================================
                  COMPLEXITY COMPARISON
===============================================================

Brute Force:
    Time  -> O(n²)
    Space -> O(1)

Optimal HashMap:
    Time  -> O(n) average
    Space -> O(n)

===============================================================
*/