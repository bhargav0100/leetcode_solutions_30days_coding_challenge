class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>stack=new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(0);
            }
            else
            {
                int sum=0;
                while(stack.peek()!=0)
                {
                    sum+=stack.pop();
                }
                if(sum!=0)
                {
                    sum*=2;
                    stack.pop();
                    stack.push(sum);
                }
                else 
                {
                    stack.pop();
                    stack.push(1);
                }
            }
        }
        int score=0;
        while(!stack.isEmpty())
        {
            score+=stack.pop();
        }
        return score;
    }
}