/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Tugas Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

public class Item
{
    private String namaItem;
    private String deskripsi;
    private int value;

    // Konstruktor
    public Item(String namaItem, String deskripsi, int value)
    {
        this.namaItem = namaItem;
        this.deskripsi = deskripsi;
        this.value = value;
    }

    // Getter dan setter
    public String getNamaItem()
    {
        return namaItem;
    }

    public void setNamaItem(String namaItem)
    {
        this.namaItem = namaItem;
    }

    public String getDeskripsi()
    {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
}
