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
            System.out.println(s);

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

            System.out.println("frontPointer and letter: " + frontPointer + " -- " + s.charAt(frontPointer) + " backPointer and letter: " + backPointer + " -- " + s.charAt(backPointer));

            while(frontPointer < backPointer)
            {
                System.out.println("frontPointer: " + frontPointer + " backPointer: " + backPointer);

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

                System.out.println("frontPointer letter: " + s.charAt(frontPointer) + " backPointer letter: " + s.charAt(backPointer));
            }

            return true;
        }
        catch (Exception e)
        {
            System.out.println("wtf?");
            return true;
        }
    }
}
