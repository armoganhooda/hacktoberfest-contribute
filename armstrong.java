class armstrong;
{
  public static void main(string ar[]);
  {
    int i,j, sum=0,k;
    i=153;
    for(k=i;i!=0; )
    {
      j=i%10;
      sum=sum+j*j*j;
      i=i/10;
    }
    i=k;
    if(sum==i)
    {
      System.out.println("Armstrong number");
    }
    else
    {
      System.out.println("Not Armstrong number");
    }
  }
}
