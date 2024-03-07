/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Tugas Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

import java.util.ArrayList;

// deklarasi kelas Player yang merupakan child class dari kelas Karakter
class Player extends Karakter
{
    // atribut - atribut privat untuk Player
    private String senjata;
    private String role;
    private int exp;
    private int koin;
    private ArrayList<Item> listInventory;

    // konstruktor
    public Player()
    {
        this.senjata = "";
        this.role = "";
        this.exp = 0;
        this.koin = 0;
        this.listInventory = new ArrayList<>();
    }

    public Player(String nama, String jenisKelamin, int hp, int atk, int level, String senjata, String role, int exp, int koin)
    {
        super(nama, jenisKelamin, hp, atk, level);
        this.senjata = senjata;
        this.role = role;
        this.exp = exp;
        this.koin = koin;
        this.listInventory = new ArrayList<>();
    }

    // getter dan setter untuk atribut private
    public String getSenjata()
    {
        return senjata;
    }

    public void setSenjata(String senjata)
    {
        this.senjata = senjata;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public int getExp()
    {
        return exp;
    }

    public void setExp(int exp)
    {
        this.exp = exp;
    }

    public int getKoin()
    {
        return koin;
    }

    public void setKoin(int koin)
    {
        this.koin = koin;
    }

    public void addInventory(Item item)
    {
        this.listInventory.add(item);
    }

    public void menyelesaikanMisi(NPC npc)
    {
        System.out.println(this.getNama() + " menyelesaikan misi " + npc.getMisi() + " dan mendapatkan item " + npc.getItem() + "!");
        Item item = new Item(npc.getItem(), "Dapet dari ngemisi", 10);
        tambahItemInventory(item);
        this.exp += 100;
        this.koin += 50;
    }

    public void tambahItemInventory(Item item)
    {
        this.listInventory.add(item);
    }

    public void interaksiDenganNPC(NPC npc)
    {
        System.out.println(this.getNama() + " melakukan interaksi dengan " + npc.getNama() + ".");
    }

    public void melakukanMisi(NPC npc)
    {
        System.out.println(this.getNama() + " menerima dan melakukan misi bernama " + npc.getMisi() + ".");
    }

    public void menyerangMusuh(Enemy enemy)
    {
        int damage = this.getAtk();
        System.out.println(this.getNama() + " menyerang " + enemy.getNama() + " menggunakan " + this.getSenjata() + " dan mengurangi " + damage + " HP!");
        enemy.setHp(enemy.getHp() - damage);
        enemy.cekKematianEnemy();
    }

    public void useItem(Item item)
    {
        System.out.println(this.getNama() + " menggunakan item " + item.getNamaItem() + "!");
    }

    public void tampilkanItem()
    {
        System.out.println("Items yang dimiliki oleh " + getNama() + ":");
        for (Item item : listInventory)
        {
            System.out.println(item.getNamaItem());
        }
    }
}