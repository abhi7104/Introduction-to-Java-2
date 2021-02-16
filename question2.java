public class question2 {
    public static void main(String[] args) {
        String str="xyzabc";
        char temp;
        System.out.println(str);
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (char i : arr)
            System.out.println(i);
    }
}
