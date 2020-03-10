/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_sbd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author chali
 */
public class Tubes_SBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file = "C:\\Users\\Truth\\Desktop\\Tubes_SBD\\src\\tubes_sbd/input.txt";
        //ubah file diatas sesuai dengan letak input.txt berada//

        String[][] tabel = new String[4][];

        try {
            FileReader scan = new FileReader(file);
            BufferedReader br = new BufferedReader(scan);
            int i = 0;
            String spl;
            while ((spl = br.readLine()) != null) {
                String[] data = spl.split(";");
                tabel[i] = data;
                i++;
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.getMessage();
        } catch (IOException ioe) {
            ioe.getMessage();
        }

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < tabel.length; j++) {
//                System.out.println(tabel[i][j]);
//            }
//        }
        
        //mencari p
        int i = 0;
        int baris_p = 0;
        int kolom_p = 0;
        boolean bool = false;

        while (i < tabel.length && bool == false) {
            if (tabel != null) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("P")) {
                            baris_p = i;
                            kolom_p = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                        j++;
                    }
                }
            }
            i++;
        }
        int p = Integer.parseInt(tabel[baris_p][kolom_p]);
//        System.out.println(p);

        //mencari p
        i = 0;
        int baris_b = 0;
        int kolom_b = 0;
        bool = false;

        while (i < tabel.length && bool == false) {
            if (tabel != null) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("B")) {
                            baris_b = i;
                            kolom_b = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                        j++;
                    }
                }
            }
            i++;
        }
        int b = Integer.parseInt(tabel[baris_b][kolom_b]);
//        System.out.println(b);

        //mencari r1
        i = 0;
        int baris_r1 = 0;
        int kolom_r1 = 0;
        bool = false;

        while (i < tabel.length && bool == false) {
            if (tabel != null) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("r1")) {
                            baris_r1 = i;
                            kolom_r1 = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                        j++;
                    }
                }
            }
            i++;
        }
        int r1 = Integer.parseInt(tabel[baris_r1][kolom_r1]);
//        System.out.println(r1);

        //mencari r2
        i = 0;
        int baris_r2 = 0;
        int kolom_r2 = 0;
        bool = false;

        while (i < tabel.length && bool == false) {
            if (tabel != null) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("R2")) {
                            baris_r2 = i;
                            kolom_r2 = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                        j++;
                    }
                }
            }
            i++;
        }
        int r2 = Integer.parseInt(tabel[baris_r2][kolom_r2]);
//        System.out.println(r2);

        //mencari r3
        i = 0;
        int baris_r3 = 0;
        int kolom_r3 = 0;
        bool = false;

        if (tabel != null) {
            while (i < tabel.length && bool == false) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("R3")) {
                            baris_r3 = i;
                            kolom_r3 = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                    }
                }
                i++;
            }
        }

        int r3 = Integer.parseInt(tabel[baris_r3][kolom_r3]);

        //mencari v1
        i = 0;
        int baris_v1 = 0;
        int kolom_v1 = 0;
        bool = false;

        if (tabel != null) {
            while (i < tabel.length && bool == false) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("V1")) {
                            baris_v1 = i;
                            kolom_v1 = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                    }
                }
                i++;
            }
        }

        int v1 = Integer.parseInt(tabel[baris_v1][kolom_v1]);

        //mencari v2
        i = 0;
        int baris_v2 = 0;
        int kolom_v2 = 0;
        bool = false;

        if (tabel != null) {
            while (i < tabel.length && bool == false) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("V2")) {
                            baris_v2 = i;
                            kolom_v2 = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                    }
                }
                i++;
            }
        }

        int v2 = Integer.parseInt(tabel[baris_v2][kolom_v2]);

        //mencari v3
        i = 0;
        int baris_v3 = 0;
        int kolom_v3 = 0;
        bool = false;

        if (tabel != null) {
            while (i < tabel.length && bool == false) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("V3")) {
                            baris_v3 = i;
                            kolom_v3 = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                    }
                }
                i++;
            }
        }

        int v3 = Integer.parseInt(tabel[baris_v3][kolom_v3]);

        //mencari n1
        i = 0;
        int baris_n1 = 0;
        int kolom_n1 = 0;
        bool = false;

        if (tabel != null) {
            while (i < tabel.length && bool == false) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("n1")) {
                            baris_n1 = i;
                            kolom_n1 = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                    }
                }
                i++;
            }
        }

        int n1 = Integer.parseInt(tabel[baris_n1][kolom_n1]);

        //mencari n2
        i = 0;
        int baris_n2 = 0;
        int kolom_n2 = 0;
        bool = false;

        if (tabel != null) {
            while (i < tabel.length && bool == false) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("n2")) {
                            baris_n2 = i;
                            kolom_n2 = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                    }
                }
                i++;
            }
        }

        int n2 = Integer.parseInt(tabel[baris_n2][kolom_n2]);

        //mencari n3
        i = 0;
        int baris_n3 = 0;
        int kolom_n3 = 0;
        bool = false;

        if (tabel != null) {
            while (i < tabel.length && bool == false) {
                int j = 0;
                if (tabel[i] != null) {
                    while (j < tabel[i].length && bool == false) {
                        if (tabel[i][j].equalsIgnoreCase("n3")) {
                            baris_n3 = i;
                            kolom_n3 = j + 1;
                            bool = true;
                        } else {
                            j++;
                        }
                    }
                }
                i++;
            }
        }

        int n3 = Integer.parseInt(tabel[baris_n3][kolom_n3]);

        //mencari bfr
        double bfr1 = b / r1;
        double bfr2 = b / r2;
        double bfr3 = b / r3;

        //mencari fanout
        double fanout1 = b / (v1 + p);
        double fanout2 = b / (v2 + p);
        double fanout3 = b / (v3 + p);

        //mencari blok
        double total_blok1 = n1 / bfr1;
        double total_blok2 = n2 / bfr2;
        double total_blok3 = n3 / bfr3;

        //mencari indeks
        double indeks1 = n1 / fanout1;
        double indeks2 = n2 / fanout2;
        double indeks3 = n3 / fanout3;

        String[][] data_query = new String[5][15];
        String[][] data_atr = new String[5][15];
        String[] data_sj = new String[5];
        String[] data_tb = new String[5];
        String[] data_cost = new String[5];

        int sp = 0;

        boolean keluar = false;
        while (keluar != true) {
            System.out.println(">> Menu Utama :");
            System.out.println("   1. Tampilkan BFR dan Fanout Ratio Setiap Tabel ");
            System.out.println("   2. Tampilkan Total Blok Data + Blok Index Setiap Tabel");
            System.out.println("   3. Tampilkan Jumlah Blok yang diakses untuk pencarian Rekord");
            System.out.println("   4. Tampilkan QEP dan Cost");
            System.out.println("   5. Tampilkan Isi File Shared pool");
            System.out.println("   6. Keluar ");
            System.out.print(">> Masukkan Pilihan anda :");
            Scanner keyboard = new Scanner(System.in);
            int pil = keyboard.nextInt();
            System.out.println("");
            System.out.println("");

            switch (pil) {
                case 1:
                    //menampilkan bfr / fanout ratio yang telah didapatkan diatas
                    System.out.println("Menu 1 : BFR dan Fan Out Ratio");
                    System.out.println("------------------------------");
                    System.out.println("BFR " + tabel[1][0] + " = " + bfr1);
                    System.out.println("Fan Out Ratio " + tabel[1][0] + " = " + Math.floor(fanout1));
                    System.out.println("BFR" + tabel[2][0] + " = " + bfr2);
                    System.out.println("Fan Out Ratio " + tabel[2][0] + " = " + Math.floor(fanout2));
                    System.out.println("BFR" + tabel[3][0] + " = " + bfr3);
                    System.out.println("Fan Out Ratio " + tabel[3][0] + " = " + Math.floor(fanout3));

                    System.out.print("kembali, ya atau tidak ? : ");
                    String pil1 = keyboard.next();
                    if (pil1.equalsIgnoreCase("ya")) {
                        break;
                    }
                case 2:
                    //menampilkan jumlah blok sesuai dengan yang telah dicari diatas
                    System.out.println("Menu 2 : Jumlah Blok");
                    System.out.println("--------------------");
                    System.out.println("Tabel Data " + tabel[1][0] + " : " + Math.ceil(total_blok1));
                    System.out.println("Indeks " + tabel[1][0] + " : " + Math.ceil(indeks1));
                    System.out.println("Tabel Data " + tabel[2][0] + " : " + Math.ceil(total_blok2));
                    System.out.println("Indeks " + tabel[2][0] + " : " + Math.ceil(indeks2));
                    System.out.println("Tabel Data " + tabel[3][0] + " : " + Math.ceil(total_blok3));
                    System.out.println("Indeks " + tabel[3][0] + " : " + Math.ceil(indeks3));
                    System.out.print("kembali, ya atau tidak ? : ");
                    String pil2 = keyboard.next();
                    if (pil2.equalsIgnoreCase("ya")) {
                        break;
                    }
                case 3:

                    System.out.println("Menu 3 : Pencarian Rekord");
                    System.out.println("-------------------------");

                    System.out.println("Input :");
                    Scanner rkrd = new Scanner(System.in);
                    System.out.println(">> Cari Rekord ke - : ");
                    int input_rekord = rkrd.nextInt();
                    Scanner tbl = new Scanner(System.in);
                    System.out.println(">> Nama Tabel       : ");
                    String input_tabel = tbl.nextLine();
                    System.out.println("");

                    int j = 0;
                    int baris_t = 0;
                    boolean dapat = false;
                    double bfr = 0;
                    double blok = 0;
                    double indeks = 0;
                    //menyocokkan tabel dengan file txt
                    if (tabel != null) {
                        while (j < tabel.length) {
                            if (tabel[j][0].equalsIgnoreCase(input_tabel)) {
                                baris_t = j;
                                dapat = true;
                            }
                            j++;
                        }
                    }

                    //rumus setiap tabel
                    if (baris_t == 1) {
                        bfr = bfr1;
                        blok = input_rekord / bfr;
                        indeks = (input_rekord / fanout1) + 1;
                        if (dapat == true) {
                            System.out.println("Menggunakan indeks, jumlah blok yang diakses : " + Math.ceil(blok) + " blok");
                            System.out.println("Tanpa indeks, jumlah blok yang diakses : " + Math.ceil(indeks) + " blok");
                        }
                    } else if (baris_t == 2) {
                        bfr = bfr2;
                        blok = input_rekord / bfr;
                        indeks = (input_rekord / fanout2) + 1;
                        if (dapat == true) {
                            System.out.println("Menggunakan indeks, jumlah blok yang diakses : " + Math.ceil(blok) + " blok");
                            System.out.println("Tanpa indeks, jumlah blok yang diakses : " + Math.ceil(indeks) + " blok");
                        }
                    } else if (baris_t == 3) {
                        bfr = bfr3;
                        blok = input_rekord / bfr;
                        indeks = (input_rekord / fanout3) + 1;
                        if (dapat == true) {
                            System.out.println("Menggunakan indeks, jumlah blok yang diakses : " + Math.ceil(blok) + " blok");
                            System.out.println("Tanpa indeks, jumlah blok yang diakses : " + Math.ceil(indeks) + " blok");
                        }
                    } else {
                        System.out.println("Tabel tidak Ditemukan");
                        System.out.println("");
                    }
                    System.out.print("kembali, ya atau tidak ? : ");
                    String pil3 = keyboard.next();
                    if (pil3.equalsIgnoreCase("ya")) {
                        break;
                    }
                case 4:
                    System.out.println("Menu 4 : QEP dan Cost");
                    System.out.println("---------------------");
                    Scanner query = new Scanner(System.in);
                    System.out.println("Input Query :");
                    System.out.print(">> ");
                    String input_Q = query.nextLine();
                    System.out.println("");

                    String a = input_Q.replace(";;", " @ ");
                    String q = a.replace(";", " ;");
                    String c = q.replace(",", " ");
                    String d = c.replace("(", " ");
                    String e = d.replace(")", " ");
                    String f = e.replace("  ", " ");
                    String g = f.replace("   ", " ");

//                    System.out.println(h);
                    //masuk ke array
                    String qry[] = g.split(" ");
                    String atribut_s = "";
                    String operasi = "";
                    String nilai = "";
                    String atribut_j = "";
                    int posisi_tabel_q = 0;
                    int posisi_tabel_q_2 = 0;

                    String tabel_q = "";
                    String tabel_q_2 = "";
                    boolean error = false;
                    int p_selection;
                    int p_isi_using;
                    int p_tabel;
                    int posisi_where = 0;
                    int posisi_from = 0;
                    int posisi_join = 0;
                    int posisi_atribut_s = 0;
                    String[] atr = null;
                    String[] atr_1 = null;
                    String[] atr_2 = null;
                    boolean found_where = false;
                    boolean found_join = false;

                    //mengecek apakah select adalah elemenet pertaman dan ';' adalah element terakhir
                    if (qry[0].equalsIgnoreCase("select")) {
                        if (qry[qry.length - 1].equalsIgnoreCase(";")) {
                            String cek = "a";
                            int x = 0;
                            if (qry != null) {
                                //mengecek apakah ada error atau tidak tanda '@' merepresentasikan error
                                while (!cek.equalsIgnoreCase("@") && x < qry.length) {
                                    cek = qry[x];
                                    x++;
                                }
                                //mencari posisi form
                                if (!cek.equalsIgnoreCase("@")) {
                                    while (!"from".equalsIgnoreCase(qry[posisi_from]) && posisi_from < qry.length - 1) {
                                        if (query != null) {
                                            posisi_from++;
                                        }
                                    }
                                    //jika posisi from sama dengan yang dicari
                                    if ("from".equalsIgnoreCase(qry[posisi_from])) {
                                        //mencaro posisi where
                                        while (!"where".equalsIgnoreCase(qry[posisi_where]) && posisi_where < qry.length - 1) {
                                            if (query != null) {
                                                posisi_where++;
                                            }
                                        }
                                        //mencari posisi join
                                        while (!"join".equalsIgnoreCase(qry[posisi_join]) && posisi_join < qry.length - 1) {
                                            if (query != null) {
                                                posisi_join++;
                                            }

                                        }
                                        //jika posisi where sama dengan yg dicari
                                        if ("where".equalsIgnoreCase(qry[posisi_where])) {

                                            found_where = true;
                                            p_selection = (qry.length - 1) - (posisi_where);

                                            //memasukkan posisi tabel ke dalam variabel p_tabel
                                            if (p_selection == 4) {
                                                atribut_s = qry[posisi_where + 1];
                                                operasi = qry[posisi_where + 2];
                                                nilai = qry[qry.length - 2];

                                                p_tabel = posisi_where - posisi_from;

                                                if (p_tabel == 2) {
                                                    tabel_q = qry[posisi_from + 1];
                                                    x = 0;
                                                    bool = false;
                                                    //memastikan apakah tabel ada didalam txt
                                                    while (x < tabel.length && bool == false) {
                                                        if (tabel != null) {
                                                            if (tabel_q.equalsIgnoreCase(tabel[x][0])) {
                                                                posisi_tabel_q = x;
                                                                bool = true;
                                                            } else {
                                                                x++;
                                                            }
                                                        }

                                                    }

                                                    if (bool == false) {
                                                        error = true;
                                                        System.out.println("SQL error table not found");
                                                    } else {
                                                        tabel_q = tabel[posisi_tabel_q][0];
                                                    }

                                                    x = 1;
                                                    bool = false;
                                                    //memastikan attribute sesudah where ada pada text
                                                    while (x < tabel[posisi_tabel_q].length && bool == false && error == false) {
                                                        if (tabel[posisi_tabel_q] != null) {
                                                            if (atribut_s.equalsIgnoreCase(tabel[posisi_tabel_q][x])) {
                                                                bool = true;
                                                            } else {
                                                                x++;
                                                            }
                                                        }

                                                    }

                                                    if (bool = false) {
                                                        error = true;
                                                        System.out.println("SQL error selection atribute not found");
                                                    } else {
                                                        atribut_s = tabel[posisi_tabel_q][x];
                                                    }

                                                    x = 0;
                                                    int y = 1;
                                                    int p_atr = posisi_from - 1;
                                                    atr = new String[p_atr];
                                                    //mencari banyak attribut sesudah select dan sebelum from
                                                    while (x <= atr.length - 1 && error == false) {
                                                        if (atr != null) {
                                                            while (!qry[y].equalsIgnoreCase("from")) {
                                                                if (qry[y] != null) {
                                                                    atr[x] = qry[y];
                                                                    y++;
                                                                    x++;
                                                                }

                                                            }

                                                        }

                                                    }

                                                    x = 0;
                                                    y = 0;
                                                    int jml_atr = 0;
                                                    dapat = false;
                                                    while (x < atr.length && error == false) {
                                                        if (atr != null) {
                                                            //memastikan apakah jmlh attrbute sama
                                                            while (y < tabel[posisi_tabel_q].length && bool == false) {
                                                                if (tabel[posisi_tabel_q] != null) {
                                                                    if (atr[x].equalsIgnoreCase(tabel[posisi_tabel_q][y])) {
                                                                        jml_atr++;
                                                                        dapat = true;
                                                                        x++;
                                                                        y = 0;

                                                                        if (jml_atr == atr.length) {
                                                                            bool = true;
                                                                        }
                                                                    } else {
                                                                        y++;
                                                                        dapat = false;

                                                                        if (y == tabel[posisi_tabel_q].length) {
                                                                            error = true;
                                                                        }
                                                                    }
                                                                }

                                                            }
                                                        }

                                                    }
                                                    if (dapat == false) {
                                                        error = true;
                                                        System.out.println("SQL error atribute not found");
                                                    }
                                                } else {
                                                    //error posisi tabel
                                                    System.out.println("SQL tabel error");
                                                    error = true;
                                                }
                                            } else {
                                                //error posisi where
                                                System.out.println("SQL where error");
                                                error = true;
                                            }
                                        } else if ("join".equalsIgnoreCase(qry[posisi_join])) {

                                            found_join = true;
                                            int posisi_using = 0;
                                            while (!"using".equalsIgnoreCase(qry[posisi_using]) && posisi_using < qry.length - 1) {
                                                if (query != null) {
                                                    posisi_using++;
                                                }

                                            }

                                            if ("using".equalsIgnoreCase(qry[posisi_using])) {
                                                p_tabel = posisi_join - posisi_from;
                                                //mencari posisi tabel 1
                                                if (p_tabel == 2) {
                                                    tabel_q = qry[posisi_from + 1];
                                                    x = 0;
                                                    bool = false;
                                                    while (x < tabel.length && bool == false) {
                                                        if (tabel != null) {
                                                            if (tabel_q.equalsIgnoreCase(tabel[x][0])) {
                                                                posisi_tabel_q = x;
                                                                bool = true;
                                                            } else {
                                                                x++;
                                                            }
                                                        }

                                                    }

                                                    if (bool == false) {
                                                        error = true;
                                                        System.out.println("SQL error table not found");
                                                    } else {
                                                        tabel_q = tabel[posisi_tabel_q][0];
                                                    }

                                                    p_tabel = posisi_using - posisi_join;

                                                    //mencari posisi tabel ke 2
                                                    if (p_tabel == 2) {
                                                        tabel_q_2 = qry[posisi_join + 1];
                                                        x = 0;
                                                        bool = false;
                                                        while (x < tabel.length && bool == false) {
                                                            if (tabel != null) {
                                                                if (tabel_q_2.equalsIgnoreCase(tabel[x][0])) {
                                                                    posisi_tabel_q_2 = x;
                                                                    bool = true;
                                                                } else {
                                                                    x++;
                                                                }
                                                            }

                                                        }

                                                        if (bool == false) {
                                                            error = true;
                                                            System.out.println("SQL error table not found");
                                                        } else {
                                                            tabel_q_2 = tabel[posisi_tabel_q_2][0];
                                                        }
                                                        //mencari attribute sesudah using
                                                        p_isi_using = (qry.length - 1) - posisi_using;
                                                        if (p_isi_using == 2) {

                                                            atribut_j = qry[posisi_using + 1];

                                                            x = 1;
                                                            bool = false;

                                                            while (x < tabel[posisi_tabel_q].length && bool == false && error == false) {
                                                                if (tabel[posisi_tabel_q] != null) {
                                                                    if (atribut_j.equalsIgnoreCase(tabel[posisi_tabel_q][x])) {
                                                                        bool = true;
                                                                    } else {
                                                                        x++;
                                                                    }
                                                                }

                                                            }

                                                            x = 1;
                                                            bool = false;
                                                            //mencari attribute pada tabel ke 2
                                                            while (x < tabel[posisi_tabel_q_2].length && bool == false && error == false) {
                                                                if (tabel[posisi_tabel_q_2] != null) {
                                                                    if (atribut_j.equalsIgnoreCase(tabel[posisi_tabel_q_2][x])) {
                                                                        bool = true;
                                                                    } else {
                                                                        x++;
                                                                    }
                                                                }

                                                            }

                                                            if (bool == false) {
                                                                error = true;
                                                                System.out.println("SQL error join atribute not found");
                                                            } else {
                                                                atribut_j = tabel[posisi_tabel_q_2][x];
                                                            }

                                                            x = 0;
                                                            int y = 1;
                                                            int p_atr = posisi_from - 1;
                                                            atr = new String[p_atr];
                                                            atr_1 = new String[p_atr];
                                                            atr_2 = new String[p_atr];
                                                            //mencari semua attribute dan memasukkan kedalam array
                                                            while (x <= atr.length - 1 && error == false) {
                                                                if (atr != null) {
                                                                    while (!qry[y].equalsIgnoreCase("from")) {
                                                                        if (qry[y] != null) {
                                                                            atr[x] = qry[y];
                                                                            y++;
                                                                            x++;
                                                                        }

                                                                    }

                                                                }

                                                            }

                                                            x = 0;
                                                            y = 0;
                                                            int l_atr_1 = 0;
                                                            int l_atr_2 = 0;
                                                            int jml_atr = 0;
                                                            dapat = false;
                                                            bool = false;
                                                            while (x < atr.length && error == false) {
                                                                if (atr != null) {
                                                                    while (y < tabel[posisi_tabel_q].length && bool == false) {

                                                                        if (tabel[posisi_tabel_q] != null) {
                                                                            if (bool == false) {
                                                                                //menyocokkan setiap attribute yang didapatkan di tabel 1
                                                                                if (atr[x].equalsIgnoreCase(tabel[posisi_tabel_q][y])) {
                                                                                    jml_atr++;
                                                                                    dapat = true;
                                                                                    atr_1[l_atr_1] = atr[x];
                                                                                    l_atr_1++;
                                                                                    x++;
                                                                                    y = 0;

                                                                                    if (jml_atr == atr.length) {
                                                                                        bool = true;
                                                                                    }
                                                                                } else {
                                                                                    //                                                                                y++;
                                                                                    dapat = false;

//                                                                                    if (y == tabel[posisi_tabel_q].length){
//                                                                                        error = true;
//                                                                                    }
                                                                                }
                                                                            }

                                                                            if (bool == false) {
                                                                                //menyocokkan setiap attribute yang didapatkan di tabel 2
                                                                                if (atr[x].equalsIgnoreCase(tabel[posisi_tabel_q_2][y]) && bool == false) {
                                                                                    jml_atr++;
                                                                                    dapat = true;
                                                                                    atr_2[l_atr_2] = atr[x];
                                                                                    l_atr_2++;
                                                                                    x++;
                                                                                    y = 0;

                                                                                    if (jml_atr == atr.length) {
                                                                                        bool = true;
                                                                                    }
                                                                                } else {
                                                                                    y++;
                                                                                    dapat = false;

                                                                                    if (y == tabel[posisi_tabel_q].length) {
                                                                                        error = true;
                                                                                    }
                                                                                }
                                                                            }

                                                                        }

                                                                    }
                                                                }

                                                            }
                                                            if (dapat == false) {
                                                                error = true;
                                                                System.out.println("SQL error atribute not found");
                                                            }

                                                        } else {
                                                            //error isi using
                                                            System.out.println("SQL atribute using error");
                                                            error = true;
                                                        }

                                                    } else {
                                                        // error tabel kedua tidak sesuai
                                                        System.out.println("SQL table 2 error");
                                                        error = true;
                                                    }
                                                } else {
                                                    //error tabel tidak sesuai
                                                    System.out.println("SQL table error");
                                                    error = true;
                                                }

                                            } else {
                                                //jika tidak ada using
                                                System.out.println("SQL syntax error (using)");
                                                error = true;
                                            }

                                            //jika join ada d query
                                        } else {
                                            //jika tidak ada keduanya
                                            System.out.println("SQL error where / join syntax error");
                                            error = true;
                                        }
                                    } else {
                                        System.out.println("SQL syntax error (from)");
                                        error = true;
                                    }
                                } else {
                                    System.out.println("SQL double semicolon (;;)");
                                    error = true;
                                }
                            }
                        } else {
                            //else ;
                            System.out.println("SQL error missing semicolon (;)");
                            error = true;
                        }
                    } else {
                        //else select
                        System.out.println("SQL syntax error (select)");
                        error = true;
                    }

                    if (error == false) {
                        double br = 0;
                        double bs = 0;
                        double seek_t = 0;
                        double block_t = 0;
                        double yg = 0;
                        double log_1;
                        double log_2;
                        double hi;
                        double cost;

                        if (found_where == true) {

                            if (atribut_s.equalsIgnoreCase(tabel[posisi_tabel_q][1])) {
                                System.out.println("tabel 1 : " + tabel_q);
                                System.out.print("kolom 1 : ");
                                int x = 0;
                                while (x < atr.length) {
                                    System.out.print(atr[x] + ", ");
                                    x++;
                                }

                                //QEP#1
                                System.out.println("");
                                System.out.println("");
                                System.out.println("QEP #1");
                                System.out.print("PROJECTION ");
                                x = 0;
                                while (x < atr.length) {
                                    System.out.print(atr[x] + ", ");
                                    x++;
                                }
                                System.out.println(" -- on the fly");
                                String data_1 = "SELECTION " + atribut_s + " " + operasi + " " + nilai + " -- A1 on the key";
                                System.out.println(data_1);
                                System.out.println(tabel_q);

//                                if (posisi_tabel_q == 1){
//                                    bfr = bfr1;
//                                    br = Math.ceil(n1/bfr);
//                                }else if (posisi_tabel_q == 2){
//                                    bfr = bfr2;
//                                    br = Math.ceil(n2/bfr);
//                                }else if (posisi_tabel_q == 3){
//                                    bfr = bfr3;
//                                    br = Math.ceil(n3/bfr);
//                                }
//                                
//                                seek_t = 1;
//                                block_t = br/2;
                                int pk = 1;
                                x = 0;
                                int attri = 2;
                                if (posisi_tabel_q == 1) {
                                    br = n1 / 2;
                                } else if (posisi_tabel_q == 2) {
                                    br = n2 / 2;
                                } else if (posisi_tabel_q == 3) {
                                    br = n3 / 2;
                                }

                                String cost_1 = "Cost : " + br;
                                System.out.println(cost_1);

                                //QEP#2
                                System.out.println("");
                                System.out.println("QEP #2");
                                System.out.print("PROJECTION ");
                                x = 0;
                                while (x < atr.length) {
                                    System.out.print(atr[x] + ", ");
                                    x++;
                                }
                                System.out.println(" -- on the fly");
                                String data_2 = "SELECTION " + atribut_s + " " + operasi + " " + nilai + " -- A2";
                                System.out.println(data_2);
                                System.out.println(tabel_q);

                                pk = 1;
                                x = 0;
                                attri = 2;
                                if (posisi_tabel_q == 1) {
                                    bs = Math.ceil(n1 / fanout1);
                                } else if (posisi_tabel_q == 2) {
                                    bs = Math.ceil(n2 / fanout2);
                                } else if (posisi_tabel_q == 3) {
                                    bs = Math.ceil(n3 / fanout3);
                                }

                                String cost_2 = "Cost : " + bs;
                                System.out.println(cost_2);
//                                if (posisi_tabel_q == 1){
//                                    bfr = bfr1;
//                                    br = Math.ceil(n1/bfr);
//                                    yg = Math.floor(b/(v1+p));
//                                }else if (posisi_tabel_q == 2){
//                                    bfr = bfr2;
//                                    br = Math.ceil(n2/bfr);
//                                    yg = Math.floor(b/(v2+p));
//                                }else if (posisi_tabel_q == 3){
//                                    bfr = bfr3;
//                                    br = Math.ceil(n3/bfr);
//                                    yg = Math.floor(b/(v3+p));
//                                }
//                                
//                                log_1 = Math.log(br);
//                                log_2 = Math.log(yg);
//                                hi = Math.ceil(log_1/log_2);
//                                
//                                cost = hi + 1;
//                                
//                                String cost_2 = "COST : seek time = "+cost+" , block transfer time = "+cost;
//                                System.out.println(cost_2);
                                System.out.println("");

                                String cek_optimal_1 = "";

                                if (br < bs) {
                                    cek_optimal_1 = "1";
                                    System.out.println("OPTIMAL COST : QEP#1");
                                    x = 0;
                                    while (x < qry.length) {
                                        data_query[sp][x] = qry[x];
                                        x++;
                                    }
                                    x = 0;
                                    while (x < atr.length) {
                                        data_atr[sp][x] = atr[x];
                                        x++;
                                    }
                                    data_sj[sp] = data_1;
                                    data_tb[sp] = tabel[posisi_tabel_q][0];
                                    data_cost[sp] = cost_1;

                                    String f_sp = "C:\\Users\\chali\\Documents\\NetBeansProjects\\Tubes_SBD\\src\\tubes_sbd/shared_pool.txt";
                                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(f_sp))) {
                                        x = 0;
                                        while (x <= sp) {

                                            int num = x + 1;
                                            bw.write(num);
                                            bw.newLine();
                                            bw.write("query : ");
                                            int y = 0;
                                            bool = false;
                                            while (y < data_query[x].length && bool == false) {
                                                if (data_query[x][y] != null) {
                                                    bw.write(data_query[x][y] + " ");
                                                    y++;
                                                } else {
                                                    bool = true;
                                                }

                                            }
                                            bw.newLine();
                                            bw.write("PROJECTION ");
                                            y = 0;
                                            bool = false;
                                            while (y < data_atr[x].length && bool == false) {
                                                if (data_atr[x][y] != null) {
                                                    bw.write(data_atr[x][y] + ", ");
                                                    y++;
                                                } else {
                                                    bool = true;
                                                }

                                            }
                                            bw.write(" -- on the fly");
                                            bw.newLine();
                                            bw.write(data_sj[x]);
                                            bw.newLine();
                                            bw.write(data_tb[x]);
                                            bw.newLine();
                                            bw.write(data_cost[x]);
                                            bw.newLine();
                                            bw.newLine();
                                            x++;

                                        }
                                        bw.close();
                                    } catch (Exception ex) {
                                        System.out.println("error");
                                    }
                                    sp++;

                                    //penyimpanan nilai qep yg dipilih
                                } else if (br > bs) {
                                    cek_optimal_1 = "2";
                                    System.out.println("OPTIMAL COST : QEP#2");
                                    x = 0;
                                    while (x < qry.length) {
                                        data_query[sp][x] = qry[x];
                                        x++;
                                    }
                                    x = 0;
                                    while (x < atr.length) {
                                        data_atr[sp][x] = atr[x];
                                        x++;
                                    }
                                    data_sj[sp] = data_2;
                                    data_tb[sp] = tabel[posisi_tabel_q][0];
                                    data_cost[sp] = cost_2;

                                    String f_sp = "C:\\Users\\chali\\Documents\\NetBeansProjects\\Tubes_SBD\\src\\tubes_sbd/shared_pool.txt";
                                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(f_sp))) {
                                        x = 0;
                                        while (x <= sp) {

                                            int num = x + 1;
                                            bw.write(num);
                                            bw.newLine();
                                            bw.write("query : ");
                                            int y = 0;
                                            bool = false;
                                            while (y < data_query[x].length && bool == false) {
                                                if (data_query[x][y] != null) {
                                                    bw.write(data_query[x][y] + " ");
                                                    y++;
                                                } else {
                                                    bool = true;
                                                }

                                            }
                                            bw.newLine();
                                            bw.write("PROJECTION ");
                                            y = 0;
                                            bool = false;
                                            while (y < data_atr[x].length && bool == false) {
                                                if (data_atr[x][y] != null) {
                                                    bw.write(data_atr[x][y] + ", ");
                                                    y++;
                                                } else {
                                                    bool = true;
                                                }

                                            }
                                            bw.write(" -- on the fly");
                                            bw.newLine();
                                            bw.write(data_sj[x]);
                                            bw.newLine();
                                            bw.write(data_tb[x]);
                                            bw.newLine();
                                            bw.write(data_cost[x]);
                                            bw.newLine();
                                            bw.newLine();
                                            x++;

                                        }
                                        bw.close();
                                    } catch (Exception ex) {
                                        System.out.println("error");
                                    }
                                    sp++;
                                }

                            } else {
                                System.out.println("tabel 1 : " + tabel_q);
                                System.out.print("kolom 1 : ");
                                int x = 0;
                                while (x < atr.length) {
                                    System.out.print(atr[x] + ", ");
                                    x++;
                                }

                                System.out.println("");
                                System.out.println("");
                                System.out.println("QEP #1");
                                System.out.print("PROJECTION ");
                                x = 0;
                                while (x < atr.length) {
                                    System.out.print(atr[x] + ", ");
                                    x++;
                                }
                                System.out.println(" -- on the fly");
                                String data = "SELECTION " + atribut_s + " " + operasi + " " + nilai + " -- A1 linier search";
                                System.out.println(data);
                                System.out.println(tabel_q);

                                br = 0;

                                String cost_1 = "COST : " + br;
                                System.out.println(cost_1);

                                x = 0;
                                while (x < qry.length) {
                                    data_query[sp][x] = qry[x];
                                    x++;
                                }
                                x = 0;
                                while (x < atr.length) {
                                    data_atr[sp][x] = atr[x];
                                    x++;
                                }
                                data_sj[sp] = data;
                                data_tb[sp] = tabel[posisi_tabel_q][0];
                                data_cost[sp] = cost_1;

                                String f_sp = "C:\\Users\\chali\\Documents\\NetBeansProjects\\Tubes_SBD\\src\\tubes_sbd/shared_pool.txt";
                                try (BufferedWriter bw = new BufferedWriter(new FileWriter(f_sp))) {
                                    x = 0;
                                    while (x <= sp) {

                                        int num = x + 1;
                                        bw.write(num);
                                        bw.newLine();
                                        bw.write("query : ");
                                        int y = 0;
                                        bool = false;
                                        while (y < data_query[x].length && bool == false) {
                                            if (data_query[x][y] != null) {
                                                bw.write(data_query[x][y] + " ");
                                                y++;
                                            } else {
                                                bool = true;
                                            }

                                        }
                                        bw.newLine();
                                        bw.write("PROJECTION ");
                                        y = 0;
                                        bool = false;
                                        while (y < data_atr[x].length && bool == false) {
                                            if (data_atr[x][y] != null) {
                                                bw.write(data_atr[x][y] + ", ");
                                                y++;
                                            } else {
                                                bool = true;
                                            }

                                        }
                                        bw.write(" -- on the fly");
                                        bw.newLine();
                                        bw.write(data_sj[x]);
                                        bw.newLine();
                                        bw.write(data_tb[x]);
                                        bw.newLine();
                                        bw.write(data_cost[x]);
                                        bw.newLine();
                                        bw.newLine();
                                        x++;

                                    }
                                    bw.close();
                                } catch (Exception ex) {
                                    System.out.println("error");
                                }
                                sp++;

                            }
                        } else if (found_join == true) {
                            // cost join
                            System.out.println("tabel 1 : " + tabel_q);
                            System.out.print("kolom 1 : ");
                            int x = 0;
                            while (x < atr_1.length) {
                                if (atr_1 != null) {
                                    System.out.print(atr_1[x] + ", ");
                                    x++;
                                }

                            }
                            System.out.println("");
                            System.out.println("tabel 2 : " + tabel_q_2);
                            System.out.print("kolom 2 : ");
                            x = 0;
                            while (x < atr_2.length) {
                                if (atr_2 != null) {
                                    System.out.print(atr_2[x] + ", ");
                                    x++;
                                } else {
                                    System.out.println("-");
                                }

                            }
                            //QEP#1
                            System.out.println("");
                            System.out.println("");
                            System.out.println("QEP#1");
                            System.out.print("PROJECTION ");
                            x = 0;
                            while (x < atr.length) {
                                System.out.print(atr[x] + ", ");
                                x++;
                            }
                            System.out.println(" -- on the fly");
                            String data_1 = "JOIN " + tabel_q + "." + atribut_j + " = " + tabel_q_2 + "." + atribut_j + " -- BNLJ";
                            System.out.println(data_1);
                            String data_tb1 = tabel_q + " " + tabel_q_2;
                            System.out.println(data_tb1);
                            String pos = "";
                            
                            br = n1*n3+n1;
                       

//                        if (posisi_tabel_q_2 == 1) {
//                            bfr = bfr1;
//                            bs = Math.ceil(n1 / bfr);
//                        } else if (posisi_tabel_q_2 == 2) {
//                            bfr = bfr2;
//                            bs = Math.ceil(n1 / bfr);
//                        } else if (posisi_tabel_q_2 == 3) {
//                            bfr = bfr3;
//                            bs = Math.ceil(n1 / bfr);
//                        }
//
//                        double seek_t_1 = 2.0 * br;
//                        double block_t_1 = (br * bs) + br;

//                        String cost_1 = "COST(worst case) : seek time = " + seek_t_1 + " , block transfer time = " + block_t_1;
                        String cost_1 = "Cost : "+br;
                        System.out.println(cost_1);

                        //QEP#2
                        System.out.println("");
                        System.out.println("QEP#2");
                        System.out.print("PROJECTION ");
                        x = 0;
                        while (x < atr.length) {
                            System.out.print(atr[x] + ", ");
                            x++;
                        }
                        System.out.println(" -- on the fly");
                        String data_2 = "JOIN " + tabel_q_2 + "." + atribut_j + " = " + tabel_q + "." + atribut_j + " -- BNLJ";
                        System.out.println(data_2);
                        String data_tb2 = tabel_q_2 + " " + tabel_q;
                        System.out.println(data_tb2);

//                        if (posisi_tabel_q_2 == 1) {
//                            bfr = bfr1;
//                            br = Math.ceil(n1 / bfr);
//                        } else if (posisi_tabel_q_2 == 2) {
//                            bfr = bfr2;
//                            br = Math.ceil(n1 / bfr);
//                        } else if (posisi_tabel_q_2 == 3) {
//                            bfr = bfr3;
//                            br = Math.ceil(n1 / bfr);
//                        }
//
//                        if (posisi_tabel_q == 1) {
//                            bfr = bfr1;
//                            bs = Math.ceil(n1 / bfr);
//                        } else if (posisi_tabel_q == 2) {
//                            bfr = bfr2;
//                            bs = Math.ceil(n1 / bfr);
//                        } else if (posisi_tabel_q == 3) {
//                            bfr = bfr3;
//                            bs = Math.ceil(n1 / bfr);
//                        }
//
//                        double seek_t_2 = 2 * br;
//                        double block_t_2 = (br * bs) + br;
//
//                        String cost_2 = "COST(worst case) : seek time = " + seek_t_2 + " , block transfer time = " + block_t_2;
                        
                        bs = n3*n1+n3;
                        
                        String cost_2 = "Cost : "+bs;
                        System.out.println("");
                        System.out.println(cost_2);
                        String cek_optimal_2 = "";
                        if (br < bs) {
                            cek_optimal_2 = "1";
                            System.out.println("OPTIMAL COST : QEP#1");
                            x = 0;
                            while (x < qry.length) {
                                data_query[sp][x] = qry[x];
                                x++;
                            }
                            x = 0;
                            while (x < atr.length) {
                                data_atr[sp][x] = atr[x];
                                x++;
                            }
                            data_sj[sp] = data_1;
                            data_tb[sp] = data_tb1;
                            data_cost[sp] = cost_1;

                            String f_sp = "C:\\Users\\chali\\Documents\\NetBeansProjects\\Tubes_SBD\\src\\tubes_sbd/shared_pool.txt";
                            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f_sp))) {
                                x = 0;
                                while (x <= sp) {

                                    int num = x + 1;
                                    bw.write(num);
                                    bw.newLine();
                                    bw.write("query : ");
                                    int y = 0;
                                    bool = false;
                                    while (y < data_query[x].length && bool == false) {
                                        if (data_query[x][y] != null) {
                                            bw.write(data_query[x][y] + " ");
                                            y++;
                                        } else {
                                            bool = true;
                                        }

                                    }
                                    bw.newLine();
                                    bw.write("PROJECTION ");
                                    y = 0;
                                    bool = false;
                                    while (y < data_atr[x].length && bool == false) {
                                        if (data_atr[x][y] != null) {
                                            bw.write(data_atr[x][y] + ", ");
                                            y++;
                                        } else {
                                            bool = true;
                                        }

                                    }
                                    bw.write(" -- on the fly");
                                    bw.newLine();
                                    bw.write(data_sj[x]);
                                    bw.newLine();
                                    bw.write(data_tb[x]);
                                    bw.newLine();
                                    bw.write(data_cost[x]);
                                    bw.newLine();
                                    bw.newLine();
                                    x++;

                                }
                                bw.close();
                            } catch (Exception ex) {
                                System.out.println("error");
                            }
                            sp++;

                        } else if (br > bs) {
                            cek_optimal_2 = "2";
                            System.out.println("OPTIMAL COST : QEP#2");
                            //penyimpanan nilai qep yg dipilih
                            x = 0;
                            while (x < qry.length) {
                                data_query[sp][x] = qry[x];
                                x++;
                            }
                            x = 0;
                            while (x < atr.length) {
                                data_atr[sp][x] = atr[x];
                                x++;
                            }
                            data_sj[sp] = data_2;
                            data_tb[sp] = data_tb2;
                            data_cost[sp] = cost_2;

                            String f_sp = "C:\\Users\\chali\\Documents\\NetBeansProjects\\Tubes_SBD\\src\\tubes_sbd/shared_pool.txt";
                            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f_sp))) {
                                x = 0;
                                while (x <= sp) {

                                    int num = x + 1;
                                    bw.write(num);
                                    bw.newLine();
                                    bw.write("query : ");
                                    int y = 0;
                                    bool = false;
                                    while (y < data_query[x].length && bool == false) {
                                        if (data_query[x][y] != null) {
                                            bw.write(data_query[x][y] + " ");
                                            y++;
                                        } else {
                                            bool = true;
                                        }

                                    }
                                    bw.newLine();
                                    bw.write("PROJECTION ");
                                    y = 0;
                                    bool = false;
                                    while (y < data_atr[x].length && bool == false) {
                                        if (data_atr[x][y] != null) {
                                            bw.write(data_atr[x][y] + ", ");
                                            y++;
                                        } else {
                                            bool = true;
                                        }

                                    }
                                    bw.write(" -- on the fly");
                                    bw.newLine();
                                    bw.write(data_sj[x]);
                                    bw.newLine();
                                    bw.write(data_tb[x]);
                                    bw.newLine();
                                    bw.write(data_cost[x]);
                                    bw.newLine();
                                    bw.newLine();
                                    x++;

                                }
                                bw.close();
                            } catch (Exception ex) {
                                System.out.println("error");
                            }
                            sp++;
                        }

                    }
            }else{
                        System.out.println("error");
                    }

            System.out.println("");
            System.out.print("kembali, ya atau tidak ? : ");
            String pil4 = keyboard.next();
            if (pil4.equalsIgnoreCase("ya")) {
                break;
            }
        
    

case 5:
                            System.out.println("Menu 5 : Shared pool");
                            System.out.println("--------------------");
                            System.out.println("");
                            //isi kodingan
                        int x = 0;
                        while(x < sp){
                        System.out.println(x+1);
                        System.out.print("query : ");
                        
                        int y = 0;
                        bool = false;
                        while(y < data_query[x].length && bool == false){
                            if(data_query[x][y] != null){
                                System.out.print(data_query[x][y]+" ");
                                y++;    
                            }else{
                                bool = true;
                            }
                            
                        }
                        System.out.println("");
                        System.out.print("PROJECTION ");
                        y = 0;
                        bool = false;
                        while(y < data_atr[x].length && bool == false){
                            if(data_atr[x][y] != null){
                                System.out.print(data_atr[x][y]+", ");
                                y++;    
                            }else{
                                bool = true;
                            }
                            
                        }
                        System.out.println(" -- on the fly");
                        System.out.println(data_sj[x]);
                        System.out.println(data_tb[x]);
                        System.out.println(data_cost[x]);
                        System.out.println("");
                        x++;
                    }
                    
                    System.out.println("");
                    System.out.println("kembali? y/n");
                    String pil_5 = keyboard.next();
                    System.out.println("");
                    System.out.println("");
                    if(pil_5.equalsIgnoreCase("y")){
                        break;
                    }
                            
                        case 6:
                            keluar = true;
                        }
                           
                    }
            }
        }
