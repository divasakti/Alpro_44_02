public class ch04 {

    public static void main (String[] args){
        int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        // a. Menampilkan semua nilai di dalam array
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        // b. Mencari sebuah angka dalam array
        int cari = 41;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cari){
                System.out.print(cari+" ada di indeks ke-"+i);
            }
        }
        System.out.println();
        // c. Menampilkan angka ganjil
        for(int i : arr){
            if (i % 2 == 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // d. Menampilkan angka kelipatan 3
        for (int i : arr) {
            if (i % 3 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // e. Menampilkan angka yang memiliki angka 2 dalam array
        for (int i : arr) {
            if (i % 10 == 2 || i == 2){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // f. Menampilkan angka ganjil yang diapit oleh angka genap
        for (int i = 0; i < arr.length; i++) {
            if (i+2 < arr.length ){
                int a = arr[i];
                int b = arr[i+1];
                int c = arr[i+2];
                if (a % 2 == 0 && b % 2 == 1 && c % 2 == 0){
                    System.out.print(b+" ");
                }
            }
        }
        System.out.println();
        // g. Menampilkan angka kelipatan 5, yang sebelumnya juga kelipatan 5
        for (int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length){
                int a = arr[i];
                int b = arr[i+1];
                if (a % 5 == 0 && b % 5 == 0){
                    System.out.print(b+" ");
                }
            }

        }
        System.out.println();
        // h. Menghitung jumlah angka di dalam array
        int temp = 0;
        for (int i : arr){
            temp = temp + i;
        }
        System.out.print(temp+" total dari jumlah angka "+arr.length);
        System.out.println();
        // i. Menampilkan selisih angka dengan angka setelahnya
        int temp_selisih = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length){
                int selisih = arr[i] - (arr[i+1]);
                if (selisih < 0){
                    selisih = selisih * -1;
                }
                System.out.print(selisih+" ");
                temp_selisih = temp_selisih + selisih;
            }
        }
        System.out.println();
        // j. Menampilkan selisih angka-angka genap, dengan angka genap setelahnya
        for (int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length){
                int a = arr[i];
                int b = arr[i+1];
                if (a % 2 == 0 && b % 2 == 0){
                    int selisih = a - b;
                    if (selisih < 0){
                        selisih = selisih * -1;
                    }
                    System.out.print(selisih+"("+a+"-"+b+") ");
                }
            }
        }
        System.out.println();
        // k. Menampilkan angka yang setelahnya bernilai besar
        for (int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length){
                int selisih = arr[i] - (arr[i+1]);
                if (selisih < 0){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println();
        // l. Menampilkan jumlah angka dengan angka setelahnya, hasil jumlah genap
        for (int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length){
                int a = arr[i];
                int b = arr[i+1];
                int jumlah = a+b;
                if (jumlah % 2 == 0){
                    System.out.print(jumlah+"("+a+"+"+b+") ");
                }
            }
        }
        System.out.println();
        // m. Menghitung jumlah angka selisih
        System.out.print(temp_selisih+" ");
        System.out.println();
        // n. Menampilkan jumlah angka
        int jumlah = 0;
        for (int i : arr){
            System.out.print(i+" ");
            jumlah = jumlah + i;
        }
        System.out.print("= "+jumlah);

    }
}
