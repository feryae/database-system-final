package tubes_sbd;import java.io.BufferedWriter; 
 import java.io.File; import java.io.FileNotFoundException; 
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.floor; import java.util.Scanner; 
import java.util.ArrayList;import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
 import java.util.stream.IntStream;

public class Tubes_SBD_1 {
 
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        class prop {
            String name; double R,V,n,bfr,fanout,tot_block,idx;
            public prop(String s, double R, double V, double n, double b, double p){
                this.name = s; this.R = R; this.V = V; this.n = n;
                this.bfr = (double) floor(b / R);
                this.fanout = b/(V+p);
                this.tot_block = n / this.bfr;
                this.idx = n / this.fanout;
            }
        }
        f_library f = new f_library();
        final File file = new File("src/tubes_sbd/input.txt");
        ArrayList<String[]> multi_array = new ArrayList<>();   
        try (final Scanner scan = new Scanner(file)) {
            scan.useDelimiter("#"); while(scan.hasNext()) {
                multi_array.add(scan.next().split(";"));
            }
        }

        String tn; double R,V,n; double p,b;
        p = Float.parseFloat(multi_array.get(0)[1]);        
        b = Float.parseFloat(multi_array.get(0)[3]);
        ArrayList<prop> table_list = new ArrayList<>();
        
        for (String[] s : multi_array) { 
            if (!"P".equals(s[0])){                     
                tn = s[0].replaceAll("[\r,\n]", "").toLowerCase();
                R =  Double.parseDouble(s[f.getListIndexBy(s, "R") + 1]);
                V =  Double.parseDouble(s[f.getListIndexBy(s, "V") + 1]);
                n =  Double.parseDouble(s[f.getListIndexBy(s, "n") + 1]);
                prop tables = new prop(tn,R,V,n,b,p); table_list.add(tables);
            }
        }
        
        boolean keluar = false; while (keluar != true) {
            f.pr_ln(">> Menu Utama :");
            f.pr_ln("   1. Tampilkan BFR dan Fanout Ratio Setiap Tabel ");
            f.pr_ln("   2. Tampilkan Total Blok Data + Blok Index Setiap Tabel");
            f.pr_ln("   3. Tampilkan Jumlah Blok yang diakses untuk pencarian Rekord");
            f.pr_ln("   4. Tampilkan QEP dan Cost \n   5. Tampilkan Isi File Shared pool");
            f.pr_ln("   6. Keluar \n   >> Masukkan Pilihan anda : \n");
            
            switch (keyboard.nextInt()) {
                case 1:
                    f.pr_ln("Menu 1 : BFR dan Fan Out Ratio \n ------------------------------");
                    table_list.stream().map((s) -> {
                        f.pr_ln("Tabel = "+s.name); return s;
                    }).map((s) -> {
                        f.pr_ln("BFR = " + s.bfr); return s;
                    }).forEach((s) -> {
                        f.pr_ln("Fan Out Ratio  = " + Math.floor(s.fanout));
                    }); f.pr_nm("kembali, ya atau tidak ? : ");
                    if (keyboard.next().equalsIgnoreCase("ya")) { break;}
                case 2:
                    f.pr_ln("Menu 2 : Jumlah Blok \n --------------------");
                    table_list.stream().map((s) -> {
                        f.pr_ln("Tabel = "+s.name); return s;
                    }).map((s) -> {
                        f.pr_ln("Tabel Data  : " + Math.ceil(s.tot_block));return s;
                    }).forEach((s) -> {
                        f.pr_ln("Indeks  : " + Math.ceil(s.idx));
                    });f.pr_nm("kembali, ya atau tidak ? : ");
                    if (keyboard.next().equalsIgnoreCase("ya")) { break; }
                case 3:
                    f.pr_ln("Menu 3 : Pencarian Rekord \n -------------------------");
                    f.pr_ln("Input : \n >> Cari Rekord ke - : ");
                    int input_rekord = keyboard.nextInt(); keyboard.nextLine();
                    f.pr_ln(">> Nama Tabel       : ");
                    String input_tabel = keyboard.nextLine();
   
                    int d_idx = -1 ; for (prop s : table_list){
                        if(s.name.contains(input_tabel.toLowerCase())){
                            d_idx = table_list.indexOf(s);
                        }
                    }
                    
                    if (d_idx != -1) {
                        double blok,indeks; blok = input_rekord / table_list.get(d_idx).bfr;
                        indeks = (input_rekord / table_list.get(d_idx).fanout) + 1;
                        f.pr_ln("Menggunakan indeks, jumlah blok yang diakses : " + Math.ceil(blok) + " blok");
                        f.pr_ln("Tanpa indeks, jumlah blok yang diakses : "+ Math.ceil(indeks) + " blok");
                    } else { f.pr_ln("Tabel tidak Ditemukan"); f.pr_ln(""); }
                    
                    f.pr_nm("kembali, ya atau tidak ? : ");
                    if (keyboard.next().equalsIgnoreCase("ya")) { break; }
                case 4:
                    {
                        try {
                            File sp = new File("src/tubes_sbd/shared_pool.txt");
                            FileWriter writer = new FileWriter(sp, true);                          
                            keyboard.nextLine(); f.pr_ln("Menu 4 : QEP dan Cost \n ---------------------");
                            f.pr_ln("Input Query : \n >> "); String input_Q = keyboard.nextLine(); f.pr_ln("");
                            
                            String qry[] = f.q_s(input_Q);
                            
                            int f_id, w_id,j_id,u_id; f_id = w_id = j_id = u_id = 0; 
                            int dq_idx = -1 ; int dr_idx = -1 ;
                                                
                            f_id = f.getListIndexBy(qry,"from"); 
                            j_id = f.getListIndexBy(qry,"join");
                            w_id = f.getListIndexBy(qry,"where");
                            u_id = f.getListIndexBy(qry,"using");
                    
                            String s,w,t; s = w = t = "";
                            String m1,m2; m1 = m2 = ""; 
                            String wri = "";
                            s = f.str_loop(qry, s, 1, f_id);
                            w = f.str_loop(qry,w,w_id+1,qry.length-2);
                            double b1,b2,cost1,cost2;
                            if (qry != null) {
                                if (qry[0].equalsIgnoreCase("select")) {
                                    if (qry[qry.length - 1].equalsIgnoreCase(";")) {
                                        for (prop x : table_list){
                                            if(x.name.contains(qry[f_id+1].toLowerCase())){
                                                dq_idx = table_list.indexOf(x);
                                            }
                                            if(x.name.contains(qry[j_id+1].toLowerCase())){
                                                dr_idx = table_list.indexOf(x);
                                            }
                                        }
                                        if(f_id != -1) {                                   
                                            if (j_id != -1) {
                                                if(u_id != -1){
                                                    b1 = table_list.get(dq_idx).tot_block; b2 = table_list.get(dr_idx).tot_block;
                                                    cost1 = Math.ceil((b1*b2) + b1); cost2 = Math.ceil((b1*b2) + b2);
                                                
                                                    f.pr_nm("Tabel(1) = "+qry[f_id+1]+" \n" + "List Kolom ="+s + " \n") ;
                                                    f.pr_nm("Tabel(2) = "+qry[f_id+1]+" \n" + "List Kolom ="+qry[u_id+1] + " \n QEP 1 \n") ;
                                                    m1 += "PROJECTION "+s+" -- on the fly \n";
                                                    m1 += "JOIN "+qry[f_id+1]+"."+qry[u_id+1]+" = "+qry[j_id+1]+"."+qry[u_id+1]+" -- BNLJ \n";
                                                    m1 += qry[f_id+1].toLowerCase() + "  "+qry[j_id+1].toLowerCase() +" \n";
                                                    m1 += "Cost : " + cost1 + " \n"; f.pr_nm(m1);
                                                
                                                    f.pr_ln("QEP 2 "); m2 += "PROJECTION "+s+" -- on the fly \n";
                                                    m2 += "JOIN "+qry[f_id+1]+"."+qry[u_id+1]+" = "+qry[j_id+1]+"."+qry[u_id+1]+" -- BNLJ \n";
                                                    m2 += qry[j_id+1].toLowerCase() + "  "+qry[f_id+1].toLowerCase() + "\n";
                                                    m2 += "Cost :" + cost2 + " \n"; f.pr_nm(m2);
                                                
                                                    f.pr_nm(" \n QEP Optimal : \n");
                                                    if (cost1<cost2){ f.pr_nm("QEP1");
                                                        wri += " \n "+input_Q + " \n "+ m1;                                              
                                                    }else{f.pr_nm("QEP2");
                                                        wri += " \n "+input_Q + " \n "+ m2;
                                                    }writer.append(wri);writer.close();
                                                }else{
                                                    f.pr_ln("ERROR : MISSING OR IMPROPER PLACEMENT OF USING");
                                                }
                                            }else{
                                                if (w_id == -1){
                                                    cost1 =table_list.get(dq_idx).bfr;
                                                    f.pr_nm("Tabel = "+qry[f_id+1] + " \n"+ "List Kolom ="+s + " \n QEP 1 \n");
                                                    m1 += "PROJECTION "+s+" -- on the fly \n" + "SELECTION "+w+" -- A1 key \n";
                                                    m1 += qry[f_id+1].toLowerCase() + " \n" + "Cost : " + cost1 + " \n";
                                                    f.pr_nm(m1); f.pr_nm(" \n QEP Optimal : 1 \n");
                                                    wri += " \n "+input_Q + " \n "+ m1; writer.append(wri); writer.close();
                                                }else{
                                                    double num,base;
                                                    num = Math.ceil(table_list.get(dq_idx).n/table_list.get(dq_idx).bfr) ;
                                                    base = table_list.get(dq_idx).fanout; cost1 =table_list.get(dq_idx).tot_block/2;
                                                    cost2 = Math.log(Math.ceil(num)) / Math.log(Math.ceil(base));
                                            
                                                    f.pr_nm("Tabel = "+qry[f_id+1] +" \n List Kolom ="+s+ " \n QEP 1 \n");
                                                    m1 += "PROJECTION "+s+" -- on the fly \n" + " SELECTION "+w+" -- A1 key \n ";
                                                    m1 += qry[f_id+1].toLowerCase() + " \n Cost : " + cost1 + " \n ";
                                                    f.pr_nm(m1);
                                                    f.pr_nm("\n QEP 2 \n");
                                                    m2 += "PROJECTION "+s+" -- on the fly \n" + "SELECTION "+w+" -- A2 \n ";
                                                    m2 += qry[f_id+1] + " \n Cost :" + cost2 + " \n "; 
                                                    f.pr_nm(m2);
                                                    f.pr_nm(" \n QEP Optimal : \n");
                                                    if (cost1<cost2){ f.pr_nm("QEP1");
                                                        wri += " \n "+input_Q + " \n "+ m1;                                              
                                                    }else{f.pr_nm("QEP2");
                                                        wri += " \n "+input_Q + " \n "+ m2;
                                                    }writer.append(wri); writer.close();
                                                }
                                            }
                                        }else{
                                            f.pr_ln("ERROR : MISSING FROM ");
                                        }
                                    }else{
                                       f.pr_ln("ERROR : MISSING OR IMPROPER PLACEMENT OF ;"); 
                                    }
                                }else{
                                    f.pr_ln("ERROR : MISSING OR IMPROPER PLACEMENT OF SELECT");
                                }
                            }else{
                                f.pr_ln("ERROR : QUERY IS EMPTY");
                            }
                            if (keyboard.next().equalsIgnoreCase("ya")) { break; }
                        } catch (IOException ex) {
                            Logger.getLogger(Tubes_SBD_1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                case 5:
                    f.pr_ln("Menu 5 : Shared pool \n --------------------");
                    final File sp_file = new File("src/tubes_sbd/shared_pool.txt");
                    try (final Scanner scan = new Scanner(sp_file)) {
                        while(scan.hasNextLine()) {
                            f.pr_ln(scan.nextLine());
                        }
                    }
                  if (keyboard.next().equalsIgnoreCase("ya")) { break; }
                case 6:
                    keluar = true;
                }
            }
        }
    }