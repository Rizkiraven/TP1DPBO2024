/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Tugas Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// import library yang digunakan
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<NPC> npcs = new ArrayList<>();
        ArrayList<Enemy> enemies = new ArrayList<>();
        ArrayList<Item> items = new ArrayList<>();

        Item map = new Item("Map", "Peta yang digunakan untuk pemula", 1);

        items.add(map);

        Player nova = new Player("Nova", "Laki-laki", 100, 8, 10, "Panah", "DPS", 5000, 1000);
        Player jane = new Player("Jane", "Perempuan", 100, 3, 5, "Tongkat Sihir", "Healer", 2500, 500);
        Player sora = new Player("Sora", "Laki-laki", 100, 6, 7, "Pedang", "DPS", 3200, 700);
        Player aloy = new Player("Aloy", "Perempuan", 100, 6, 8, "Pedang", "DPS", 3500, 800);

        nova.tambahItemInventory(map);
        jane.tambahItemInventory(map);
        sora.tambahItemInventory(map);
        aloy.tambahItemInventory(map);

        NPC adrian = new NPC("Adrian", "Laki-laki", 100, 0, 0, "Sacred Relic", "Membunuh Monster", "Membunuh monster yang berkeliaran di desa");
        NPC lyra = new NPC("Lyra", "Perempuan", 100, 0, 0, "Desolator", "Membunuh Thor", "Membunuh Thor yang berada di Dragon Lair");
        NPC sven = new NPC("Sven", "Laki-laki", 100, 0, 0, "Enchiridion", "Membuat Kota Damai", "Kota menjadi damai jika tidak ada kejahatan");

        Enemy naix = new Enemy("Nai'x", "Tidak Diketahui", 100, 4, 1, "Ghoul's Frenzy");
        Enemy thor = new Enemy("Thor", "Laki-laki", 200, 4, 1, "Divine Rapier");

        players.add(nova);
        players.add(jane);
        players.add(sora);
        players.add(aloy);

        npcs.add(adrian);
        npcs.add(lyra);
        npcs.add(sven);

        enemies.add(naix);
        enemies.add(thor);

        int nomor = 1;

        System.out.println("------------ Daftar Player yang Aktif ------------");
        for (Player player : players)
        {
            System.out.println(nomor++ + ". Nama   : " + player.getNama());
            System.out.println("   Gender : " + player.getJenisKelamin());
            System.out.println("   Role   : " + player.getRole());
            System.out.println("   Level  : " + player.getLevel());
            System.out.println("   Koin   : " + player.getKoin());
            System.out.println("            Status | Value ");
            System.out.println("             ATK       " + player.getAtk());
            System.out.println("             HP        " + player.getAtk());
            System.out.println();
        }

        nomor = 1;
        System.out.println("\n------------ Daftar NPC ------------");
        for (NPC npc : npcs)
        {
            System.out.println(nomor++ + ". Nama   : " + npc.getNama());
            System.out.println("   Gender : " + npc.getJenisKelamin());
            System.out.println();
        }

        nomor = 1;
        System.out.println("\n------------ Daftar Musuh yang Ada ------------");
        for (Enemy enemy : enemies)
        {
            System.out.println(nomor++ + ". Nama   : " + enemy.getNama());
            System.out.println("   Gender : " + enemy.getJenisKelamin());
            System.out.println();
        }

        nomor = 1;
        System.out.println("\n------------ Daftar Item yang Ada di Dunia ini ------------");
        for (Item item : items)
        {
            System.out.println(nomor++ + ". Nama Item : " + item.getNamaItem());
            System.out.println();
        }

        nova.interaksiDenganNPC(adrian);
        nova.menyerangMusuh(naix);
        naix.attackPlayer(nova);
        nova.melakukanMisi(adrian);

        aloy.interaksiDenganNPC(lyra);
        aloy.melakukanMisi(lyra);

        nova.menyelesaikanMisi(adrian);
        aloy.menyelesaikanMisi(lyra);

        sora.melakukanMisi(sven);
        sora.menyelesaikanMisi(sven);
    }
}