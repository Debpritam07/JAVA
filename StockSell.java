import java.util.Scanner;

class StockSell{
    public static void main(String[] args){
        int arr[];

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        StockSell ob= new StockSell();
        ob.stockProfit(arr);
    }

    public void stockProfit(int a[]){

        int minind=0,maxind=0;
        for(int i=0;i<a.length;i++){
            if(a[minind]>a[i]){
                minind=i;
            }
        }
        maxind= minind;
        for(int i=minind;i<a.length;i++){
            if(a[maxind]<a[i]){
                maxind=i;
            }
        }

        System.out.println("Best time to buy Stock is day "+(minind+1)+" and Sell on "+(maxind+1));
    }
}