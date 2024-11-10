package Composite;


import Composite.Models.Directory;
import Composite.Models.File;

public class Main {
    public static void main(String[] args) {

        Directory root = new Directory("root", "rwx");
        Directory home = new Directory("home", "rwx");
        Directory user = new Directory("user", "rwx");
        Directory tp2 = new Directory("tp2", "rwx");
        File exo1 = new File("exo1.txt", "rw-");
        File exo2 = new File("exo2.txt", "rw-");
        File file1 = new File("file1.txt", "rw-");
        File file2 = new File("file2.txt", "r--");

        root.add(home);
        root.add(user);
        root.add(file1);
        root.add(file2);

        home.add(tp2);

        tp2.add(exo1);
        tp2.add(exo2);

        root.showInfo();
        System.err.println("---------------------");
        root.list();

        System.err.println("---------------------");
        System.out.println("\nNavigating to 'home' directory:");
        Directory currentDir = home.cd("tp2");
        if (currentDir != null) {
            currentDir.showInfo();
            currentDir.list();
        }
        System.err.println("---------------------");
        System.out.println("\nRenaming 'tp2' directory to 'TP2':");
        tp2.rename("TP2");
        tp2.list();
        System.err.println("---------------------");
        tp2.delete();
        tp2.list();
        System.err.println("---------------------");
        home.list();
        System.err.println("---------------------");
        home.delete();
        System.err.println("---------------------");
        home.list();
    }
}


