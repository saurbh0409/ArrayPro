class Sorting
{
  public static void main(String s[])
    {
       int a[]={45,78,58,1,24,5,8,6,88};
       int i,j,temp=0,ii;

       for(i=0;i<a.length;i++)
         {

             for(j=0;j<a.length-1;j++)
                {
                 if(a[j]>a[j+1])
                  {
                  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                  }  
                }
         }
       for(ii=0;ii<a.length;ii++)
         {

        System.out.println(a[ii]);
         }
    }
}