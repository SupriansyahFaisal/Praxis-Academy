package demo;

public class Lingkaran extends BangunDatar{

    // jari-jari lingkaran
    float r;
    float luas() {
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }

        float keliling(){
            float keliling = (float) (2 * Math.PI * r);
            System.out.println("Keliling Lingkaran: " + keliling);
            return keliling;
        }
    }
