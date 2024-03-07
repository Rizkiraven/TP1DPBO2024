/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Tugas Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// deklarasi kelas NPC yang merupakan child class dari kelas Karakter
class NPC extends Karakter
{
    private String item;
    private String misi;
    private String deskripsiMisi;

    public NPC()
    {
        this.item = "";
        this.misi = "";
        this.deskripsiMisi = "";
    }

    public NPC(String nama, String jenisKelamin, int hp, int atk, int level, String item, String misi, String deskripsiMisi)
    {
        super(nama, jenisKelamin, hp, atk, level);
        this.item = item;
        this.misi = misi;
        this.deskripsiMisi = deskripsiMisi;
    }

    public String getItem()
    {
        return item;
    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public String getMisi()
    {
        return misi;
    }

    public void setMisi(String misi)
    {
        this.misi = misi;
    }

    public String getDeskripsiMisi()
    {
        return deskripsiMisi;
    }

    public void setDeskripsiMisi(String deskripsiMisi)
    {
        this.deskripsiMisi = deskripsiMisi;
    }

    public void berjualan(Player player, Item item, int harga)
    {
        if (player.getKoin() >= harga)
        {
            System.out.println(this.getNama() + " menjual " + item.getNamaItem() + " kepada " + player.getNama() + " seharga " + harga + " koin.");
            player.addInventory(item);
            player.setKoin(player.getKoin() - harga);
        } 
        else
        {
            System.out.println(player.getNama() + " tidak memiliki koin yang cukup untuk membeli " + item.getNamaItem() + ".");
        }
    }
}