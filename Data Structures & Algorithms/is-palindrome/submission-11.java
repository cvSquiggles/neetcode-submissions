class Solution 
{
    public boolean isPalindrome(String s) 
    {

        try
        {
            s = s.replaceAll(" ", "").strip().toLowerCase();
            if(s.length() < 1)
            {
                return true;
            }

            int frontPointer = 0;
            int backPointer = s.length() - 1;

            while(!Character.isLetterOrDigit(s.charAt(frontPointer)))
            {
                frontPointer++;
            }

            while(!Character.isLetterOrDigit(s.charAt(backPointer)))
            {
                backPointer--;
            }

            while(frontPointer < backPointer)
            {
                if(s.charAt(frontPointer) != s.charAt(backPointer))
                {
                    return false;
                }

                frontPointer++;
                while(!Character.isLetter(s.charAt(frontPointer)))
                {
                    frontPointer++;
                }

                backPointer--;
                while(!Character.isLetter(s.charAt(backPointer)))
                {
                    backPointer--;
                }
            }

            return true;
        }
        catch (Exception e)
        {
            return true;
        }
    }
}
