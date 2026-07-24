class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;

        Stack<Integer> st = new Stack<>();

        for(int ast: asteroids){

            // -ve ast
            while(!st.isEmpty() && (ast < 0 && st.peek() > 0) && -(ast) > st.peek()){
                st.pop();
            }
            
            if(!st.isEmpty() && ast < 0 && st.peek() > 0 ){

                // -ve ast and smaller
                if( -(ast) < st.peek()){
                    continue;
                }

                // -ve ast and eq
                else if( -(ast) == st.peek()){
                    st.pop();
                }
            }

            else st.push(ast);
        }
        
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;

    }
}


// 10  -5  = 10
// -5  10  = 10

// -10  5  = -10 5
// 5   -10 = -10

// 5  -5   = _
// -5  5   = _



// [5,10,-5]
// [8,-8]