class util{
    static <T> void  printtwice(T value){
        System.out.println(value);
        System.out.println(value);

    }
    static <T>   T firstof(T a , T b){
        return  b;
    }
}

public class Gen3 {
    public static  void main(String[] args){
        util.printtwice("omkar");
        // System.out.println(util.firstof("hii", "hello"));
    }
    
}
