public class Main {
    public static void main(String[] args) {
        //task 1

        int d = -1;
        while (d<10){
            d=d+1;
            System.out.print(d + " ");}
        System.out.println();

        for (int f = 10; f >= 0; f=f-1) {
            System.out.print(f +" ");
        }
        System.out.println();
        System.out.println();

        //task 2

        int friday = 1;
        int end = 31;
        for (int i = friday; i<=end; i = i + 7){
            System.out.println("Cегодня пятница, " + i + "-е число, не забудь подготовить недельный отчет.");
        }
        System.out.println();

        // task 3
        int period = 79;
        int begin = 1822;
        int conclusion = 2122;
        for (int i = 0; i <= conclusion; i = i + period){
            if (i >= begin && i <= conclusion)
                System.out.println(i);
        }
    }
}