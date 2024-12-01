
package DearDiary;

import java.util.Date;

public class Catatan {
    private String judul;
        private Date tanggal;
        private String catatan;

        public Catatan(String judul, Date tanggal, String catatan) {
            this.judul = judul;
            this.tanggal = tanggal;
            this.catatan = catatan;
        }

        public String getJudul() {
            return judul;
        }

        public Date getTanggal() {
            return tanggal;
        }

        public String getCatatan() {
            return catatan;
        }
    }


