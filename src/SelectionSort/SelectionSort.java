package SelectionSort;

public class SelectionSort {

    private String[] data;

    public SelectionSort(){

    }

    public String[] getData() { return data; }

    public void setData(String[] data){
        this.data = data;
    }

    public void SelectionSort(){
        String small;
        int n = this.data.length;
        for (int a = 0; a < n-1; a++){
            int index = a;
            for (int b = a+1; b < n; b++){
                if (this.data[b].compareTo(this.data[index]) < 0){
                    small = this.data[b];
                    String temp = this.data[b];
                    this.data[b] = this.data[a];
                    this.data[a] = temp;
                }
            }
        }
    }

    public void printData(){
        System.out.println("\nNama Mahasiswa yang Sudah Terurut : ");
        for (int i = 0; i < this.data.length; i++){
            System.out.print(this.data[i] + " ");
        }
    }
}
