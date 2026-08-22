bool isPalindrome(int x) {
    if (x<0)
    return false;

    long rev = 0;
    int i=x;
    while(i!=0)
    {
        int digit = i%10;
        rev= (rev*10)+digit;
        i=i/10;
    }
    return (rev==x);
}