public class FirstBadVersion278 {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    boolean isBadVersion(int version) {
        return version >= 1;
    }

    public static void main(String[] args) {
        FirstBadVersion278 fb = new FirstBadVersion278();
        System.out.println(fb.firstBadVersion(0));
    }
}
