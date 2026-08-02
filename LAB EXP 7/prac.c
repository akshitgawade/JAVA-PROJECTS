#include <stdbool.h>

// Modifies 'out' with the two indices, returns true if found
bool twoSum(int* nums, int numsSize, int target, int* out) {
    for (int i = 0; i < numsSize - 1; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target) {
                out[0] = i;
                out[1] = j;
                return true;
            }
        }
    }
    return false;
}