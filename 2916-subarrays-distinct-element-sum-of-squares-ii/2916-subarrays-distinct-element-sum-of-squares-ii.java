
import java.util.*;

class Solution {
    static final long MOD = 1_000_000_007L;

    int n;
    long[] sum, squareSum, lazy;

    void apply(int node, int l, int r, long val) {
        long len = r - l + 1L;

        squareSum[node] = (
            squareSum[node] + 2L * val * sum[node]
            + val * val % MOD * len
        ) % MOD;

        sum[node] = (sum[node] + val * len) % MOD;
        lazy[node] = (lazy[node] + val) % MOD;
    }

    void push(int node, int l, int r) {
        if (lazy[node] == 0 || l == r) return;

        int mid = (l + r) / 2;
        apply(node * 2, l, mid, lazy[node]);
        apply(node * 2 + 1, mid + 1, r, lazy[node]);
        lazy[node] = 0;
    }

    void update(int node, int l, int r, int ql, int qr) {
        if (ql > r || qr < l) return;

        if (ql <= l && r <= qr) {
            apply(node, l, r, 1);
            return;
        }

        push(node, l, r);

        int mid = (l + r) / 2;
        update(node * 2, l, mid, ql, qr);
        update(node * 2 + 1, mid + 1, r, ql, qr);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        squareSum[node] = (
            squareSum[node * 2] + squareSum[node * 2 + 1]
        ) % MOD;
    }

    public int sumCounts(int[] nums) {
        n = nums.length;

        sum = new long[4 * n + 5];
        squareSum = new long[4 * n + 5];
        lazy = new long[4 * n + 5];

        Map<Integer, Integer> last = new HashMap<>();
        long ans = 0;

        for (int r = 0; r < n; r++) {
            int x = nums[r];
            int prev = last.getOrDefault(x, -1);

            update(1, 0, n - 1, prev + 1, r);

            last.put(x, r);
            ans = (ans + squareSum[1]) % MOD;
        }

        return (int) ans;
    }
}
