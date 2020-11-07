/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan31.perkenalan.mahasiswa;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
public class IF110119014Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mahasiswa mhs_rizki = new Mahasiswa();
    mhs_rizki.nim = "10110269";
    mhs_rizki.nama = "Rizki Adam Kurniawan";
    
    Mahasiswa mhs_andri = new Mahasiswa();
    mhs_andri.nim = "10119014";
    mhs_andri.nama = "Andri Dwi P";
    
    Mahasiswa mhs_udin = new Mahasiswa();
    mhs_udin.nim = "10112089";
    mhs_udin.nama = "Udin Kusnandar";
    
    Mahasiswa mhs_jery = new Mahasiswa();
    mhs_jery.nim = "10112020";
    mhs_jery.nama = "Jery Saryono";
    
    mhs_rizki.perkenalanDiri();
    mhs_andri.perkenalanDiri();
    mhs_udin.perkenalanDiri();
    mhs_jery.perkenalanDiri();
    }
    
}
