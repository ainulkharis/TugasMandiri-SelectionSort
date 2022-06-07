import SelectionSort.SelectionSort;

public class Selection {

    public static void main(String[] args) {
        String[] mahasiswa = {"Shinta", "Jefri", "Oliv", "Surya", "Dani", "Winda"};

        System.out.println("\nNama Mahasiswa yang Belum Terurut : ");
        for (int i = 0; i < mahasiswa.length; i++){
            System.out.print(mahasiswa[i] + " ");
        }
        System.out.println(" ");

        SelectionSort data = new SelectionSort();
        data.setData(mahasiswa);
        data.SelectionSort();
        data.printData();
    }
}
