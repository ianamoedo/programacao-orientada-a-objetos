public class App {
    public static void main(String[] args) throws Exception {
        media(8.0, 7.0, 7.5);

        ordem(0, 150, 200);

        ePrimo(20, 0);

        eSemana(7);

        bissexto(2025);

    }


    public static void media(double ap1, double ap2, double ac) {
        double media = (ap1 + ap2) * 0.4 + ac * 0.2;
        System.out.println(media);

    }

    public static void ordem(int i, int x, int y) {
        for (i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public static void ePrimo(int x, int i) {
        for(i = 2; i < x; i++) {
            if(x % i == 0) {
                System.out.println(i);
                System.out.println("não é primo");
                break;
            } else {
                System.out.println("É primo");
            }
        }

    }





    public static void eSemana(int ca) {
        switch(ca) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("Opção inválida");



        }

    }

    public static void bissexto(int ano) {
        int ver1, ver4, ver400;
        ver1 = ano % 100;
        ver4 = ano % 4;
        ver400 = ano % 400;
        if (ver4 > 0) {
            System.out.println("O ano não é bissexto");
        } else if (ver1 == 0) {
            if (ver400 ==0) {
                System.out.println("O ano é bissexto");
            } else {
                System.out.println("O ano é bissexto");
            }
        }
    }


 }


