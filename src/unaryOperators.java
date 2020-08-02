public class unaryOperators {
    public static void main(String args[]){
        int x=10;
        System.out.println(x++);//10--->11
        System.out.println(++x);//12
        int y=20;
        boolean b=false;
        System.out.println(y--);//20--->19
        System.out.println(--y);//18
        System.out.println(y--+x++);//30
        System.out.println(--y+--x);//28

    }
}
