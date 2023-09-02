 import java.util.Scanner;

public class Difference {
public static void main(String[] args) {
int[] a = {1, 9, 7, 8, 9, 3, 4};
int n = a.length;
int temp;
for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - 1 - i; j++) {
if (a[j] > a[j + 1]) {
// Swap a[j] and a[j+1]
temp = a[j];a[j] = a[j + 1];
a[j + 1] = temp; 
} 
}
}
System.out.println("Sorted Array:");
for (int i = 0; i < n; i++) {
System.out.print(a[i] + " ");
}
}
}