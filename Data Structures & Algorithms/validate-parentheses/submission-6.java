class Solution {
    public boolean isValid(String s) {
        HashSet<Character> openers = new HashSet<Character>();
        openers.add('[');
        openers.add('{');
        openers.add('(');

        HashSet<Character> closers = new HashSet<Character>();
        closers.add(']');
        closers.add('}');
        closers.add(')');

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');

        LinkedList<Character> stack = new LinkedList<>();

        int i = 0;
        while(i < s.length())
        {
            Character targetChar = s.charAt(i);
            if(stack.isEmpty())
            {
                if(openers.contains(targetChar))
                {
                    stack.push(targetChar);
                }
                else
                {
                    return false;
                }
            }
            else if(closers.contains(targetChar))
            {
                if(targetChar == map.get(stack.peek()))
                {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else if(openers.contains(targetChar))
            {
                stack.push(targetChar);
            }

            i++;
        }

        return stack.isEmpty();
    }
}
