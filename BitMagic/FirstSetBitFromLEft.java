package BitMagic;

public class FirstSetBitFromLEft {
	public static int getFirstSetBit(int n){
        
        if(n==0)
            return 0;
        int k=1;
    while(true){
        if((n&(1<<k-1))==0)
            k++;
        else
            return k;
    }

}
}