class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (st.size() == 0 ||
                (st.peek() < 0 && asteroids[i] < 0) ||
                (st.peek() > 0 && asteroids[i] > 0) ||
                (st.peek() < 0 && asteroids[i] > 0)) {

                st.push(asteroids[i]);
                continue;
            }

            if (st.peek() > 0 && asteroids[i] < 0) {
                if (Math.abs(asteroids[i]) < st.peek()) {
                    continue;
                }

                if (Math.abs(asteroids[i]) == st.peek()) {
                    st.pop();
                    continue;
                }

                if (Math.abs(asteroids[i]) > st.peek()) {
                    while (!st.isEmpty() && st.peek() > 0 &&
                           Math.abs(asteroids[i]) > st.peek()) {
                        st.pop();
                    }

                    if (st.isEmpty() || st.peek() < 0) {
                        st.push(asteroids[i]);
                    } else if (Math.abs(asteroids[i]) == st.peek()) {
                        st.pop();
                    }
                }
            }
        }

        int a = st.size();
        int[] arr = new int[a];

        for (int i = a - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        return arr;
        
    }
}