# Tugas Praktikum 1 DPBO 2024
# Janji
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Tugas Praktikum 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Desain Program
![Untitled Diagram drawio](https://github.com/Rizkiraven/TP1DPBO2024/assets/107761120/d77e126f-c0c5-45ab-857d-c2dac9448f62)

# Deskripsi Program
Memiliki 5 class yaitu Karakter, Player, Item, NPC, dan Enemy.
- method di class Karakter : hanya getter dan setter.
- method di class Player : getter dan setter, menyelesaikanMisi(), tambahItemInventory(), interaksiDenganNPC(), melakukanMisi(), menyerangMusuh(), useItem(), tampilkanItem().
- method di class Item : hanya getter dan setter.
- method di class NPC : getter dan setter, berjualan().
- method di class Enemy : getter dan setter, attackPlayer(), cekKematianEnemy(), interaksiDenganPlayer().

Player bisa berinteraksi dengan NPC, menerima misi, dan menyelesaikannya. Player juga bisa mendapatkan item setelah menyelesaikan misi yang sudah beres dilakukan.
Player menyerang musuhnya sesuai dengan ATK yang dimiliki.
Player bisa melakukan jual beli dengan NPC.
Enemy bisa menyerang dan berinteraksi kepada Player.
