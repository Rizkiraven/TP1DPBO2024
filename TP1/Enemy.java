/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Tugas Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// deklarasi kelas Enemy yang merupakan child class dari kelas Karakter
class Enemy extends Karakter
{
    private String dropItem;

    public Enemy()
    {
        this.dropItem = "";
    }

    public Enemy(String nama, String jenisKelamin, int hp, int atk, int level, String dropItem)
    {
        super(nama, jenisKelamin, hp, atk, level);
        this.dropItem = dropItem;
    }

    public String getDropItem()
    {
        return this.dropItem;
    }

    public void setDropItem(String dropItem)
    {
        this.dropItem = dropItem;
    }

    public void attackPlayer(Player player)
    {
        int damage = this.getAtk();
        System.out.println(this.getNama() + " menyerang " + player.getNama() + " dan mengurangi " + damage + " HP!");
        player.setHp(player.getHp() - damage);
    }

    public void cekKematianEnemy()
    {
        if (this.getHp() <= 0)
        {
            System.out.println(this.getNama() + " dikalahkan!");
        }
    }

    public void interaksiDenganPlayer(Player player)
    {
        System.out.println("Aku akan mengalahkan " + player.getNama() + " dengan cepat dan mudah!");
    }
}