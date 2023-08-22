import java.util.Scanner;

class Sport {
    public void play() {
        System.out.println("Choose a sport");
    }

    
}

class football extends Sport {
    @Override
    public void play() {
        System.out.println("playing football");
    }
}

class volleyball extends Sport {
    @Override
    public void play() {
        System.out.println("playing volleyball");
    }
}

class handball extends Sport {
    @Override
    public void play() {
        System.out.println("playing handball");
    }
}


public class simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for football, 2 for volleyball, 3 for handball:");
        int choice = scanner.nextInt();

        Sport typeofsport;

        if (choice == 1) {
            typeofsport = new football();
        } else if (choice == 2) {
            typeofsport = new volleyball();
        } else if (choice == 3) {
            typeofsport = new handball();
        } else {
            System.out.println("Harap maaf mempunyai 3 permainan sahaja.");
            typeofsport = new Sport();
        }

        typeofsport.play();

        scanner.close();
    }
}
