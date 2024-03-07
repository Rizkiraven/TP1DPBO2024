/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Tugas Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// deklarasi kelas Karakter
class Karakter
{
    // atribut - atribut privat untuk nama dan jenis kelamin
    private String nama;
    private String jenisKelamin;
    private int hp;
    private int atk;
    private int level;

    // konstruktor
    public Karakter()
    {
        this.nama = "";
        this.jenisKelamin = "";
        this.hp = 0;
        this.atk = 0;
        this.level = 0;
    }

    // konstruktor dengan parameter nama dan jenisKelamin
    public Karakter(String nama, String jenisKelamin, int hp, int atk, int level)
    {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.hp = hp;
        this.atk = atk;
        this.level = level;
    }

    // get nama
    public String getNama()
    {
        return this.nama;
    }

    // set nama
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    // get jenisKelamin
    public String getJenisKelamin()
    {
        return this.jenisKelamin;
    }

    // set jenisKelamin
    public void setJenisKelamin(String jenisKelamin)
    {
        this.jenisKelamin = jenisKelamin;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getAtk()
    {
        return atk;
    }

    public void setAtk(int atk)
    {
        this.atk = atk;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
}