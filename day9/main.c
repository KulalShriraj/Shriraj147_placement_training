#include <stdio.h>

int decimal(int num) {
    int base = 1, rem, dec = 0;
    while (num > 0) {
        rem = num % 10;
        dec = dec + rem * base;
        base = base * 2;
        num /= 10;
    }
    return dec;
}

int maxel(int arr[], int size) {
    int max = arr[0], i;
    for (i = 1; i < size; i++) {
        if (arr[i] > max)
            max = arr[i];
    }
    return max;
}

void calculate_the_maximum(int n, int k) {
    int max_and = 0, max_or = 0, max_xor = 0;

    for (int i = 1; i <= n; i++) {
        for (int j = i + 1; j <= n; j++) {
            int and_result = i & j;
            int or_result = i | j;
            int xor_result = i ^ j;

            if (and_result < k && and_result > max_and) {
                max_and = and_result;
            }

            if (or_result < k && or_result > max_or) {
                max_or = or_result;
            }

            if (xor_result < k && xor_result > max_xor) {
                max_xor = xor_result;
            }
        }
    }

    printf("%d\n%d\n%d", max_and, max_or, max_xor);
}

int main() {
    int n, k;
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
    return 0;
}
