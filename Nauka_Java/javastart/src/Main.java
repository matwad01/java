class Main{
    public static void main(String[] args) {
        int a =10;
        Test.zwieksz(a);
        System.out.println(a);
    }
}

class Test{
    static void zwieksz(int liczba){
        liczba++;
    }
}