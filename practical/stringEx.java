class stringEx
{
    public static void main(String [] args)
    {
        String str="Computer";
        System.out.println("original string is :  "+str);
        String newStr=str.toUpperCase();
        System.out.println("the string converted into upper case:  "+newStr);
          String newStr1=str.toLowerCase();
        System.out.println("the string converted into lower case:  "+newStr1);
        String newStr2=str.replace('o','u');
        System.out.println("the string with replacing one character :"+newStr2);
        String str2="computer";
        if (str.equals(str2))
        {
            System.out.println("string "+str+"  and "+str2+"  are same......");
        }
        else
        {
            System.out.println("string "+str+"  and "+str2+"   are not same...");
        }
         System.out.println("comparison by ignoring case of strings...");  
         if (str.equalsIgnoreCase(str2))
        {
            System.out.println("string "+str+"  and "+str2+"  are same......");
        }
        else
        {
            System.out.println("string "+str+"  and "+str2+"   are not same...");
        }
        System.out.println("length of str is:   "+str.length());
        System.out.println("the character at place 3 from   "+str +" is  "+str.charAt(3));
         String str1=str.concat("Engineer");
        System.out.println("the string after concatenation is  :"+str1);
     }
}