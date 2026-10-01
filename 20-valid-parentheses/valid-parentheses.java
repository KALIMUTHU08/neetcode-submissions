class Solution {
    public boolean isValid(String s) {
        int count =0 , sum =0 , cnt = 0;
        Stack<Character> stack = new Stack ();
        char[] a =  s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='('){
                stack.push('(');
                count++;
            }
            else if(a[i]==')'){
                if(count!=0){
                    if(stack.peek()=='('){
                        stack.pop();
                        count--;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else if(a[i]=='{'){
                stack.push('{');
                cnt++;
            }
            else if(a[i]=='}'){
                if(cnt!=0){
                    if(stack.peek()=='{'){
                        stack.pop();
                        cnt--;
                    }
                    else return false;
                }
                else return false;
            }
            else if(a[i]=='['){
                stack.push('[');
                sum++;
            }
            else if(a[i]==']'){
                if(sum!=0){
                    if(stack.peek()=='['){
                        stack.pop();
                        sum--;
                    }
                    else return false;
                }
                else return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}