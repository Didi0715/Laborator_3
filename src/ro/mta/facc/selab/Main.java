package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args) {

        Carte c = new Carte("Casa Buddenbrook", "Thomas Mann", 1999, 500);
        Biblioteca bib = new Biblioteca();
        bib.addCarte(c);
        bib.addCarte(new Carte("Codul lui DaVinci", "dan brown", 12, 23));
        bib.addCarte(new Carte("Codul li", "danwn", 2, 3));
        bib.addCarte(new Carte("moara", "slavici", 1900, 100));


        bib.sort();
        System.out.println(bib);


        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
