package livroJAVA.capitulo5;

import livroJAVA.capitulo3.Account;

public class Som {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 2; i <= 20; i += 2){
            total += i;
        }

        System.out.printf("Total = %d", total);
    }
}
