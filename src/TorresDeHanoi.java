public class TorresDeHanoi {
    public static void main(String[] args) {
        int numDiscos = 3;
        char torreOrigen = 'A';
        char torreDestino = 'C';
        char torreAuxiliar = 'B';

        resolverTorresDeHanoi(numDiscos, torreOrigen, torreDestino, torreAuxiliar);
    }

    public static void resolverTorresDeHanoi(int numDiscos, char torreOrigen, char torreDestino, char torreAuxiliar) {
        if (numDiscos == 1) {
            System.out.println("Mover disco 1 de la torre " + torreOrigen + " a la torre " + torreDestino);
            return;
        }

        resolverTorresDeHanoi(numDiscos - 1, torreOrigen, torreAuxiliar, torreDestino);
        System.out.println("Mover disco " + numDiscos + " de la torre " + torreOrigen + " a la torre " + torreDestino);
        resolverTorresDeHanoi(numDiscos - 1, torreAuxiliar, torreDestino, torreOrigen);
    }
}
